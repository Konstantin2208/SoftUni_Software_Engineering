import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberTabs=Integer.parseInt(scanner.nextLine());
        double salary=Double.parseDouble(scanner.nextLine());
        for (int i = 1;i<=numberTabs;i++){
            String tabs= scanner.nextLine();
            if (tabs.equals("Facebook")){
                salary-=150;
            } else if (tabs.equals("Instagram")) {
                salary-=100;
            }else if (tabs.equals("Reddit")) {
                salary-=50;
            }
            if (salary<=0){
                System.out.println("You have lost your salary.");
            }
        }
        System.out.printf("%.0f",salary);

    }
}
