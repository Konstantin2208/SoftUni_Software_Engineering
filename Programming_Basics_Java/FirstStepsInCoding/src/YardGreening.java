import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meters=Double.parseDouble(scanner.nextLine());
        double prize=meters*7.61;
        double discount=0.18*prize;
        double finalPrize=prize-discount;
        System.out.printf("The final price is: %f lv.%n",finalPrize);
        System.out.printf("The discount is: %f lv.",discount);
    }
}
