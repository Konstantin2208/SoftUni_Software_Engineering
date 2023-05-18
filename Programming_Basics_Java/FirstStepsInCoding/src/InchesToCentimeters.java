import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Inch=Double.parseDouble(scanner.nextLine());
        double centimeter= Inch*2.54;
        System.out.println(centimeter);

    }
}
