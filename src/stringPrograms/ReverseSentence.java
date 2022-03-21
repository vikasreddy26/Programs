package stringPrograms;

public class ReverseSentence {

	public static void main(String[] args) {
	String s = "my is vikas reddy";
	String reverse ="";
	String[] words = s.split(" ");
	for(int i = words.length-1;i>=0;i--) {
		reverse = reverse+words[i]+" ";
	}
     System.out.println(reverse);
	}

}
