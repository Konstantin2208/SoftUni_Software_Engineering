import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String serchedBook= scanner.nextLine();
        String input= scanner.nextLine();
        int bookCounter=0;
        while (!input.equals("No More Books")){
            if (input.equals(serchedBook)){
                break;
            }
            bookCounter++;
            input= scanner.nextLine();
        }
        if(input.equals(serchedBook)){
            System.out.printf("You checked %d books and found it.",bookCounter);
        } else if (input.equals("No More Books")) {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.",bookCounter);
        }

    }
}
