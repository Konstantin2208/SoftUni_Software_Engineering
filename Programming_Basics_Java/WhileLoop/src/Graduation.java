import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name= scanner.nextLine();

        int counterAge=1;
        int suspendedCounter=0;
        double sum=0;
        while (counterAge<=12){
            if (suspendedCounter>1){
                break;
            }
           double grade=Double.parseDouble(scanner.nextLine());

            if (grade<4){
                suspendedCounter++;
                continue;
            }
                sum=sum+grade;

            counterAge++;
        }
        if (suspendedCounter>1){
            System.out.printf("%s has been excluded at %d grade",name,counterAge);
        }else {
            double finalGrade = sum / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, finalGrade);
        }
    }
}
