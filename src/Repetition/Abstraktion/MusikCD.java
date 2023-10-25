package Repetition.Abstraktion;

public class MusikCD extends Medium{
    private String interpret;
    private int anzahlLieder;
    private double ausleihgebuehr;

    public MusikCD(String name, boolean entleihstatus, String interpret, int anzahlLieder, double ausleihgebuehr) {
        super(name, entleihstatus);
        this.interpret = interpret;
        this.anzahlLieder = anzahlLieder;
        this.ausleihgebuehr = ausleihgebuehr;
    }

    public void printInformation() {
        System.out.println("interpret :" + this.interpret);
        System.out.println("anzahlLieder :" + this.anzahlLieder);
        System.out.println("ausleihgebuehr :" + this.ausleihgebuehr);
    }

    public double getGebuehr() {
        return ausleihgebuehr;
    }
}
