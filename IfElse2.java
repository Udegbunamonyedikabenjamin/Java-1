/* A better way of writing a two way If-Else statement using the conditional operator (?)
.... compare to IfElse.java*/
import java.util.Scanner;

public class IfElse2 {

    private int x;

    public static void main(String[] args) {

        Scanner input = new Scanner((System.in));

        System.out.println("Input integer");
        int x = input.nextInt();

        System.out.println(x > 60? "Passed" : "Failed");

    }
}
