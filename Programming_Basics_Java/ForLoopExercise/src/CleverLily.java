import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lilyAge=Integer.parseInt(scanner.nextLine());
        double peralnq=Double.parseDouble(scanner.nextLine());
        int toyPrise=Integer.parseInt(scanner.nextLine());
        int toyCounter=0;
        double sum=0;
        double moneyPrize=10;
        int broherCounter=0;
        for (int i =1;i<=lilyAge;i++){
            if (i%2==0){
                sum=sum+moneyPrize;
                moneyPrize+=10;
                broherCounter++;
            } else if(i%2!=0){
                toyCounter++;
            }
        }
        sum=sum-broherCounter;
        sum=sum+(toyCounter*toyPrise);
        if (sum>=peralnq){
            double moneyLeft=sum-peralnq;
            System.out.printf("Yes! %.2f",moneyLeft);
        }else {
            double diff=peralnq-sum;
            System.out.printf("No! %.2f",diff);
        }
    }
}
