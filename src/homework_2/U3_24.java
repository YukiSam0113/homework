package homework_2;

import java.util.Scanner;

public class U3_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("输入"); 
		Scanner input=new Scanner(System.in); 
		String[] num= {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		String[] color= {"Clubs","Diamond","Hearts","Spades"}; 
		int a=(int)Math.random()*53; 
		int b=a/13; 
		int c=a%13; 
		System.out.println(num[c]); 
		System.out.println(color[b]);
		input.close();
	}

}
