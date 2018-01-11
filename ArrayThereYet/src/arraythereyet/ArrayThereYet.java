/*
Java <Program Identifier>
Programming With Java Period 3
Written in Atom <version> x64
Compiled in NetBeans IDE <version>
Written By Dustin LeGars
Written on 1/11/2018 at 16:00
{>===----===<}
Intent:
  Lotto Sim.
{>===----===<}
<GitHub Link>
*/

package arraythereyet;

import java.util.Scanner;

public class ArrayThereYet {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //stuff
          int[] match = 12,35,34,2,5;
          int[] user;
          String[] val = "first", "second", "third", "fourth", "fifth";
          int[] hits = 0,1,50,1000,50000,90000000;

          int i = 0;
          int c = 0;
          int h = 0;
          match = new int[5];
          user = new int[5];
          val = new String[5];
          hits = new int[6];

        for (int count; count<5; count++) {
          System.out.println("What is your " + val[i] + "number?");
          user[i] = input.nextInt();
          i++;

        }

        //Match check
        for (int count; count<5; count++) {
          if (match[c] == user[c]) {
            h++;
          }
          c++;
        }

        System.out.println("You have " + h + " matches." + "\nYour payout is $" + hits[h] + ".");
    }

}
