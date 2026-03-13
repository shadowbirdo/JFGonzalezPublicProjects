package endes.gestpedidos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class OrderTest {

    // CP-07: Cálculo de total en pedido sin productos bloqueado
    @Test
    @DisplayName("CP-07: Lanzar IllegalStateException si se calcula total de pedido vacío")
    void testEmptyOrderThrowsException() {
        Client client = new Client("Homer", "homer@aol.com", "Evergreen");
        
        Order emptyOrder = new Order(client); 

        assertThrows(IllegalStateException.class, emptyOrder::calcTotal, "Debería lanzar IllegalStateException detallando que el pedido está vacío");
    }

    // CP-03: Cálculo del total del pedido (Positivo - CsvSource)
    @ParameterizedTest
    @DisplayName("CP-03: Cálculo correcto del total con varios productos")
    @CsvSource({
        "15.0, 10.0, 5.0",   // 10 + 5 = 15
        "25.0, 20.0, 5.0",   // 20 + 5 = 25
        "50.0, 25.0, 25.0"   // 25 + 25 = 50
    })
    void testCalcTotalParameterized(float expected, float p1, float p2) {
        Order order = new Order(new Client("Test", "test@test.es", "Calle"));
        order.addProduct(new PhysicalProd("P1", p1, 0)); // Ajusta según tu constructor
        order.addProduct(new PhysicalProd("P2", p2, 0));

        float total = order.calcTotal();

        assertEquals(expected, total, "El total calculado no coincide con el esperado");
    }

    // CP-10: Rechazo de totales incorrectos (Negativo - ValueSource)
    @ParameterizedTest
    @DisplayName("CP-10: Validar que el total NO coincida con valores erróneos")
    @ValueSource(floats = {50.0f, 60.0f, 0.0f})
    void testCalcTotalIncorrectValues(float incorrectValue) {
        Order order = new Order(new Client("Test", "test@test.es", "Calle"));
        order.addProduct(new PhysicalProd("P1", 20.0f, 0)); // Total real 20
        
        float total = order.calcTotal();

        assertNotEquals(incorrectValue, total, "El total debería ser distinto a este valor incorrecto");
    }
}
