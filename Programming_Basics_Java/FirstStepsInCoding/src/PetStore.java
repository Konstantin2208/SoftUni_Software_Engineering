import java.util.Scanner;

public class PetStore {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int DogFood= Integer.parseInt(scanner.nextLine());
        int CatFood= Integer.parseInt(scanner.nextLine());
        double sum= (DogFood*2.50)+(CatFood*4);
        System.out.println(sum+" lv.");
    }
}
