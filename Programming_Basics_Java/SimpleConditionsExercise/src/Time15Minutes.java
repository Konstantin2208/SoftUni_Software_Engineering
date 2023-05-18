import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int hours=Integer.parseInt(scanner.nextLine());
        int minutes=Integer.parseInt(scanner.nextLine())+15;
        int totalMinutes=minutes+(hours*60);
        hours= totalMinutes/60;
        minutes=totalMinutes%60;

        if(hours>=24){
            hours=hours-24;
        }
        System.out.printf("%d:%02d",hours,minutes);
    }
}
