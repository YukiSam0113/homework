package homework_4;

public class U9_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		U9_8 myCircle=new U9_8(5.0); 
		System.out.println("The area of the circle of radius " +myCircle.getRadius()+" is "+myCircle.getArea()); 
		myCircle.setRadius(myCircle.getRadius()*1.1); 
		System.out.println("The area of the circle of radius " +myCircle.getRadius()+" is "+myCircle.getArea());
	}

}
