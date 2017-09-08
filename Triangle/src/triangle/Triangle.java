/*
Written on Paper
Duplicated into Atom
Compiled with NetBeans IDE 8.2
Java Program 4 : Java Programming Period 3
09/08/2017 - 09:50
Dustin LeGars - 9djl001
*/
package triangle;

/**
 *
 * @author 9djl001
 */


public class Triangle {

  public static void main(String[] args) {

//Mass declaration of variables
    double base, hyp, height, area, perim;

//Measurments of the sides
    base = 2.3;
    height = 5.9;
    hyp = 7.2;

//Arithmetic
    area = (base / 2) * height;
    perim = base + height + hyp;

//Outputs

    //Lengths
    System.out.println("The length of the triangle\'s sides are " + base + ", " + height + "and, " + hyp + ".");

    //Perimeter
    System.out.println("The perimeter of the triangle is " + perim + ".");

    //Area
    System.out.println("The area of the triangle is " + area + ".");

  }

}
