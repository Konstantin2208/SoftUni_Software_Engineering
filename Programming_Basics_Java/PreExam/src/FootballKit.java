import java.util.Scanner;

public class FootballKit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double shirtPrice=Double.parseDouble(scanner.nextLine());
        double neededSum=Double.parseDouble(scanner.nextLine());
        double shortsPrice=shirtPrice*0.75;
        double socksPrice=shortsPrice*0.20;
        double bootsPrice=(shirtPrice+shortsPrice)*2;
        double totalPrice=shirtPrice+shortsPrice+socksPrice+bootsPrice;
        totalPrice=totalPrice-(totalPrice*0.15);
        if (neededSum<=totalPrice){
            System.out.printf("Yes, he will earn the world-cup replica ball!\n");
            System.out.printf("His sum is %.2f lv.",totalPrice);
        }else {
            double moreMoney= neededSum-totalPrice;
            System.out.printf("No, he will not earn the world-cup replica ball.\n");
            System.out.printf("He needs %.2f lv. more.",moreMoney);
        }

    }
}
