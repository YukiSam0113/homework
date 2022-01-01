package homework_4;

import java.util.Scanner;
class Point
{
	private double x; 
	private double y; 
	public Point() 
	{ 
		x=0; y=0; 
	}
	public Point(double x1,double y1) 
	{ 
		x=x1; 
		y=y1; 
	}
	public String toString() 
	{ 
		String ans=""; 
		ans="x is "+x+" y is "+y; 
		return ans; 
	}
	public double getx() 
	{ 
		return x; 
	}
	public double gety() 
	{ 
		return y; 
	}
	public double Dist(Point p) 
	{ 
		double x1=p.getx(); 
		double y1=p.gety(); 
		double ans=Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1)); 
		return ans; 
	}
	public Point mid(Point p) 
	{ 
		double x1=p.getx(); 
		double y1=p.gety(); 
		return new Point((x+x1)/2.0,(y+y1)/2.0); 
	}
}
public class U9_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter point1's x-,y-coordinates: "); 
		double x1=input.nextDouble(); 
		double y1=input.nextDouble(); 
		System.out.print("Enter point2's x-,y-coordinates: "); 
		double x2=input.nextDouble(); 
		double y2=input.nextDouble(); 
		Point p1=new Point(x1,y1); 
		Point p2=new Point(x2,y2); 
		System.out.println("p1 is "+p1.toString()); 
		System.out.println("p2 is "+p2.toString());
		System.out.println("The distance between p1 and p2 is"+p1.Dist(p2)); 
		System.out.println("The distance between p1 and p2 is"+p1.mid(p2).toString());
		input.close();
	}

}
