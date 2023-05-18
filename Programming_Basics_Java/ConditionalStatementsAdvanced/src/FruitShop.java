import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double kolichestvo=Double.parseDouble(scanner.nextLine());
        double prize=0;
        boolean ValidData= false;
        if (fruit.equals("banana")||fruit.equals("apple")||fruit.equals("orange")||fruit.equals("grapefruit")||fruit.equals("kiwi")||fruit.equals("pineapple")||fruit.equals("grapes")){
            ValidData=true;
        }
        if (day.equals("Monday")||day.equals("Tuesday")||day.equals("Wednesday")||day.equals("Thursday")||day.equals("Friday")){
            if (ValidData) {
                switch (fruit) {
                    case "banana":
                        prize = kolichestvo * 2.50;
                        System.out.printf("%.2f", prize);
                        break;
                    case "apple":
                        prize = kolichestvo * 1.20;
                        System.out.printf("%.2f", prize);
                        break;
                    case "orange":
                        prize = kolichestvo * 0.85;
                        System.out.printf("%.2f", prize);
                        break;
                    case "grapefruit":
                        prize = kolichestvo * 1.45;
                        System.out.printf("%.2f", prize);
                        break;
                    case "kiwi":
                        prize = kolichestvo * 2.70;
                        System.out.printf("%.2f", prize);
                        break;
                    case "pineapple":
                        prize = kolichestvo * 5.50;
                        System.out.printf("%.2f", prize);
                        break;
                    case "grapes":
                        prize = kolichestvo * 3.85;
                        System.out.printf("%.2f", prize);
                        break;


                }
            }else {
                System.out.println("error");
            }

        }else if (day.equals("Saturday")||day.equals("Sunday")){
            if(ValidData) {
                switch (fruit) {
                    case "banana":
                        prize = kolichestvo * 2.70;
                        System.out.printf("%.2f", prize);
                        break;
                    case "apple":
                        prize = kolichestvo * 1.25;
                        System.out.printf("%.2f", prize);
                        break;
                    case "orange":
                        prize = kolichestvo * 0.90;
                        System.out.printf("%.2f", prize);
                        break;
                    case "grapefruit":
                        prize = kolichestvo * 1.60;
                        System.out.printf("%.2f", prize);
                        break;
                    case "kiwi":
                        prize = kolichestvo * 3.00;
                        System.out.printf("%.2f", prize);
                        break;
                    case "pineapple":
                        prize = kolichestvo * 5.60;
                        System.out.printf("%.2f", prize);
                        break;
                    case "grapes":
                        prize = kolichestvo * 4.20;
                        System.out.printf("%.2f", prize);
                        break;


                }
            }else{
                System.out.println("error");
            }

        }
        else {
            System.out.println("error");

        }

    }
}
