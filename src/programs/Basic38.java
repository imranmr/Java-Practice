package programs;

//Write a Java program to count the letters, spaces, numbers and other characters of an input string. Go to the editor
//Expected Output
//
//The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
//letter: 23                                               
//space: 9                                                 
//number: 10                                               
//other: 6
public class Basic38 {

	public static void main(String[] args) {
		String input = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		char[] ch = input.toCharArray();
		
		int letter = 0;
		int space = 0;
		int number = 0;
		int other = 0;
		
		
		for (int i=0; i<ch.length;i++) {
			if (Character.isAlphabetic(ch[i])){
				letter++;
			}else if(Character.isDigit(ch[i])){
				number++;
			}else if(Character.isSpaceChar(ch[i])) {
				space++;
			}else {
				other++;
			}	
			
		}
		
		System.out.println("letter: "+letter);
		System.out.println("Space: "+space);
		System.out.println("number: "+number);
		System.out.println("other: "+other);

	}

}
