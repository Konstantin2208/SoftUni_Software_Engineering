import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area=0;
        String figure= scanner.nextLine();
        if (figure.equals("square")){
            double Side=Double.parseDouble(scanner.nextLine());
           area=Side*Side;
        } else if (figure.equals("rectangle")) {
            double Side1=Double.parseDouble(scanner.nextLine());
            double Side2=Double.parseDouble(scanner.nextLine());
            area=Side1*Side2;
        }else if (figure.equals("circle")){
            double radius=Double.parseDouble(scanner.nextLine());
            area=Math.PI*radius*radius;
        } else if (figure.equals("triangle")) {
            double a=Double.parseDouble(scanner.nextLine());
            double h=Double.parseDouble(scanner.nextLine());
            area= (a*h)/2;
        }
        System.out.printf("%.3f",area);

    }
}
