import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int sum1=0;
        int sum2=0;
        for (int i = 1;i<=n;i++){
            int numbers1=Integer.parseInt(scanner.nextLine());
            sum1+=numbers1;
        }
        for (int i = 1;i<=n;i++){
            int numbers2=Integer.parseInt(scanner.nextLine());
            sum2+=numbers2;
        }
        if (sum1==sum2){
            System.out.printf("Yes, sum = %d",sum1);
        } else if (sum1!=sum2) {
            int diff=0;
            if (sum1>sum2){
                diff=sum1-sum2;
            }else {
                diff=sum2-sum1;
            }
            System.out.printf("No, diff = %d",diff);
        }
    }
}
