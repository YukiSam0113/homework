package homework_2;

import java.util.Scanner;

public class U3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		String s=input.nextLine();
		int[] a=new int[10];
		for(int i=0;i<s.length();i++)  a[i]=Integer.parseInt(s.substring(i, i+1));
		a[9]=0;
		for(int i=0; i<9; i++)  a[9]+=a[i]*(i+1);
		a[9]%=11;
		System.out.print("The ISBN-10 number is ");
		for(int i=0;i<10;i++)
		{
			if(i==9 && a[i]==10)  System.out.print("X");
			else  System.out.print(a[i]);
		}
		input.close();
	}

}
