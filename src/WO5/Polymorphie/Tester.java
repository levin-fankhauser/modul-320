package WO5.Polymorphie;

public class Tester {
    public static void main(String[] args) {
        Car usedCar = new UsedCar("Toyota Supra", 80000, 10000);
        Car crashedCar = new CrashedCar("Tesla", 45000, 0);

        Fleet fleet = new Fleet();

        fleet.addCar(usedCar);
        fleet.addCar(crashedCar);

        fleet.print();
    }
}
