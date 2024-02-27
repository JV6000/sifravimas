import java.util.Scanner;

public class AcDesifravimas {

    private char[] key;

    public AcDesifravimas(String key) {
        this.key = key.toUpperCase().toCharArray();
    }

    private String dekpritaviams(String kriptuotas) {
        StringBuilder dekpriptuotas = new StringBuilder();

        for (int i = 0, j = 0; i < kriptuotas.length(); i++) {
            char currentChar = kriptuotas.charAt(i);

            if (Character.isLetter(currentChar)) {
                char decryptedChar = (char) ((currentChar - key[j % key.length] + 26) % 26 + 'A');
                dekpriptuotas.append(decryptedChar);

                j = (j + 1) % key.length;
            } else {
                dekpriptuotas.append(currentChar);
            }
        }

        return dekpriptuotas.toString();
    }

    public void dekriptuotasirprintinimas() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kriptuotas tekstas:");
        String kriptuotasTekstas = scanner.nextLine().toUpperCase();

        String dekriptuotas = dekpritaviams(kriptuotasTekstas);

        System.out.println("Issifruotas: " + dekriptuotas);
    }

    void Main(){

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Raktas:");
        String key = scanner.nextLine();

        AcDesifravimas acDesifravimas = new AcDesifravimas(key);
        acDesifravimas.dekriptuotasirprintinimas();
    }
}
