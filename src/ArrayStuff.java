import java.util.Scanner;
import java.util.Random;

public class ArrayStuff // class header
{ // class body
    public void sayHi() // method header
    {  // method body
        System.out.println("Howdy");
    }

    public void printNames()
    {
        String[] stringArray;

        // code

        stringArray = new String[3];
        stringArray[0] = "Peter";
        stringArray[1] = "Lois";
        stringArray[2] = "Stewie";

        String[] family = {"Peter", "Lois", "Stewie"};

        for (int i = 0; i < stringArray.length; i++)
        {
            System.out.println(stringArray[i]); // i will take on the values 0, 1, 2 to access the array elements in turn
        }

    }

    /**
     * Prints the numbers between the two numbers given by the user, inclusive
     */
    public void printNumbers()
    {
        System.out.println("Please enter your first number: ");
        Scanner myScanner = new Scanner(System.in);
        int firstInt = myScanner.nextInt();

        System.out.println("Please enter your second number: ");
        int secondInt = myScanner.nextInt();

        // if secondInt is smaller than or equal to firstInt, continue to ask user

        while (secondInt <= firstInt)
        {
            System.out.println("The second number must be greater than the first number, please try again: ");
            secondInt = myScanner.nextInt();
        }

        int arraySize = (secondInt - firstInt) + 1;
        int[] intArray = new int[arraySize];
        int count = 0;

        for (int i = firstInt; i <= secondInt; i++)
        {
            intArray[count] = i;

            count++;
        }

        for (int i = 0; i < intArray.length; i++)
        {
            System.out.println(intArray[i]);
        }
    }

    /**
     * Prints the average temperature that was recorded for each day of the week
     */
    public void printTemperaturesForWeek()
    {
        // parallel arrays
        String[] dayNames = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        double[] temps = {2.5, 4.1, 3.8, 5.2, 1.0, 2.1, 0.1};

        for (int i = 0; i < dayNames.length; i++)
        {
            System.out.println(dayNames[i] + ": " + temps[i]);
        }


    }


    public void translateDay()
    {
        Scanner myScanner = new Scanner(System.in);
        String[] dayNames = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String[] frenchDays = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};

        System.out.println("Please input a day to see if it exists: ");
        String userInput = myScanner.next();

        boolean exists = false;

        while (exists == false)
        {
            System.out.println("That is not a valid day of the week in English - please try again: ");
            userInput = myScanner.next();

            for (int i = 0; i < dayNames.length; i++)
            {
                if (userInput.equals(dayNames[i]))
                {
                    exists = true;
                }
            }
        }

        for (int i = 0; i < dayNames.length; i++)
        {
            if (userInput.equals(dayNames[i]))
            {
                System.out.println(frenchDays[i]);
            }
        }


    }

    public void showRandom()
    {
        Random ran = new Random();

        System.out.println(ran.nextInt(3) + 1); // prints random numbers between 1 and 3 inclusive
    }

} // end of class body
