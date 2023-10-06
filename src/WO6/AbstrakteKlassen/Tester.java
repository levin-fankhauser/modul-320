package WO6.AbstrakteKlassen;

public class Tester {
    public static void main(String[] args) {
        UsedCar usedCar = new UsedCar("Toyota Supra", 80000, 73000);
        System.out.println("Used Car: " + usedCar.getPrice());

        CrashedCar crashedCar = new CrashedCar("Tesla", 45000, 1);
        System.out.println("Crashed Car: " + crashedCar.getPrice());

        System.out.println("--------------------");

        MobilityCar mobilityCar = new MobilityCar("Porsche GT3 RS", 350000, 3);
        System.out.println("Um den " + mobilityCar.model + " für " + mobilityCar.getDays() + " Tage zu mieten müssen sie folgenden Preis bezahlen: " + mobilityCar.getPrice());
    }
}
