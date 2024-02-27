import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1 - Sifravimas \n2 - Desifravimas\n" +
                    "3 - ACII Sifravimas \n4 - ACII Desifravimas");
            Scanner scanner = new Scanner(System.in);
            int pasi = scanner.nextInt();

            switch (pasi) {
                case 1:
                    sifravimas Sif = new sifravimas();

                    break;

                case 2:
                    Desifravimaas des = new Desifravimaas();

                    break;

                case 3:
                    ACISIFRUOTE ac = new ACISIFRUOTE();

                    break;

                case 4:

                    break;

                default:
                    System.out.println("BLOGAS PASIRINKIMAS");
            }
        }

    }
}
