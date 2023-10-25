package Repetition.Abstraktion;

public class Medium {
    private String name;
    private boolean entleihstatus;

    public Medium(String name, boolean entleihstatus) {
        this.name = name;
        this.entleihstatus = entleihstatus;
    }

    public boolean getEntleihstatus() {
        return entleihstatus;
    }

    public void setEntleihstatus(boolean entleihstatus) {
        this.entleihstatus = entleihstatus;
    }

    public void printInformation() {
        System.out.println("name :" + this.name);
        System.out.println("entleihstatus :" + this.entleihstatus);
    }

    public double getGebuehr() {
        return 0;
    }

    public String getName() {
        return name;
    }
}
