import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season= scanner.nextLine();
        String destination= "";
        String type="";
        double finalPrice=0;
        if(budget<=100){
            destination="Bulgaria";
            if(season.equals("summer")){
                finalPrice=budget*0.30;
                type="Camp";
            } else if (season.equals("winter")) {
                finalPrice=budget*0.70;
                type="Hotel";
            }
        }
        else if (budget<=1000){
            destination="Balkans";
            if(season.equals("summer")){
                finalPrice=budget*0.40;
                type="Camp";
            } else if (season.equals("winter")) {
                finalPrice=budget*0.80;
                type="Hotel";
            }
        } else if (budget>1000) {
            destination="Europe";
            finalPrice=budget*0.90;
            type="Hotel";
        }
        System.out.printf("Somewhere in %s\n",destination);
        System.out.printf("%s – %.2f",type,finalPrice);
    }
}
