import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int i=Integer.parseInt(scanner.nextLine());
        int sum=0;
        for (;i<=10;i++){
            sum=n*i;
            System.out.printf("%d X %d = %d\n",n,i,sum);
        }
        if(i>11){
            sum=n*i;
            System.out.printf("%d X %d = %d\n",n,i,sum);
        }

    }
}
