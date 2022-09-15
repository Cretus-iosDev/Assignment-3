import java.util.Scanner;

public class StringOccurence {
    public static void main(String[] args) {

        int i = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter a Letter: ");
        char letter = scanner.next().charAt(0);
        scanner.close();

        for (i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == letter) {
                break;
            }
        }
        if (i < sentence.length() - 1) {
            System.out.print(sentence.substring(i + 1));
        } else {
            System.out.print("The letter doesn't exist in the sentence");
        }
    }
}
