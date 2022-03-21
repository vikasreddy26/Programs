package stringPrograms;

import java.util.Arrays;

public class Anagram {
	static boolean  isAnagram(String s1, String s2)
	{
		s1 =s1.replace("\\s","");
		s2 =s2.replace ("\\s","");
		boolean flag;
		if(s1.length() != s2.length()) {
			flag = false;
		}
		else  {
			char[] s1Array = s1.toLowerCase().toCharArray();
			char[] s2Array = s2.toLowerCase().toCharArray();
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);
			flag = Arrays.equals(s1Array, s2Array);
		}
		return flag;
	}
 
    public static void main(String[] args)
    {
       System.out.println(isAnagram("Mother In Law", "Hitler Woman")); 
 
        isAnagram("keEp", "peeK");
 
        isAnagram("SiLeNt CAT", "LisTen AcT");
 
        isAnagram("Debit Card", "Bad Credit");
 
        System.out.println(isAnagram("mano", "anom"));
 
        isAnagram("DORMITORY", "Dirty Room");
 
        System.out.println(isAnagram("Toss", "Shot"));
        isAnagram("ASTRONOMERS", "NO MORE STARS");
 
        isAnagram("joy", "enjoy");
    }
}
