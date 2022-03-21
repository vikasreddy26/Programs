package stringPrograms;

public class EvenOddIndex {

	public static void main(String[] args) {
		String s = "Manovikas";
		s=s.toLowerCase();
		for(int i = 0;i<=s.length()-1;i++) {
			int count = 0;
			for(int j = 0;j<=s.length()-1;j++) {
				if(s.charAt(i)==s.charAt(j)&&i>j) {
					break;
		           }
	             if(s.charAt(i)==s.charAt(j)) {
	            	 count++;
	             }			
			}			
			
			if(count>0&&i%2==0) {
				System.out.println(s.charAt(i)+" even index "+i);
			}
			else if(count >0 && i %2!=0) {
				System.out.println(s.charAt(i)+" Odd index "+ i);
			}
		}				
	}
}
