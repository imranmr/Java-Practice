package programs;

import java.util.Scanner;

public class Basic5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		int firstnum = obj.nextInt();
		int secondnum = obj.nextInt();
		int total = firstnum*secondnum;
		System.out.println(firstnum +" x "+secondnum+ " = "+total);
	}

}
