package endes.gestpedidos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
    // CP-01: Correcto cálculo del precio de los productos digitales
    @Test
    @DisplayName("CP-01: DigitalProd debe aplicar un 5% de descuento")
    void testDigitalProdCalcPrice() {
        DigitalProd digitalProduct = new DigitalProd("Video Topo", 10.0f, "Pro", 500.0f);

        float finalPrice = digitalProduct.calcPrice();

        assertEquals(9.5f, finalPrice, "El precio con descuento debería ser 9.5f");
    }

    // CP-02: Correcto cálculo del precio de los productos físicos con envío
    @Test
    @DisplayName("CP-02: PhysicalProd debe sumar el coste de envío al precio base")
    void testPhysicalProdCalcPrice() {
        PhysicalProd physicalProduct = new PhysicalProd("Detergente", 20.0f, 10.0f);

        float finalPrice = physicalProduct.calcPrice();

        assertEquals(30.0f, finalPrice, "El precio total debería ser 30.0f (20.0f + 10.0f)");
    }

    // CP-06: Creación de producto con precio negativo bloqueada
    @Test
    @DisplayName("CP-06: Lanzar IllegalArgumentException si el precio es negativo")
    void testNegativePriceThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            
            new PhysicalProd("Error Product", -5.0f, 10.0f);
            
        }, "Debería lanzar IllegalArgumentException al intentar poner un precio negativo");
    }
}
