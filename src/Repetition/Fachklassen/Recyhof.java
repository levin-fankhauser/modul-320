package Repetition.Fachklassen;

import java.util.ArrayList;

public class Recyhof {
    private ArrayList<Abfall> abfaelle = new ArrayList<Abfall>();

    public void addAbfall(Abfall a) {
        abfaelle.add(a);
    }

    public double getGesamtwert() {
        double total = 0;
        for (int i = 0; i < abfaelle.size(); i++) {
            total += abfaelle.get(i).getWert();
        }
        return total;
    }

    public double getMetallwert() {
        double total = 0;
        for (int i = 0; i < abfaelle.size(); i++) {
            if (abfaelle.get(i).isMetall()) {
                total += abfaelle.get(i).getWert();
            }
        }
        return total;
    }
}
