public class Arithmetics {

    public int comparison(int number){
        if (number > 100){
            System.out.println("The number is greater than 100");
        }

        if (number < 100){
            System.out.println("The number is lesser than 100");
        }

        if (number == 100){
            System.out.println("The number is equals to 100");
        }

        int squareOfNumber = number * number;

        if (squareOfNumber < 100){
            System.out.println("The square of the number is lesser than 100");
        }

        if (squareOfNumber > 100){
            System.out.println("The square of the number is greater than 100");
        }

        if (squareOfNumber == 100){
            System.out.println("The square of the number is equal to 100");
        }

        return number;
    }
}
