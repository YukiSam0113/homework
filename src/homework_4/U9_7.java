package homework_4;
class Circle_1
{
	public double r; 
	public static int numberOfObjects=0; 
	Circle_1()
	{
		r=1; 
		numberOfObjects++; 
	}
	Circle_1(double R)
	{ 
		r=R;
		numberOfObjects++;
	}
	public static int getNumberOfObjects() 
	{
		return numberOfObjects;
	}
	public double getArea()
	{
		return r*r*Math.PI;
	}
	public String getRadius() {
		// TODO Auto-generated method stub
		return null;
	}
}
public class U9_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("numberOfObjects is "+Circle_1.numberOfObjects); 
		Circle_1 c1=new Circle_1();
		System.out.println("c1 r is"+c1.r+" numberOfObjects is "+c1.numberOfObjects); 
		Circle_1 c2=new Circle_1(5); 
		c1.r=9; 
		System.out.println("c1 r is"+c1.r+" numberOfObjects is "+c1.numberOfObjects); 
		System.out.println("c2 r is"+c2.r+" numberOfObjects is "+c2.numberOfObjects);
	}

}
