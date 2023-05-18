import java.util.Scanner;

public class Excursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people=Integer.parseInt(scanner.nextLine());
        int nights=Integer.parseInt(scanner.nextLine());
        int transportCard=Integer.parseInt(scanner.nextLine());
        int museumTickets=Integer.parseInt(scanner.nextLine());
        double sumPerPerson=(nights*20)+(transportCard*1.60)+(museumTickets*6);
        double finalSum=sumPerPerson*people;
        finalSum=finalSum+(0.25*finalSum);
        System.out.printf("%.2f",finalSum);
    }
}
