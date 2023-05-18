import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= Integer.parseInt(scanner.nextLine());
        int maxNumber=-1000000000;
        int sum=0;
        for (int i = 1;i<=n;i++){
            int numbers=Integer.parseInt(scanner.nextLine());
            if (numbers>maxNumber){
                maxNumber=numbers;
            }
            sum+=numbers;
        }
        sum=sum-maxNumber;
        if (sum==maxNumber){
            System.out.println("Yes");
            System.out.printf("Sum = %d",sum);
        } else if (maxNumber>sum) {
            int diff=maxNumber-sum;
            System.out.println("No");
            System.out.printf("Diff = %d",diff);
        }else if (maxNumber<sum) {
            int diff=sum-maxNumber;
            System.out.println("No");
            System.out.printf("Diff = %d",diff);
        }

    }
}
