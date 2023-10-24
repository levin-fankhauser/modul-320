package Repetition.Fachklassen;

public class Abfall {
    private boolean metall;
    private double kgPreis;
    private double kg;

    public Abfall(boolean metall, double kgPreis, double kg) {
        this.metall = metall;
        this.kgPreis = kgPreis;
        this.kg = kg;
    }

    public boolean isMetall() {
        if (this.metall) {
            return true;
        } else {
            return false;
        }
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    public double getWert() {
        return this.kg * this.kgPreis;
    }
}
