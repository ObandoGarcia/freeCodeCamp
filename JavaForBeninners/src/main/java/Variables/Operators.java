package Variables;

public class Operators {
    public static void main(String[] args) {
        int number1 = 12;
        int number2 = 10;

        //Addition
        System.out.println(number1 +number2);

        //Subtraction
        System.out.println(number1 - number2);

        //Multiplication
        System.out.println(number1 * number2);

        //Division
        System.out.println(number1 / number2);

        //Modulos
        System.out.println(number1 % number2);

        //is equal to
        System.out.println(number1 == number2);

        //is not equal to
        System.out.println(number1 != number2);

        //is less than
        System.out.println(number1 < number2);

        //is greater than
        System.out.println(number1 > number2);

        //Logical Operators
        // && and operator
        System.out.println(number1 >= 25 && number2 < 85);

        // || or operator
        System.out.println(number1 >= 25 || number2 == 10);

        // ! not operator
        System.out.println(!(number1 == 50 || number2 == 2));

        //Others utils operators
        int score = 0;
        int turns = 10;

        //Increment
        score += 1;
        score++;

        //Decrement
        turns -= 1;
        turns--;

        //PreIncrement
        --score;

        //PostIncrement
        ++score;
    }
}
