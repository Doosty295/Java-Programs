/*
Java Program 14
Programming With Java Period 3
Written in Atom 1.23.0 x64
Compiled in NetBeans IDE 8.2
Written By Dustin LeGars
Written on <date> at <time>
{>===----===<}
Intent:
  Create a game that asks the user if a number is prime.
  Have user and computer guess as to prime status.
  Determine prime.
  Award points for correct guesses.
  Display score.
{>===----===<}
<GitHub Link>
*/

package jp14primegame;
import java.util.Scanner;

/**
 *
 * @author 9djl001
 */
public class JP14PrimeGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Input Scanner
          Scanner input = new Scanner(System.in);

        //Randomizer
          double randomNum = Math.random();
          double randomConv = randomNum * 1000;
          int randomFin = (int)randomConv;

        //Computer Choice Generator
          double cpChIn = Math.random();
          int cpChFin = 0;
          if (cpChIn < 0.5) {
            cpChFin = 1;
          }

        //Prime?
          Boolean primeStat(randomFin) {
            //multiple 2?
            if (randomFin%2 == 0) return false;
            //check odds
            for (; ; ) {

            }
          };

        //checks whether an int is prime or not.
boolean isPrime(int n) {
  //check if n is a multiple of 2
  if (n%2==0) return false;
  //if not, then just check the odds
  for(int i=3;i*i<=n;i+=2) {
      if(n%i==0)
          return false;
  }
  return true;
}

        //Resources
          String bar = "<]==#==#==#**#==#==#[>";
          String terminate = "Quit", "quit", "Q", "q";
          String yes = "Yes", "yes", "y", "Y";
          String no = "No", "no", "N", "n";
          String response;
          Boolean cont = true;


        do {
          System.out.println(bar + "\nThis is the Prime Game.\nWould you like to continue?\nEnter \"Yes\" or \"No\".\nEnter \"Quit\" to quit.");
          response = input.nextLine();
          response = input.nextLine();

          if (response == yes) {
            System.out.println("The number is " + randomFin + ". \nIs the number prime?");
          }





















        } while (cont = true);

    }

}
