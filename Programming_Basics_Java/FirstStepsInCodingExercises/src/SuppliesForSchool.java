import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pens=Integer.parseInt(scanner.nextLine());
        int markers=Integer.parseInt(scanner.nextLine());
        int liters=Integer.parseInt(scanner.nextLine());
        int discount=Integer.parseInt(scanner.nextLine());
        double sum = (pens*5.80)+(markers*7.20)+(liters*1.20);
        double sumWhitDiscount = sum-(sum*(discount/100.0));
        System.out.println(sumWhitDiscount);


    }
}
