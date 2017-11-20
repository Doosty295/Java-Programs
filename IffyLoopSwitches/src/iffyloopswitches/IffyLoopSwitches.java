/*
Java Homework 5
Programming With Java Period 3
Written in Atom 1.22.1 x64
Compiled in NetBeans IDE 8.2
Written By Dustin LeGars
Written on 11/19/2017 at 17:30
{>===----===<}
Intent:
  Write a:
    Switch statement to determine speeding ticket size
    If statement to return sums of variables
    While loop number game.
    do While number game
    For loop number field.



{>===----===<}
*/
package iffyloopswitches;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class IffyLoopSwitches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int state = 0;
        int repeatA = 1;
        int speed = 80;
        int size;
        int a = 4;
        int b = 13;
        int c = 512;
      do {
System.out.println("would you like to view the ABC sum problem (2), the while number game (3), the do while number game (4), or the field sum problem (5)?");

state = input.nextInt();

        /*if (state == 1) {
        switch (speed) {
          case (speed<61):
            size = 0;
            break;
          case (speed>60 && speed<81):
            size = 1;
            break;
          case (speed>80):
            size = 2;
            break;
        }

        System.out.println("Size: " + size);
*/
        if (state == 2) {
          if (a == 13) {
            a = 0;
            b = 0;
            c = 0;
          }
          else if (b == 13) {
            b = 0;
            c = 0;
          }
          else if (c == 13) {
            c = 0;
          }
          System.out.println("Sum:" + (a+b+c));

        }

        else if (state == 3) {
          int stNum = 38;
          int guess = 0;
          while (guess != stNum) {
            System.out.println("Try again.");
              if (guess < stNum) {
                System.out.println("too low");
              }

              else if (guess > stNum) {
                System.out.println("too high");
              }
              System.out.println("What is your guess?");
          guess = input.nextInt();
          }
          if (guess == stNum) {
            System.out.println("Bingo!");
          }

          }

          else if (state == 4) {
            int stNum = 38;
          int guess = 0;
            do {
              System.out.println("guess number.");
                if (guess < stNum) {
                  System.out.println("too low");
                }

                else if (guess > stNum) {
                  System.out.println("too high");
                }
                System.out.println("What is your guess?");
                guess = input.nextInt();
            if (guess == stNum) {
              System.out.println("Bingo!");
            }
          } while (guess != stNum);
          }

          else if (state == 5) {

            System.out.println("gimme positive number to start");
            int starting = input.nextInt();
            System.out.println("and a larger one to end");
            int ending = input.nextInt();
            int cycle = 0;
            int sum = 0;
            int diff = ending - starting;
            for (cycle = 0; cycle < diff; cycle ++) {
              sum += 1;

            }
            System.out.println("Sum of numbers from " + starting + " to " + ending + " is " + sum + ".");
          }


        System.out.println("to continue, type 1, to end type any other integer.");
        repeatA = input.nextInt();
      } while (repeatA == 1);
      }

        }

    }

}
