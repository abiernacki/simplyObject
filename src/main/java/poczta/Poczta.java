package poczta;

import java.util.Scanner;

public class Poczta {

    private String nadawca;
    private String odbiorca;
    private String temat;
    private String treść;

    public void wypisz(Poczta poczta){
        System.out.println("Nadawca: " + nadawca);
        System.out.println("Odbiorca: " + odbiorca);
        System.out.println("Temat: " + temat);
        System.out.println("Treść: " + treść);
    }

    public void wczytaj(Poczta poczta){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj nadawcę: ");
        poczta.nadawca = scanner.nextLine();
        System.out.println("Podaj odbiorcę: ");
        poczta.odbiorca = scanner.nextLine();
        System.out.println("Podaj temat: ");
        poczta.temat = scanner.nextLine();
        System.out.println("Podaj treść: ");
        poczta.treść = scanner.nextLine();
    }

    public String getNadawca() {
        return nadawca;
    }

    public String getOdbiorca() {
        return odbiorca;
    }

    public String getTemat() {
        return temat;
    }

    public String getTreść() {
        return treść;
    }
}
