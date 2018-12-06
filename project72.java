import java.util.Random;
import java.util.Scanner;

public class project72
{

  public static void main(String[] args)
  {
    {
      // Initlizes all the variables
      Scanner reader = new Scanner(System.in);
      int guessedNumber = (int) (Math.random() * 100 + 1);
      int rightNumber = 0;
      int numberofGuesses = 0;

      System.out.println("Type a number between 1-100");
      rightNumber = reader.nextInt();
      // Conditional for loop, loops statement enough times
      for (int x = 0; x <= 10000000; x++)
      {
        //
        if (rightNumber != guessedNumber)
        {
          //Guesses a random number
          guessedNumber = (int) (Math.random() * 100 + 1);
          System.out.println("The number I guessed is " + guessedNumber);
          numberofGuesses += 1;
        }
        // If all tests fail then displays correct answer message
        else if (rightNumber == guessedNumber)
        {
          System.out.println("I guessed the right number!");
          System.out.println("It took me this many guesses " + numberofGuesses);
break;
        }
     
      }
      
    }
  }

}
