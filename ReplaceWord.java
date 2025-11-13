import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the word to replace: ");
        String oldWord = scanner.next();

        System.out.print("Enter the new word: ");
        String newWord = scanner.next();

        String modifiedSentence = sentence.replace(oldWord, newWord);

        System.out.println("Modified sentence: " + modifiedSentence);

        scanner.close();
    }
}
