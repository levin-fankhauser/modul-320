package Repetition.Fachklassen;

public class Tester {
    public static void main(String[] args) {
        Recyhof recyhof = new Recyhof();
        Abfall abfall1 = new Abfall(true, 5, 3);
        Abfall abfall2 = new Abfall(false, 4, 3);
        Abfall abfall3 = new Abfall(true, 6, 3);
        Abfall abfall4 = new Abfall(false, 8, 3);
        Abfall abfall5 = new Abfall(true, 10, 3);

        recyhof.addAbfall(abfall1);
        recyhof.addAbfall(abfall2);
        recyhof.addAbfall(abfall3);
        recyhof.addAbfall(abfall4);
        recyhof.addAbfall(abfall5);

        System.out.println("Gesamtwert" + recyhof.getGesamtwert());
        System.out.println("Metallwert" + recyhof.getMetallwert());
    }
}
