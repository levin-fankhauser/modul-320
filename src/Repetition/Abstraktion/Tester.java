package Repetition.Abstraktion;

public class Tester {
    public static void main(String[] args) {
        Bibliothek bibliothek = new Bibliothek();

        Buch b1 = new Buch("potter", true, "TObi", "bbzbl", 35, "sdbf");
        Buch b2 = new Buch("potter2", false, "TObi", "bbzbl", 35, "sdbf");

        FilmDVD f1 = new FilmDVD("barbie", true, "cem", 90, 3.10);
        FilmDVD f2 = new FilmDVD("barbie2", false, "cem", 90, 3.10);

        MusikCD c1 = new MusikCD("???", true, "seth", 17, 3.50);
        MusikCD c2 = new MusikCD("!!!", false, "seth", 17, 3.50);

        bibliothek.addMedium(b1);
        bibliothek.addMedium(b2);

        bibliothek.addMedium(f1);
        bibliothek.addMedium(f2);

        bibliothek.addMedium(c1);
        bibliothek.addMedium(c2);

        System.out.println("Alle Medien in der Bibliothek");
        bibliothek.showAllMedia();

        System.out.println();

        System.out.println("Ausgeliehene Medien in der Bibliothek");
        bibliothek.showBorrowedMedia();

        System.out.println();

        System.out.println("Aktuelle Gebühren der ausgeliehenen Medien");
        System.out.println(bibliothek.calcAusleihgebuehr());
    }
}
