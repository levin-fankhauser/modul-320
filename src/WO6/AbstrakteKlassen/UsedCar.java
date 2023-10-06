package WO6.AbstrakteKlassen;

public class UsedCar extends Car {
    private int mileage;

    public UsedCar(String model, double price, int mileage) {
        super(model, price);
        this.mileage = mileage;
    }

    public double getPrice() {
        return price - (price * (mileage * (0.0005 / 100)));
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
