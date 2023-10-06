package WO6.AbstrakteKlassen;

public class CrashedCar extends Car {

    private int damageLevel;

    public CrashedCar(String model, double price, int damageLevel) {
        super(model, price);
        this.damageLevel = damageLevel;
    }

    public double getPrice() {
        if (this.damageLevel == 0){
            return price *  0.9;
        } else if (this.damageLevel == 1) {
            return price * 0.5;
        } else if (this.damageLevel == 2) {
            return 0;
        }
        return price;
    }

    public int getDamageLevel() {
        return damageLevel;
    }

    public void setDamageLevel(int damageLevel) {
        this.damageLevel = damageLevel;
    }
}
