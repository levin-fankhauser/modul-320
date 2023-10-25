package Repetition.Abstraktion;

import java.util.ArrayList;

public class Bibliothek {
    private ArrayList<Medium> medien = new ArrayList<Medium>();

    public void addMedium(Medium m) {
        this.medien.add(m);
    }

    public void showAllMedia() {
        for (int i = 0; i < medien.size(); i++) {
            System.out.println(i + ": " + this.medien.get(i).getName());
        }
    }

    public void showBorrowedMedia() {
        for (int i = 0; i < medien.size(); i++) {
            if (medien.get(i).getEntleihstatus()) {
                System.out.println(i + ": " + this.medien.get(i).getName());
            }
        }
    }
    
    public double calcAusleihgebuehr() {
        double total = 0;
        for (int i = 0; i < medien.size(); i++) {
            total += medien.get(i).getGebuehr();
        }
        return total;
    }
}
