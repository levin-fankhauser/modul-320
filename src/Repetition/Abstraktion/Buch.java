package Repetition.Abstraktion;

public class Buch extends Medium{

    private String autor;
    private String verlag;
    private int anzahlSeiten;
    private String isbn;

    public Buch(String name, boolean entleihstatus, String autor, String verlag, int anzahlSeiten, String isbn) {
        super(name, entleihstatus);
        this.autor = autor;
        this.verlag = verlag;
        this.anzahlSeiten = anzahlSeiten;
        this.isbn = isbn;
    }

    public void printInformation() {
        System.out.println("autor :" + this.autor);
        System.out.println("verlag :" + this.verlag);
        System.out.println("anzahlSeiten :" + this.anzahlSeiten);
        System.out.println("isbn :" + this.isbn);
    }
}
