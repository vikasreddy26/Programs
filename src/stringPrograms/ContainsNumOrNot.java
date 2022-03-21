package stringPrograms;

public class ContainsNumOrNot {

	public static void main(String[] args) {
		String s = "VikasReddy26";
		boolean flag = false;
		for (int i = 0; i <= s.length() - 1; i++) {
			int asciiValue = s.charAt(i);
		//	System.out.println(s.charAt(i) + " asciivalue of " + asciiValue);
			if (asciiValue >= 48 && asciiValue <= 57) {
				flag = true;
				System.out.print(s.charAt(i));
			}
			//char c = (char) asciiValue;
			// System.out.println(c);
		}
		System.out.println(flag);
	}
}