package week_4.ww4;

import java.util.*;
import java.util.random.*;
public class rockpaperscissors {
    public static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        while (true){
            System.out.println("Do you want to play? Enter 'Y' for Yes and 'N' for No");
            String input = sc.nextLine();
            if (input.equals("Y")){
                gameEngine();
            }
            else {
                System.out.println("Exitted. ");
                break;
            }
        }
        
    }

    public static void gameEngine() {
    String gameVariable[] = {"rock","paper","scissor"};
    Random r = new Random();
    int computerInput = r.nextInt(3);
    String computerGuess = gameVariable[computerInput];
    System.out.println("Enter you value: rock/paper/scissor");
    String userGuess = sc.nextLine();
    if (Arrays.asList(gameVariable).contains(userGuess)) {
        if(userGuess.equals("rock") && computerGuess.equals("scissor") || userGuess.equals("scissor") && computerGuess.equals("rock") || userGuess.equals("paper") && computerGuess.equals("rock")){
            System.out.println("Computer guess:" + computerGuess + " You win!!! ");
        }
        else if(userGuess.equals("rock") && computerGuess.equals("paper") || userGuess.equals("scissor") && computerGuess.equals("rock") || userGuess.equals("paper") && computerGuess.equals("scissor")){
            System.out.println("Computer guess:" + computerGuess + " You lose TT ");
        }
        else{
            System.out.println("Computer guess: " + computerGuess + " Its a tie");
        }

    }
    else{
        System.out.println("INVALID INPUT");
        return;
    }
    }
}