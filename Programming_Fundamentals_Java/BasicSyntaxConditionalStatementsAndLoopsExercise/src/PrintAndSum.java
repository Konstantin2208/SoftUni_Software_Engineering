import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i=Integer.parseInt(scanner.nextLine());
        int n =Integer.parseInt(scanner.nextLine());
        int sum =0;
        for (;i<=n;i++){
            System.out.print(i+" ");
            sum+=i;
        }
        System.out.printf("%nSum: %d",sum);
    }
}
