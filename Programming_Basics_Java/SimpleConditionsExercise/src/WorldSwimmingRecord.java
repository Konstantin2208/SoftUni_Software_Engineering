import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordTime=Double.parseDouble(scanner.nextLine());
        double metres= Double.parseDouble(scanner.nextLine());
        double timeForOneMeter= Double.parseDouble(scanner.nextLine());
        double ivanTime = metres*timeForOneMeter;
        double delay=Math.floor(metres/15)*12.5;
        double finalTime=ivanTime+delay;
        if (finalTime<recordTime){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",finalTime);
        }else {
            double neededTime=finalTime-recordTime;
            System.out.printf("No, he failed! He was %.2f seconds slower.",neededTime);
        }

    }
}
