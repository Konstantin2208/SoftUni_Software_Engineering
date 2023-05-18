import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nailon = Integer.parseInt(scanner.nextLine())+2;
        int paint = Integer.parseInt(scanner.nextLine());
        int razreditel = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
       double totalpaint = paint+(paint*0.10);
       double matirials= (nailon*1.50)+(totalpaint*14.50)+(razreditel*5.00)+0.40;
       double workersPrize=(matirials*0.30)*hours;
       double finalPrize= matirials+workersPrize;
       System.out.println(finalPrize);


    }
}
