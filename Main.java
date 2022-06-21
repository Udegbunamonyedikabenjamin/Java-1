import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner Registration = new Scanner(System.in);

           System.out.println("Enter your User Name");
           String UserName = Registration.nextLine();

           System.out.println("Enter your password");
           String Password = Registration.nextLine();

           System.out.println("Welcome " + UserName + ", Your account have been successfully created.");
           System.out.println("You have 4 more steps to complete your registration");

           System.out.println("Add an Email Address");
           String Mail = Registration.nextLine();

           System.out.println("Add a phone number");
           String PhoneNumber = Registration.nextLine();

           System.out.println("How old are you?");
           int Age = Registration.nextInt();

    //System.out.println("Ok that's cool");
    // System.out.println("Please tell us why you want to apply for this program");
    // int Reason = Registration.nextInt();

           System.out.println("Hey " + UserName + ", Confirm your Details");
           System.out.println("Your Email address is " + Mail + ", your mobile number is " + PhoneNumber +
                                ", you are " + Age + " years of age." );

           System.out.println("That's all " + UserName + "!!, Your Registration is successful.");
           System.out.println("Check your mail concurrently to know your admission status");


    }
}
