public class DigitalProd extends Product{
    private String license;
    private float sizeInMb;

    public DigitalProd(String name, float price, String license, float sizeInMb){
        super(name, price);
        this.license = license;
        this.sizeInMb = sizeInMb;
    }

    public String getLicense() {
        return license;
    }

    public float getSizeInMb() {
        return sizeInMb;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public void setSizeInMb(float sizeInMb) {
        this.sizeInMb = sizeInMb;
    }

    @Override
    public String toString(){
        return super.toString() + " License: " + this.license + " | Size (MB): " + this.sizeInMb;
    }
    
}
