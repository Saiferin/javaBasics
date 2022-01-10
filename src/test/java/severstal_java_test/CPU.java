package severstal_java_test;

public class CPU {

    private String model;
    private String lga;
    private int price;

    public CPU(String model, String lga, int price) {
        this.model = model;
        this.lga = lga;
        this.price = price;
    }

    public CPU() {};

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLga() {
        return lga;
    }

    public void setLga(String lga) {
        this.lga = lga;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CPU: " +
                "model: " + this.model + ", " +
                "LGA: " + this.lga  + ", " +
                "price: " + this.price;
    }
}