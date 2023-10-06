package WO6.Interfaces;

public class Axe implements IWeapon{
    public int use(int ap) {
        int hit = (int) (ap * Math.random());;
        return hit;
    }
}
