public class IceCream {
    private String flavor;
    private String brand;
    private double price;
    private String iceCreamType;
    private int feedback;

    public void setFeedback(int feedback){
        this.feedback = feedback;
    }

    public double calculateOrder(int quantity){
        return quantity * this.price;
    }

    public IceCream(String flavor, String brand, double price, String iceCreamType, int feedback) {
        this.flavor = flavor;
        this.brand = brand;
        this.price = price;
        this.iceCreamType = iceCreamType;
        this.feedback = feedback;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIceCreamType() {
        return iceCreamType;
    }

    public void setIceCreamType(String iceCreamType) {
        this.iceCreamType = iceCreamType;
    }
}
