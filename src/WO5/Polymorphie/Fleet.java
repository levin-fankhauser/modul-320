package WO5.Polymorphie;

import java.util.ArrayList;

public class Fleet {
    private ArrayList<Car> cars = new ArrayList<Car>();

    public void addCar(Car car){
        this.cars.add(car);
    }

    public void print(){
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Model: " + this.cars.get(i).getModel() + "\nPrice: " + this.cars.get(i).getPrice() + "\n----------------------------");
        }
    }
}
