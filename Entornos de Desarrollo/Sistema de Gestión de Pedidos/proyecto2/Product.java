public abstract class Product extends PhysicalProd {
    private String name;
    private float price;
    public void Product(String name, float price);
    public String getName();
    public float getPrice();
    public void setName(String name);
    public void setPrice(float price);
    public String toString();
    public float calcPrice();
}
