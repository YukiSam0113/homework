package homework_4;

public class U9_10 {
	public static void main(String[] args) 
	{ 
		U9_8 myCircle=new U9_8(1); 
		int n=5;
		System.out.println("\n"+"Radius is "+myCircle.getRadius()); 
		System.out.println("n is "+n); }
	public static void printAreas( U9_8 c,int times)
	{ 
		System.out.println("Radius \t\tArea");
		while(times>=1) 
		{
			System.out.println(c.getRadius()+"\t\t"+c.getArea());
			c.setRadius(c.getRadius()+1);
			times--; 
		}
	}
}

