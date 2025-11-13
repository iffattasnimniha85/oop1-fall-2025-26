public class Taskk2 {
    public static void main(String[] args) {
        double originalPrice = 250;
        double discount = 15; 

        double finalPrice = originalPrice - (originalPrice * discount / 100);

        System.out.printf("Final price after discount:", finalPrice);
    }
}

