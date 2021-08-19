package programs;

import java.util.Scanner;

public class Basic37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Reverse String
		Scanner obj = new Scanner(System.in);
		System.out.println("Input a string: ");
		char[] str = obj.nextLine().toCharArray();
		System.out.print("Reverse String: ");
		for (int i=str.length-1;i>=0;i--) {
			System.out.print(str[i]);
		}
		
		
		
	}

}
