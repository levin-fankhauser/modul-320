package WO6.Interfaces;

public class Dagger implements IWeapon{
    public int use(int ap) {
        int hit1 = (int) ((ap / 2) * Math.random());
        int hit2 = (int) ((ap / 2) * Math.random());
        return hit1 + hit2;
    }
}
