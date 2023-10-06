package WO5.Polymorphie;

public class CrashedCar extends Car {

    private int damageLevel;

    public CrashedCar(String model, double price, int damageLevel) {
        super(model, price);
        this.damageLevel = damageLevel;
    }

    public double getPrice() {
        if (this.damageLevel == 0){
            return super.getPrice() * 0.9;
        } else if (this.damageLevel == 1) {
            return super.getPrice() * 0.5;
        } else if (this.damageLevel == 2) {
            return super.getPrice() * 0;
        }
        return super.getPrice();
    }

    public int getDamageLevel() {
        return damageLevel;
    }

    public void setDamageLevel(int damageLevel) {
        this.damageLevel = damageLevel;
    }
}
