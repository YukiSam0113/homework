package homework_2;

import java.util.Scanner;

public class U5_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("输入"); 
		Scanner input=new Scanner(System.in);
		for(int j=8;j>=1;j--) 
		{ 
			for(int i=1;i<=j-1;i++)
				System.out.print(" "); 
			for(int i=1;i<=8-j;i++) 
			{ 
				int b=(int)Math.pow(2,i); 
				System.out.printf("%4d",b); 
			}
			for(int i=7-j;i>=1;i--) 
			{ 
				int b=(int)Math.pow(2,i); 
				System.out.printf("%4d",b); 
			}
			for(int i=1;i<=j-1;i++) 
				System.out.print(" "); 
			System.out.print("\n"); 
		}
		input.close();
	}

}
