import java.util.Scanner;

public class NestedIf {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter your score");
            int score = input.nextInt();

            if (score >= 85) {
                System.out.println("A");
            }
           else if (score >= 75) {
                System.out.println("B");
            }
           else if (score >= 60) {
                System.out.println("C");
            }
           else if (score >= 50) {
                System.out.println("D");
            }
           else if (score >= 45) {
                System.out.println("E");
            }
           else if (score < 40) {
                System.out.println("F");
            }
        }
    }

