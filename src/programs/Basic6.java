package programs;

import java.util.Scanner;

public class Basic6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		int firstnum = obj.nextInt();
		int secondnum = obj.nextInt();
		int add = firstnum + secondnum;
		int sub = firstnum - secondnum;
		int mul = firstnum * secondnum;
		float div = firstnum / secondnum;
		int mod = firstnum % secondnum;
		System.out.println(firstnum+ " + "+secondnum+ " = "+ add);
		System.out.println(firstnum+ " - "+secondnum+ " = "+ sub);
		System.out.println(firstnum+ " * "+secondnum+ " = "+ mul);
		System.out.println(firstnum+ " / "+secondnum+ " = "+ div);
		System.out.println(firstnum+ " mod "+secondnum+ " = "+ mod);
	}

}
