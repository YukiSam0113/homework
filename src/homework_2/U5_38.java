package homework_2;

import java.util.Scanner;

public class U5_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter the decimal numeral: "); 
		int num = input.nextInt();
		int[] digits = new int[65]; 
		int tot = 0; 
		while (num > 0)
		{ 
			digits[++tot] = num % 8; 
			num /= 8; 
		}
		for (int i = tot; i >= 1; i--) 
			System.out.print(digits[i]);
		input.close();
	}

}
