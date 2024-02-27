import java.util.Scanner;



public class sifravimas {

    sifravimas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teksto vedimas:");
        String vedimas = scanner.nextLine();

        System.out.println("Key:");
        String keyword = scanner.nextLine().toUpperCase();

        char[] charArray = vedimas.toCharArray();

        System.out.println("Orginalas:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }

        System.out.println("\nkriptuotas:");
        char[] Kriptuotas = encryptVigenere(charArray, keyword);
        for (char c : Kriptuotas) {
            System.out.print(c + " ");
        }
    }




    private static char[] encryptVigenere(char[] charArray, String keyword) {
        char[] resultArray = new char[charArray.length];
        int keywordLength = keyword.length();

        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];

            int shift;
            if (Character.isLetter(currentChar)) {
                shift = keyword.charAt(i % keywordLength) - 'A';
            } else {
                shift = keyword.charAt(i % keywordLength) - 'A';
            }
            resultArray[i] = shiftChar(currentChar, shift);
        }

        return resultArray;
    }

    private static char shiftChar(char c, int shift) {
        if (Character.isUpperCase(c)) {
            return (char) ((c + shift - 'A' + 26) % 26 + 'A');
        } else if (Character.isLowerCase(c)) {
            return (char) ((c + shift - 'a' + 26) % 26 + 'a');
        } else if (Character.isDigit(c)) {
            return (char) ((c + shift - '0' + 10) % 10 + '0');
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        new sifravimas();
    }
}

//    uuttayat nlideclutksd