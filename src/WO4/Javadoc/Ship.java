package WO4.Javadoc;

/**
 * Klasse, die ein Schiff Objekt erstellt.
 * Enthält einen Namen, eine Nummer und die Zeit.
 *
 * @author Programmiert von Roger Zaugg. Kommentiert von Levin Fankhauser
 * @version 1.0
 */
public class Ship {

    private int nr;
    private String name;
    private int time;

    /**
     * Konstruktor der ein Schiff Objekt mit Name und Nummer erstellt.
     *
     * @param nr   → Nummer vom Schiff
     * @param name → Name vom Schiff
     */
    public Ship(int nr, String name) {
        this.nr = nr;
        this.name = name;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Erstellt random eine Rennzeit für das Schiff zwischen 300 und 600
     */
    public void race() {
        int min = 300;
        int max = 600;
        this.time = (int) (Math.random() * (max - min + 1)) + min;
    }

    public int getTime() {
        return time;
    }

}
