package practise;

import java.util.Arrays;

public class EqualityOfTwoArrays {
	 public static void main(String[] args)
	    {   
	        int[] arrayOne = {2, 5, 1, 7, 4};
	         
	        int[] arrayTwo = {2, 5, 1, 7, 4};
	         
	        boolean equalOrNot = true;
	         
	        if(arrayOne.length == arrayTwo.length)
	        {
	            for (int i = 0; i < arrayOne.length; i++)
	            {
	                if(arrayOne[i] != arrayTwo[i])
	                {
	                    equalOrNot = false;
	                }
	            }
	        }
	        else
	        {
	            equalOrNot = false;
	        }
	         
	        if (equalOrNot)
	        {
	            System.out.println("Two Arrays Are Equal");
	        }
	        else
	        {
	            System.out.println("Two Arrays Are Not equal");
	        }
	        
	        //*******************using arrays.equal***************
	        String[] s1 = {"java", "j2ee", "struts", "hibernate"};
	        
	        String[] s2 = {"jsp", "spring", "jdbc", "hibernate"};
	 
	        String[] s3 = {"java", "j2ee", "struts", "hibernate"};
	 
	        System.out.println(Arrays.equals(s1, s2));        //Output : false
	 
	        System.out.println(Arrays.equals(s1, s3));  
	        
	        //**********************************
	        String[] s11 = {"java", "swings", "j2ee", "struts", "jsp", "hibernate"};
	        
	        String[] s21 = {"java", "struts", "j2ee", "hibernate", "swings", "jsp"};
	 
	        Arrays.sort(s11);
	 
	        Arrays.sort(s21);
	 
	        System.out.println(Arrays.equals(s11, s21));       //Output : true
	        
	        //**************using Arrays.deepEquals *********************
	        String[][] s111 = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} };
	        
	        String[][] s211 = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} };
	 
	        System.out.println(Arrays.deepEquals(s111, s211));     //Output : true
	         
	        //Calling equals() method on same arrays will return false
	         
	        System.out.println(Arrays.equals(s111, s211));        //Output : false
	         
	        //That's why use deepEquals() method to compare multidimensional arrays
	    }

}
