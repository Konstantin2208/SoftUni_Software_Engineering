import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount=Integer.parseInt(scanner.nextLine());
        String type= scanner.nextLine();
        String day= scanner.nextLine();
        double totalPrice=0;
        switch (type){
            case "Students":
                if (day.equals("Friday")){
                    totalPrice=amount*8.45;
                } else if (day.equals("Saturday")) {
                    totalPrice=amount*9.80;
                } else if (day.equals("Sunday")) {
                    totalPrice=amount*10.46;
                }
                if (amount>=30){
                    totalPrice=totalPrice-(totalPrice*0.15);
                }
                break;
            case "Business":
                if (amount>=100){
                    amount-=10;
                }
                if (day.equals("Friday")){
                    totalPrice=amount*10.90;
                } else if (day.equals("Saturday")) {
                    totalPrice=amount*15.60;
                } else if (day.equals("Sunday")) {
                    totalPrice=amount*16;
                }
                break;
            case "Regular":
                if (day.equals("Friday")){
                    totalPrice=amount*15;
                } else if (day.equals("Saturday")) {
                    totalPrice=amount*20;
                } else if (day.equals("Sunday")) {
                    totalPrice=amount*22.50;
                }
                if (amount>=10&&amount<=20){
                    totalPrice=totalPrice-(totalPrice*0.05);
                }
                break;

        }
        System.out.printf("Total price: %.2f",totalPrice);
    }
}
