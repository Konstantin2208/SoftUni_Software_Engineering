import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product= scanner.nextLine();
        String town= scanner.nextLine();
        double kolichestvo= Double.parseDouble(scanner.nextLine());
        double prize=0;
        switch (product){
            case "coffee":
                if("Sofia".equals(town)){
                    prize=kolichestvo*0.50;
                } else if ("Plovdiv".equals(town)) {
                    prize=kolichestvo*0.40;

                } else if ("Varna".equals(town)) {
                    prize=kolichestvo*0.45;

                }
                break;
            case "water":
                if("Sofia".equals(town)){
                    prize=kolichestvo*0.80;
                } else if ("Plovdiv".equals(town)) {
                    prize=kolichestvo*0.70;

                } else if ("Varna".equals(town)) {
                    prize=kolichestvo*0.70;

                }
                break;
            case "beer":
                if("Sofia".equals(town)){
                    prize=kolichestvo*1.20;
                } else if ("Plovdiv".equals(town)) {
                    prize=kolichestvo*1.15;

                } else if ("Varna".equals(town)) {
                    prize=kolichestvo*1.10;

                }
                break;
            case "sweets":
                if("Sofia".equals(town)){
                    prize=kolichestvo*1.45;
                } else if ("Plovdiv".equals(town)) {
                    prize=kolichestvo*1.30;

                } else if ("Varna".equals(town)) {
                    prize=kolichestvo*1.35;

                }
                break;
            case "peanuts":
                if("Sofia".equals(town)){
                    prize=kolichestvo*1.60;
                } else if ("Plovdiv".equals(town)) {
                    prize=kolichestvo*1.50;

                } else if ("Varna".equals(town)) {
                    prize=kolichestvo*1.55;

                }
                break;
        }
        System.out.println(prize);
    }
}
