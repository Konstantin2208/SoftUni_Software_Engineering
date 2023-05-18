import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int tax= Integer.parseInt(scanner.nextLine());
        double shoes=tax-(tax*0.40);
        double equip= shoes-(shoes*0.20);
        double ball= equip/4;
        double accesories= ball/5;
        double finalPrize= tax+shoes+equip+ball+accesories;
        System.out.println(finalPrize);

    }
}
