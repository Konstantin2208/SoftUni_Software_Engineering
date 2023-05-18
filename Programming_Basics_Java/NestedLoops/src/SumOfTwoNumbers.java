import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=Integer.parseInt(scanner.nextLine());
        int b=Integer.parseInt(scanner.nextLine());
        int n=Integer.parseInt(scanner.nextLine());
        int combinationCounter=0;
        boolean isValid=true;
        for (int i=a;i<=b;i++){
            if (!isValid){
                break;
            }
            for (int d=a;d<=b;d++){
                combinationCounter++;
                if(i+d==n){
                    System.out.printf("Combination N:%d (%d + %d = %d)",combinationCounter,i,d,n);
                    isValid=false;
                    break;

                }

            }
        }
        if (isValid){
            System.out.printf("%d combinations - neither equals %d",combinationCounter,n);
        }
    }
}
