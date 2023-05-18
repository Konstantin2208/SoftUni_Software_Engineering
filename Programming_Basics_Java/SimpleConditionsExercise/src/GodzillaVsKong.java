import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget= Double.parseDouble(scanner.nextLine());
        int statist = Integer.parseInt(scanner.nextLine());
        double prizeClothing =Double.parseDouble(scanner.nextLine());
        double decor= budget*0.10;
        double clothing=statist*prizeClothing;
        if (statist>150){
            clothing=clothing-(clothing*0.10);
        }
        double finalPrize=decor+clothing;
        if (finalPrize>budget){
            double notEnough=finalPrize-budget;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",notEnough);
        }else {
            double change=budget-finalPrize;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",change);
        }
    }
}
