package stringPrograms;

public class SeparateDigtisNumbersFromString {

	public static void main(String[] args) {
		String s = "Mano     Reddy    @45gFb#$$";
		String letter = "", space = "", digits = "", symbols = "";
		char[] ch = s.toCharArray();
		for (char c : ch) {
			if (Character.isLetter(c))
				letter += c;
			else if (Character.isDigit(c))
				digits += c;
			else if (Character.isWhitespace(c))
				space += c;
			else
				symbols += c;
		}
		System.out.println(letter);
		System.out.println(space);
        System.out.println(symbols);
		System.out.println(digits);
		
	}

}
