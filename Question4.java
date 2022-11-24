/*Create interface Shape with method area and result. Now you have to print area of 
sphere, rectangle, and cone with same method*/


package test;

public interface Shape {

	double area();
	void result();
	
}


package test;

public class Rectangle implements Shape {

	@Override
	public double area() {
		int width=5;
		int height=10;
		int rectAngle=width*height;
		return rectAngle;
	}

	@Override
	public void result() {
		System.out.println("Area Of Rectangle:-"+area());		
		
	}

}


package test;

public class Clone implements Shape {

	@Override
	public double area() {
		int radius=37;
		double pie=3.14285714286;
		int height=10;
double cone=pie*radius*height*+pie*radius*radius;
		return cone;
	}

	@Override
	public void result() {
		System.out.println("Area Of Cone:-"+area());		
		
	}

}


package test;

public class Sphere implements Shape {

		@Override
	public double area() {
		int radius=37;
		double pie=3.14285714286;
		double areaofsphere=4*pie*(radius*radius);		
		return areaofsphere;
	}

	@Override
	public void result() {
System.out.println("Area Of Sphere:-"+area());		
	
	}
}


package test;

public class Perform {

	
public static void main(String s[]) {
	Sphere s1 =new Sphere();
	Rectangle r = new Rectangle();
	Clone c =new Clone();
	s1.result();
	r.result();
	c.result();
	}
}


------------------------------------
OUT PUT
------------------------------------

Area Of Sphere:-17210.28571430136
Area Of Rectangle:-50.0
Area Of Cone:-5003275.918376443
