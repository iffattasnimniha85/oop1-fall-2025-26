public class ConvertCase {
    public static void main(String[] args) {
        String sentence = "Hello World!"; 

        String upperCase = sentence.toUpperCase();
        String lowerCase = sentence.toLowerCase();

        System.out.println("Original: " + sentence);
        System.out.println("Uppercase: " + upperCase);
        System.out.println("Lowercase: " + lowerCase);
    }
}
