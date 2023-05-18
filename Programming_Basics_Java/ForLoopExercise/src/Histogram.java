import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n= Integer.parseInt(scanner.nextLine());
        double counter1=0;
        double counter2=0;
        double counter3=0;
        double counter4=0;
        double counter5=0;
        for (int i=1;i<=n;i++){
            int numbers= Integer.parseInt(scanner.nextLine());
            if (numbers<200){
                counter1++;
            } else if (numbers>=200&&numbers<=399) {
                counter2++;
            }else if (numbers>=400&&numbers<=599) {
                counter3++;
            }else if (numbers>=600&&numbers<=799) {
                counter4++;
            }else if (numbers>=800) {
                counter5++;
            }
        }
        System.out.printf("%.02f%%%n",counter1/n*100);
        System.out.printf("%.02f%%%n",counter2/n*100);
        System.out.printf("%.02f%%%n",counter3/n*100);
        System.out.printf("%.02f%%%n",counter4/n*100);
        System.out.printf("%.02f%%%n",counter5/n*100);
    }
}
