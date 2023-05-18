import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sheets= Integer.parseInt(scanner.nextLine());
        int sheetsPerHour= Integer.parseInt(scanner.nextLine());
        int days=Integer.parseInt(scanner.nextLine());
        int hourPerDay= (sheets/sheetsPerHour)/days;
        System.out.println(hourPerDay);
    }
}
