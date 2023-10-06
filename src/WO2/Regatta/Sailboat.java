package WO2.Regatta;

import java.util.Random;

public class Sailboat {

    private int number;
    private String name;
    private int time;

    public Sailboat(int number, String name){
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void race(){
        Random number = new Random();
        this.time = number.nextInt(300, 600);
    }
}
