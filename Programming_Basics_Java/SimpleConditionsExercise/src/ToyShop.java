import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double tripPrize= Double.parseDouble(scanner.nextLine());
        int puzzels= Integer.parseInt(scanner.nextLine());
        int dools= Integer.parseInt(scanner.nextLine());
        int bears= Integer.parseInt(scanner.nextLine());
        int minions= Integer.parseInt(scanner.nextLine());
        int trucks= Integer.parseInt(scanner.nextLine());
        double sum=(puzzels*2.60)+(dools*3)+(bears*4.10)+(minions*8.20)+(trucks*2);
        int items= puzzels+dools+bears+minions+trucks;
        if(items>=50){
            sum=sum-(sum*0.25);
        }
        double finalSum=sum-(sum*0.10);
        if(finalSum>=tripPrize){
            double change=finalSum-tripPrize;
            System.out.printf("Yes! %.2f lv left.",change);
        }else {
            double notEnough=tripPrize-finalSum;
            System.out.printf("Not enough money! %.2f lv needed.",notEnough);
        }
    }
}
