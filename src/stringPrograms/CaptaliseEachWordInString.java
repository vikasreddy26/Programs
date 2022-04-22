package stringPrograms;

public class CaptaliseEachWordInString {

	public static void main(String[] args) {
		 System.out.println(CaptaliseEachWordInString.capitalizeWord("my name is khan"));  
	}
	public static String capitalizeWord(String str){  
	    String words[]=str.split("\\s");  
	    String capitalizeWord="";  
//	    for(String w:words){  
//	        String first=w.substring(0,1);  
//	        String afterfirst=w.substring(1);  
//	        capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
//	    }
	    for(int i = 0;i<words.length;i++) {
	    String first	= words[i].substring(0,1);
	    	String remaining = words[i].substring(1);
	    	capitalizeWord= capitalizeWord+first.toUpperCase()+remaining+ " ";
	    	
	    }
	    
	    
	    
	    return capitalizeWord;  
	}  
}
