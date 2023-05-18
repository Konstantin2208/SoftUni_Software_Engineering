import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowers= scanner.nextLine();
        int countFlowers= Integer.parseInt(scanner.nextLine());
        int budget=Integer.parseInt(scanner.nextLine());
        double prize=0;
        if (flowers.equals("Roses")){
            prize=countFlowers*5;
            if (countFlowers>80){
                prize=prize-(prize*0.10);
            }
        } else if (flowers.equals("Dahlias")) {
            prize=countFlowers*3.80;
            if (countFlowers>90){
                prize=prize-(prize*0.15);
            }
        } else if (flowers.equals("Tulips")) {
            prize=countFlowers*2.80;
            if (countFlowers>80){
                prize=prize-(prize*0.15);
            }
        }else if (flowers.equals("Narcissus")) {
            prize=countFlowers*3;
            if (countFlowers<120){
                prize=prize+(prize*0.15);
            }
        }else if (flowers.equals("Gladiolus")) {
            prize=countFlowers*2.50;
            if (countFlowers<80){
                prize=prize+(prize*0.20);
            }
        }
        if (budget>=prize){
            double leftMoney=budget-prize;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",countFlowers,flowers,leftMoney);
        }else if (prize>budget){
            double needMoney=prize-budget;
            System.out.printf("Not enough money, you need %.2f leva more.",needMoney);
        }
    }
}
