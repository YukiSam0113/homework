package homework_2;

import java.util.Scanner;

public class U5_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("输入"); 
		Scanner input=new Scanner(System.in); 
		int n=input.nextInt(); 
		for(int j=n;j>=1;j--) 
		{ 
			for(int i=1;i<=j-1;i++) 
				System.out.print(" "); 
			for(int i=n-j+1;i>=1;i--) 
				System.out.print(i+" ");
			for(int i=2;i<=n-j+1;i++) 
				System.out.print(i+" ");
			for(int i=1;i<=j-1;i++) 
				System.out.print(" ");
			System.out.print("\n"); 
		}
		input.close();
	}

}
