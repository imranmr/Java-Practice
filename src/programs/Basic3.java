package programs;

import java.util.Scanner;

public class Basic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		int numerator = obj.nextInt();
		int denominator = obj.nextInt();
		float total = numerator / denominator;
		
		System.out.println("Output: "+total);
	}

}
