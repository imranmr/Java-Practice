package CrackingCodingInterviews;

import java.util.HashMap;

public class CheckPermutation {
public static boolean checkperm(String string1, String string2) {
	
	
	if(string1.length()!=string2.length()) {
		return false;
	}
	
	HashMap<Character,Integer> map = new HashMap<Character,Integer>();
	char c;
	for (int i=0;i<string1.length();i++) {
		c = string1.charAt(i);
		if (map.containsKey(c)) {
			map.put(c, map.get(c)+1);
		}else {
			map.put(c, 1);
		}
	}
	
	for (int j=0;j<string2.length();j++) {
		c = string2.charAt(j);
		if(map.containsKey(c)) {
			map.put(c, map.get(c)-1);
		}else {
			return false;
		}
		
	}
	for (Character key: map.keySet()) {
		if(map.get(key)!=0) {
			return false;
		}
	}
	return true;
}
public static void main(String[] args) {
// TODO Auto-generated method stub
	String a = "abcd";
	String b = "dcab";
	String c = "abcdddd";
	
	System.out.println(checkperm(c, b));
}

}
