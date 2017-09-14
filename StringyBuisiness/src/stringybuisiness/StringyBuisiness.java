/*
Written in Atom
Compiled with NetBeans IDE 8.2
Written by Dustin LeGars on 9/13/2017
Strings Worksheet #2
Java Program 6
Period 3 Java Programming
*/
package stringybuisiness;

/**
 *
 * @author 9djl001
 */
public class StringyBuisiness {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      //Problem 1
        /*String message, word;
        message = "Themouseranuptheclock";
        word = message.substring(3,8);
        System.out.println(word);

      //Problem 2
        String message2;
        message2 = "JackandJillwentupthehill";
        System.out.println(message2.substring(20));

      //Problem 3
        //Same String as message2
      System.out.println(message2.substring(message2.length() - 4));
*/
      //Problem 4
      System.out.println("hello".substring(3));

      //Problem 5
      System.out.println("hello".substring(5));

      //Problem 6
      System.out.println("hello".substring(6));

      //Problem 7
      String digits = "1234567890";
      int pos = digits.indexOf("6");
      System.out.println(pos + digits.indexOf("a"));

      //Problem 8
      System.out.println("ilovesandwiches".substring(5).length());

      //Problem 9
      String name = "John";
      name += "Doe";
      System.out.println(name);

      //Problem 10
      String word1, word2;
      word1 = "Hello";
      word2 = word1;
      word1 = word1.substring(1,2);
      System.out.println(word2);

      //Problem 11
      String name1, name2;
      name1 = "Franklin Delano Roosevelt";
      name2 = name1.substring(0,8) + name1.substring(16);
      System.out.println(name2);

      //Problem 12
        //Same as 11
        int blank1 = name1.indexOf(" ")
        int blank2 = name1.substring(blank1 + 1).indexOf(" ");
        name1 = name1.substring(blank1 + 1, blank1 + 1 + blank2);
        System.out.println("*" + name1 + "*");


    }

}
