package WO5.Vererbung;

public class Tester {
    public static void main(String[] args) {
        UsedCar usedCar = new UsedCar("Toyota Supra", 80000, 73000);
        System.out.println("Used Car: " + usedCar.getPrice());

        CrashedCar crashedCar = new CrashedCar("Tesla", 45000, 1);
        System.out.println("Crashed Car: " + crashedCar.getPrice());
    }
}
