import java.util.Random;
import java.util.Scanner;
public class Game {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        Boolean play =true;
    while(play){
        int num = rand.nextInt(100)+1;
        int attempt=0;
        int maxattempt=10;
        System.out.println("Welcome to the Guessing Random Number Game ");
        while(true){
            System.out.print("Guess the number between 1 to 100 : ");
            int choose = sc.nextInt();
            attempt++;
            if(choose<num){
                System.out.println("Too Low!");
            }
            else if(choose>num){
                System.out.println("Too high!");
            }
            else{
                System.out.println("Congratulations! You guessed the right number :"+choose);
                System.out.println("You guessed the number in "+attempt+" attempt's");
                break;
            }

            if(attempt==maxattempt){
                System.out.print("Soory !! Reached the maximum attempt ");
            }
            }
            System.out.println("You want to Play again ?(Yes/No)");
            String playAgain = sc.next();
            play=playAgain.equalsIgnoreCase("yes");
        }
         System.out.print("Thank's for playing ");
         sc.close();
            }
        }
