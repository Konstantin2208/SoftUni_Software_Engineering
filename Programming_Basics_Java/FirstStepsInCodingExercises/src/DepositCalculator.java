import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositSum = Double.parseDouble(scanner.nextLine());
        int duration=Integer.parseInt(scanner.nextLine());
        double yearPercent= Double.parseDouble(scanner.nextLine())/100;
        double sum= depositSum+duration*((depositSum*yearPercent)/12);
        System.out.println(sum);





    }
}
