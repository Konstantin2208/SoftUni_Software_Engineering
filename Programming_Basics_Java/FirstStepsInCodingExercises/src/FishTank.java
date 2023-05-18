import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length=Integer.parseInt(scanner.nextLine());
        int width=Integer.parseInt(scanner.nextLine());
        int tall=Integer.parseInt(scanner.nextLine());
        double percent= Double.parseDouble(scanner.nextLine())/100;
        int obem= length*width*tall;
        double liters= obem*0.001;
        double neededLiters=liters*(1-percent);
        System.out.println(neededLiters);
    }
}
