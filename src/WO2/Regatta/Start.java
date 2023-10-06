package WO2.Regatta;

public class Start {
    public static void main(String[] args) {
        Sailboat boat1 = new Sailboat(1, "Titanic1");
        Sailboat boat2 = new Sailboat(2, "Titanic2");
        Sailboat boat3 = new Sailboat(3, "Titanic3");
        Sailboat boat4 = new Sailboat(4, "Titanic4");
        Sailboat boat5 = new Sailboat(5, "Titanic5");
        Sailboat boat6 = new Sailboat(5, "Titanic6");

        WO2.Regatta.Competition c = new WO2.Regatta.Competition("BBZBL Rennen");

        c.addBoats(boat1);
        c.addBoats(boat2);
        c.addBoats(boat3);
        c.addBoats(boat4);
        c.addBoats(boat5);

        c.start();

        c.printResult();

    }
}
