import java.util.List;
import java.util.ArrayList;

public class Order {
    
    /**
     * Gestionar pedidos, donde cada pedido está asociado a un cliente y puede contener
     * uno o varios productos (usa agregación o composición).
     */

    /**
     * Calcular el importe total del pedido, teniendo en cuenta, por ejemplo:
     * ○​ IVA o descuentos para productos digitales.
     * ○​ Coste de envío para productos físicos.
     */

    private Client client;
    private List<Product> products;
    
    public Order(Client client){
        this.client = client;
        this.products = new ArrayList<>();
    }

    public void Order(Client client, List<Product> products){
        this.client = client;
        this.products = products;
    }

    public void addProduct(Product productToAdd){
        this.products.add(productToAdd);
    }

    public float calcTotal(){
        float totalPrice = 0;
        return totalPrice;
    }

    public String showSummary(){
    
        /**
         * Mostrar un resumen del pedido, incluyendo:
         * ○​ Datos del cliente.
         * ○​ Productos comprados.
         * ○​ Importe total.
         */

        String summary = "";
        return summary;
    }
}
