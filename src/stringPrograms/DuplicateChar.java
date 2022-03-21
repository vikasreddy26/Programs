package stringPrograms;

public class DuplicateChar {

	public static void main(String[] args) {
		String s = "Test engineer ";
		s = s.toLowerCase();
		s = s.replaceAll("\\s+", "");
		for (int i = 0; i <= s.length() - 1; i++) {
			int count = 0;
			for (int j = 0; j <= s.length() - 1; j++) {
				if (s.charAt(i) == s.charAt(j) && i > j) {
					break;
				}
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}
			if (count > 1)
				System.out.println(s.charAt(i) + " Occurance " + count);
		}

	}

}
