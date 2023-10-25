package Repetition.Abstraktion;

public class FilmDVD extends Medium{
    private String regisseur;
    private int laufzeit;
    private double ausleihgebuehr;

    public FilmDVD(String name, boolean entleihstatus, String regisseur, int laufzeit, double ausleihgebuehr) {
        super(name, entleihstatus);
        this.regisseur = regisseur;
        this.laufzeit = laufzeit;
        this.ausleihgebuehr = ausleihgebuehr;
    }

    public void printInformation() {
        System.out.println("regisseur :" + this.regisseur);
        System.out.println("laufzeit :" + this.laufzeit);
        System.out.println("ausleihgebuehr :" + this.ausleihgebuehr);
    }

    public double getGebuehr() {
        return ausleihgebuehr;
    }
}
