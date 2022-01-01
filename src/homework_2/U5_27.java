package homework_2;

public class U5_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=101;i<=2100;i++) 
		{
			if(i%4==0&&i%100!=0||i%400==0)
				System.out.println(i);
		}
	}

}
