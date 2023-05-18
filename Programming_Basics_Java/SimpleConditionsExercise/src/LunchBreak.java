import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String serialName= scanner.nextLine();
        int episodeDuration=Integer.parseInt(scanner.nextLine());
        double brakeDuration=Double.parseDouble(scanner.nextLine());
        double timeForLunch=brakeDuration/8;
        double timeForRelax=brakeDuration/4;
        double timeLeft=brakeDuration-(timeForRelax+timeForLunch);
        if (timeLeft>=episodeDuration){

            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",serialName,Math.ceil(timeLeft-episodeDuration));
        }else {

            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",serialName,Math.ceil(episodeDuration-timeLeft));

        }
    }
}
