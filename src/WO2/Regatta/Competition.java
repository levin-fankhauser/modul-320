package WO2.Regatta;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.zip.ZipFile;

public class Competition {
    private String name;
    private Sailboat[] sailboats = new Sailboat[5];

    public Competition(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addBoats(Sailboat sailboat) {
        for (int i = 0; i < sailboats.length; i++) {
            if (this.sailboats[i] == null) {
                this.sailboats[i] = sailboat;
                break;
            }
        }
    }

    public void start() {
        for (int i = 0; i < sailboats.length; i++) {
            if (sailboats[i] != null) {
                sailboats[i].race();
            }

        }
    }

    public void printResult() {
        System.out.println("Wettkampf: " + getName());
        for (int i = 0; i < sailboats.length; i++) {
            if (sailboats[i] != null) {
                System.out.print("Schiff Nr. " + sailboats[i].getNumber());
                System.out.print("\tName: " + sailboats[i].getName());
                System.out.println("\tZeit: " + sailboats[i].getTime());
            }
        }
    }
}
