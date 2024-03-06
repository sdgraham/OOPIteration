import java.util.Scanner;

public class Main
{
    public static void main(String[] args) // main method
    {
        ArrayStuff myArrayStuff = new ArrayStuff(); // creation of an object of the ArrayStuff class

        Student s = new Student("Stew");
        s.sayName();

        Student mike = new Student("Mike");
        mike.sayName();
    }

    public static void countToFifty()
    {
        int count = 1;

        while (count <= 50)
        {
            System.out.println("Value of variable count is " + count);

            count++; // count = count + 1
        }

        System.out.println("Loop has finished.");
    }

    public static void countFromFifty()
    {
        int count = 50;

        while (count > 0)
        {
            System.out.println("The variable count is " + count);
            count--;
        }

        System.out.println("Loop has finished counting down");
    }

    public static void countToFiftyUsingFor()
    {
        for (int i = 1; i <= 50; i++)
        {
            System.out.println("Our variable has the value: " + i);
        }

        System.out.println("Iteration ceased");
    }

    public static void countDownFromFiftyUsingFor()
    {
        for (int i = 50; i > 0; i--)
        {
            System.out.println("Value of i is " + i);
        }

        System.out.println("Iteration ceased");
    }

    /**
     * Prints the odd numbers between the two parameters given
     * @param startNumber the number to start from
     * @param finishNumber the number to finish at
     */
    public static void printOddNumbers(int startNumber, int finishNumber) // receives arguments as parameters
    {
        while (startNumber <= finishNumber)
        {
            if (startNumber % 2 != 0)
            {
                System.out.println(startNumber);
            }

            startNumber++;
        }
    }

    /**
     * Prints the multiples of five between the start number and finish number
     * @param startNumber The number to start at
     * @param finishNumber The number to finish at
     */
    public static void printMultiplesOfFive(int startNumber, int finishNumber)
    {
        while (startNumber <= finishNumber)
        {
            if (startNumber % 5 == 0)
            {
                System.out.println(startNumber);
            }

            startNumber++;
        }
    }

    public static void printMultiplesOfTen(int startNumber, int finishNumber)
    {
        while (startNumber <= finishNumber)
        {
            if (startNumber % 10 == 0)
            {
                System.out.println(startNumber);
            }

            startNumber++;
        }
    }

    /**
     * Prints the sum of all numbers between the first number and the second number given as parameters inclusive
     * @param firstNumber the number to start at
     * @param secondNumber the number to finish at
     */
    public static void sumOfAll(int firstNumber, int secondNumber)
    {
        int sum = 0;

        while (firstNumber <= secondNumber)
        {
            sum = firstNumber + sum;

            firstNumber++;
        }

        System.out.println("The sum of all numbers is " + sum);
    }

    /**
     * Asks the user for a password
     * Continues to iterate until the password input by the user matches the stored password
     * Prints "please try again" if the password is not valid
     * Prints "password accepted" if the valid password was entered and ceases iterating
     */
    public static void enterPassword() {
        String storedPassword = "password";
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter your password: ");
        String userInput = myScanner.next();

        while (!userInput.equals(storedPassword))
        {
            System.out.println("Password is incorrect, please try again: ");
            userInput = myScanner.next();
        }

        System.out.println("Password is correct :)");
    }

    /**
     * Asks the user for a password
     * Continues to iterate for a maximum of three times if the user gets the password wrong
     * Ceases iterating and outputs "password accepted" if the user enters the correct password
     * If the user exceeds the maximum number of tries then outputs "Attempts exceeded - locked out"
     */
    public static void enterPasswordMaxTries()
    { // method body
        String storedPassword = "password";
        int attempts = 1;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter your password: ");
        String userInput = myScanner.next();

        while (!userInput.equals(storedPassword) && attempts < 3)
        {
            System.out.println("Password is incorrect, please try again: ");
            userInput = myScanner.next();

            attempts++;
        }

        // while loop exited

        if (attempts > 3)
        {
            System.out.println("Maximum attempts exceeded - you have been locked out.");
        }
        else
        {
            System.out.println("Password is correct :)");
        }

    }
}