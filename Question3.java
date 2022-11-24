/*Write down a class to find maximum of N numbers, user can enter integer, float or
double and result should be in that format*/

import java.util.Scanner;

public class MaximumFind {
    public static void main(String[] args) throws Exception {
    	Scanner sc = new Scanner(System.in);
    	 System.out.println("Enter number of elements ");
        double max = 0;
        int iNumber = sc.nextInt();
        System.out.println("Enter " + iNumber+ " elements to find maximum value in elements");
        while (inputNumber > 0) {
            double iMaximum = Double.parseDouble(sc.next());

            if (iMaximum <= 0 || iNumber <= 0) {
                break;
            }

            else {
                max = Math.max(max, iMaximum);
            }

            iNumber--;

        }

        if (max == 0) {
        }

        else {
            System.out.println(max);
}
    
    }
}

--------------------------------
OUT PUT
------------------------------

Enter number of elements
4
Enter 4 elements to find maximum value in elements2
3
4
5
5.0

