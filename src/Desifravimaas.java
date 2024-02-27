import java.util.Scanner;

//rhxhzzau eaqpjyrgsmib
//rhxhzzaudjikrpolekca
public class Desifravimaas {
//    w a c a k
    static String dekripshenas(String kriptavimui, char[] key) {
        StringBuilder decryptedText = new StringBuilder();

        for (int i = 0, j = 0; i < kriptavimui.length(); i++) {
            char currentChar = kriptavimui.charAt(i);

            if (Character.isLetter(currentChar)) {
                char decryptedChar = (char) ((currentChar - key[j] + 26) % 26 + 'A');
                decryptedText.append(decryptedChar);

                j = (j + 1) % key.length;
            } else {

                decryptedText.append(currentChar);
            }
        }

        return decryptedText.toString();
    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tekstas:");
        String kriptavimui = scanner.nextLine().toUpperCase();

        System.out.println("key:");
        String keyStringas = scanner.nextLine().toUpperCase();
        char[] key = keyStringas.toCharArray();

        String decryptedText = dekripshenas(kriptavimui, key);

        System.out.println("Tekstas: " + decryptedText);
    }
}
