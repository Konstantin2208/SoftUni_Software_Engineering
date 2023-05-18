import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projection= scanner.nextLine();
        int string=Integer.parseInt(scanner.nextLine());
        int colums = Integer.parseInt(scanner.nextLine());
        double prize=0;
        int seats=string*colums;
        if(projection.equals("Premiere")){
            prize=seats*12;
        } else if (projection.equals("Normal")) {
            prize=seats*7.50;

        } else if (projection.equals("Discount")) {
            prize=seats*5;
        }
        System.out.printf("%.2f\n",prize);
        System.out.println("leva");
    }
}
