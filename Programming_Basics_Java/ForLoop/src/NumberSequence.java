import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int minNumber=100000000;
        int maxNumber=-100000000;
        for (int i = 1;i<=n;i++){
            int numbers=Integer.parseInt(scanner.nextLine());
            if(numbers<minNumber){
                minNumber=numbers;
            }
            if (numbers>maxNumber) {
                maxNumber=numbers;
            }

        }
        System.out.printf("Max number: %d\n",maxNumber);
        System.out.printf("Min number: %d",minNumber);
    }
}
