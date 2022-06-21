import java.util.Scanner;
public class Interest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Balance");
        int Balance = input.nextInt();

        System.out.println("Enter Annual interest rate");
        double AIR = input.nextDouble();

        double interest = Balance * AIR / 1200;
        System.out.println("Therefore the Interest is :" + interest);
    }
}