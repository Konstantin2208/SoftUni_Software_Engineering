import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int graphicsCards= Integer.parseInt(scanner.nextLine());
        int procesors= Integer.parseInt(scanner.nextLine());
        int ram= Integer.parseInt(scanner.nextLine());
        double cardsPrize=graphicsCards*250;
        double fullPrize=cardsPrize+(procesors*(cardsPrize*0.35))+(ram*(cardsPrize*0.10));
        if (graphicsCards>procesors){
            fullPrize=fullPrize-(fullPrize*0.15);
        }
        if (budget>=fullPrize){
            double change=budget-fullPrize;
            System.out.printf("You have %.2f leva left!",change);
        }else {
            double notEnough=fullPrize-budget;
            System.out.printf("Not enough money! You need %.2f leva more!",notEnough);
        }
    }
}
