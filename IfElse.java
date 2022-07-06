import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Exam score");
        int score = input.nextInt();

        if (score > 60) {
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }

    }
}
