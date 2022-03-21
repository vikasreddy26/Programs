package stringPrograms;

public class NoOfcharWhiteSpaceDigitsAndSpecialChar {

	public static void main(String[] args) {
		String s = "Mano     Reddy    @45gFb#$$";
		int letter = 0,space=0,digits=0,symbols=0;
		char [] ch =s.toCharArray();
		for(char c:ch) {
			if(Character.isLetter(c))
				letter++;
			else if(Character.isDigit(c))
			digits++;
			else if(Character.isWhitespace(c))
				space++;
			else 
				symbols++;
		}
		System.out.println(letter);
		System.out.println(space);
		System.out.println(digits);
		System.out.println(symbols);
	}


}
