package stringPrograms;

public class RemoveSpace {

	public static void main(String[] args) {
		String s = "mano vikas";
		s=s.replace(" ", "");
		System.out.println(s);
//********Another Method***********
		String s1 = "mano reddy";
		String removeSpace = "";
		for(int i = 0;i <= s1.length()-1;i++) {
			 char ch = s1.charAt(i);
			if(ch !=' ')
				removeSpace+=ch;
		}
			System.out.println(removeSpace);
	}

}
