package WO6.AbstrakteKlassen;

public abstract class Car {
    protected String model;
    protected double price;

    public Car(String model, double price){
        this.model = model;
        this.price = price;
    }

    protected abstract double getPrice();
}
