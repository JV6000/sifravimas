
import java.util.Scanner;

public class ACISIFRUOTE {



    private static String kriptavimas(String Tekstas, char[] key) {
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0, j = 0; i < Tekstas.length(); i++) {
            char currentChar = Tekstas.charAt(i);

            if (Character.isLetter(currentChar)) {
                char encryptedChar = (char) ((currentChar + key[j % key.length] - 65) % 26 + 65);
                encryptedText.append(encryptedChar);

                j = (j + 1) % key.length;
            } else {
                encryptedText.append(currentChar);
            }
        }

        return encryptedText.toString();
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tekstas:");
        String Tekstas = scanner.nextLine().toUpperCase();

        System.out.println("Raktas:");
        String keyString = scanner.nextLine().toUpperCase();
        char[] key = keyString.toCharArray();

        String encryptedText = kriptavimas(Tekstas, key);

        System.out.println("Kriptuotas: " + encryptedText);
    }
}
