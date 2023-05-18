import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int faildMax=Integer.parseInt(scanner.nextLine());
        String lastProblem="";
        int faildYears=0;
        int problemCounter=0;
        double sum=0;
        boolean isFailed=true;
        while (faildYears<faildMax){
            String problemName= scanner.nextLine();
            if(problemName.equals("Enough")){
                isFailed=false;
                break;
            }
           int grade=Integer.parseInt(scanner.nextLine());
            if(grade<=4){
                faildYears++;
            }
            problemCounter++;
            sum+=grade;
            lastProblem=problemName;
        }
        if(isFailed){
            System.out.printf("You need a break, %d poor grades.",faildYears);
        }else {

            System.out.printf("Average score: %.2f%nNumber of problems: %d%nLast problem: %s",sum/problemCounter,problemCounter,lastProblem);
        }

    }
}
