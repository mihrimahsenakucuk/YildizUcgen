import java.util.Scanner;

public class YildizUcgen {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Üçgeninizin kaç satır olamasını istersiniz ?");
        int satir= scan.nextInt();

        for(int i= 0 ; i <= satir ; i++){
            for(int j= 0 ; j <= i; j++){
                System.out.print("*");
            }
               System.out.print("\n");
        }

    }
}
