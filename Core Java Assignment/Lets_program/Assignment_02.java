/*Assignment - 02
Write a program to print following on screen
*
**
***/
package Lets_program;

public class Assignment_02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) { //row
            for (int j = 1; j <= i; j++) { //column
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
