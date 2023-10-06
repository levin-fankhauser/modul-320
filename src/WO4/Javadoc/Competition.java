package WO4.Javadoc;

/**
 * Klasse, die einen Wettkampf erstellt.
 * Enthält den Namen des Wettkampfes und eine ArrayList mit den Schiffen
 *
 * @author Programmiert von Roger Zaugg. Kommentiert von Levin Fankhauser
 * @version 1.0
 */
public class Competition {

    private String name;
    private Ship[] ships = new Ship[5];

    /**
     * Konstruktor der Klasse für die Erstellung eines Wettkampfes.
     *
     * @param name → Name des Wettkampfes
     * @see #name
     */
    public Competition(String name) {
        this.name = name;
    }

    /**
     * Startet das Rennen mit allen Schiffen, die dem Wettkampf hinzugefügt wurden
     * @see #addShip(Ship)
     */
    public void start() {

        for (Ship s : this.ships) {
            if (s != null) {
                s.race();
            }
        }
    }

    /**
     * Methode fügt Schiffe dem Wettkampf hinzu
     *
     * @param ship → Schiff Objekt der Klasse Ship
     */
    public void addShip(Ship ship) {
        for (int i = 0; i < ships.length; i++) {
            if (ships[i] == null) {
                ships[i] = ship;
                break;
            }
        }
    }

    /**
     * Gibt alle Resultate (Nummer, Name und Zeit) der Schiffe aus.
     * @see #ships
     */
    public void printResult() {
        System.out.println("Wettkampf: " + this.name);

        for (Ship s : this.ships) {
            if (s != null) {
                System.out.println("Schiff Nr: " + s.getNr() + " Name: " + s.getName() + " Zeit: " + s.getTime());
            }
        }
    }
}
