import java.util.*;

public class eventGuess
{
    public void processGuess() {
        Random randomMaker = new Random();
        Scanner keyboard = new Scanner(System.in);
        System.out.print('\f');

        int mystery = 0;
        int userGuess = 0;

        // nextInt(10) produces values 0-9, so add 1 to make 1-10
        mystery = randomMaker.nextInt(10) + 1;

        System.out.print("Enter your guess (1-10) : ");
        userGuess = keyboard.nextInt();

        if (userGuess == mystery) {
            System.out.println("You guessed it!");
        }
        else 
        {
            System.out.println("Sorry not this time! It was a : " + mystery);
        }
    }
}