/*Create interface Polynomial with following methods readValues(), calculateResult(), 
printResult(). Now you have to implements those methods for (a+b)2 and (a+b)3
. 
You have to read values of a and b and print the result. */



package test;

public interface Polynomial {
	public void readValues();
	public double calculateResult();
	public void printResult();
	
}


package test;

import java.util.Scanner;

public class PerformPolynominal implements Polynomial {

	int a;
	int b;
	int c;
	@Override
	public void readValues() {
		// TODO Auto-generated method stub
	    Scanner read = new Scanner(System.in);
	    System.out.println("Enter a:");

      a=read.nextInt();
	    System.out.println("Enter b:");

	      b=read.nextInt();

		    System.out.println("a and b is : "+a+"  "+b);
		    System.out.println("Enter 1 for (a+b)^2 and 2 for  (a+b)^3:");

		      c=read.nextInt();

	}
	

	@Override
	public double calculateResult() {
if(c==1)
{
	double s=a+b;
	    double result = Math.pow(s, 2);
	    return result;
}
else if(c==2)
{
	double s=a+b;
    double result = Math.pow(s, 3);
    return result;
}
else
{
	return 0.00;
}
 
	}

	@Override
	public void printResult() {
		// TODO Auto-generated method stub
		System.out.println("Result is :-   " +calculateResult() );
	}

}


package test;

public class PolynominalExcute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerformPolynominal p =new PerformPolynominal();
		p.readValues();
		p.printResult();
		
	}

}



--------------------------------------------

OUT PUT
--------------------------------------------

Enter a:
2
Enter b:
2
a and b is : 2  2
Enter 1 for (a+b)^2 and 2 for  (a+b)^3:
1
Result is :-   16.0

