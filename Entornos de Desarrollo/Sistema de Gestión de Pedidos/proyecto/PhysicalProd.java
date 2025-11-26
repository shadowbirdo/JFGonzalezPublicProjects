public class PhysicalProd extends Product{
    private float deliveryFee;

    public PhysicalProd(String name, float price, float deliveryFee){
        super(name,price);
        this.deliveryFee = deliveryFee;
    }

    public float getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(float deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public String toString(){
        return super.toString() + "| Delivery fee: " + deliveryFee;
    }

    public float calcPrice(){
        return super.getPrice() + deliveryFee;
    }
}