import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int evenSum=0;
        int oddSum=0;
        for (int i =1;i<=n;i++){
            int numbers=Integer.parseInt(scanner.nextLine());
            if (i%2==0){
                evenSum+=numbers;
            } else  {
                oddSum+=numbers;
            }
        }
        if (evenSum==oddSum){
            System.out.println("Yes");
            System.out.printf("Sum = %d",evenSum);
        }else {
            if (evenSum>oddSum){
                int diff=evenSum-oddSum;
                System.out.println("No");
                System.out.printf("Diff = %d",diff);
            }else {
                int diff=oddSum-evenSum;
                System.out.println("No");
                System.out.printf("Diff = %d",diff);
            }

        }
    }
}
