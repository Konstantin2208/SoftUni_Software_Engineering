import java.util.Scanner;

public class ComputerFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        double totalReating=0;
        double totalSales=0;
        for (int i =0;i<n;i++){
            int number=Integer.parseInt(scanner.nextLine());
            int rating=number%10;
            totalReating+=rating;
            int sales=number/10;
            switch (rating) {
                case 2:
                    totalSales += 0;
                    break;
                case 3:
                    totalSales += sales * 0.5;
                    break;
                case 4:
                    totalSales += sales * 0.7;
                    break;
                case 5:
                    totalSales += sales * 0.85;
                    break;
                case 6:
                    totalSales += sales;
                    break;

            }
        }
        System.out.printf("%.2f\n",totalSales);
        double averageRating=totalReating/n;
        System.out.printf("%.2f",averageRating);
    }
}
