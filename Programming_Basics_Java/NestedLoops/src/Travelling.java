import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input= scanner.nextLine();
        while (!input.equals("End")){
            String destination=input;
            double budget=Integer.parseInt(scanner.nextLine());
            double sum=0;
            while (sum<budget){
               double money=Integer.parseInt(scanner.nextLine());
                sum+=money;

            }
            System.out.printf("Going to %s!%n",destination);

            input= scanner.nextLine();

        }
    }
}
