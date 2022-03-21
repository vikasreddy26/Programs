package stringPrograms;

public class VowelsAndconsonents {

	public static void main(String[] args) {
	  String s = "This is vikas reddy";
      int vcount = 0;int cCount = 0;
      s=s.toLowerCase();
      for(int i = 0;i<=s.length()-1;i++) {
    	  if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)== 'i')
    		  vcount++;
    	  else if(s.charAt(i)>='a' && s.charAt(i)<='z')
    		  cCount++;    		  
      }
      System.out.println("vowels :"+vcount+" "+"consonents:"+cCount);
	}

}
