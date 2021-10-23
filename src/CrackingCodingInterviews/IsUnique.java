package CrackingCodingInterviews;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

//Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
public class IsUnique {

public static boolean CheckIsUnique(String string) {
	char c;
	HashMap<Character, Integer> map = new HashMap<Character,Integer>();
	for (int i=0; i<string.length();i++) {
		c = string.charAt(i);
		if (map.containsKey(c)) {
			return false;
			
		}
		else {
			map.put(c, 1);
		}
	}
	return true;
}

public static boolean NoDSIsUnique(String string) {
	char temparray[] = string.toCharArray();
	Arrays.sort(temparray);
	for (int i=1;i<temparray.length;i++) {
		if (temparray[i] ==temparray[i-1]) {
			return false;
		}
	}
	return true;
		
	
}
public static void main(String[] args) {
// TODO Auto-generated method stub
	String s = "Hello World";//false
	String a = "wtf";//true
	System.out.println(CheckIsUnique(a));
	System.out.println(NoDSIsUnique(s));
	System.out.println(NoDSIsUnique(a));
	
}

}
