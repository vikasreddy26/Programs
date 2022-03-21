package practise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemovingDuplicateElementsFromArrayList {
	 public static void main(String[] args)
	    {
	        //Constructing An ArrayList
	 
	        ArrayList<String> listWithDuplicateElements = new ArrayList<String>();
	 
	        listWithDuplicateElements.add("JAVA");
	 
	        listWithDuplicateElements.add("J2EE");
	 
	        listWithDuplicateElements.add("JSP");
	 
	        listWithDuplicateElements.add("SERVLETS");
	 
	        listWithDuplicateElements.add("JAVA");
	 
	        listWithDuplicateElements.add("STRUTS");
	 
	        listWithDuplicateElements.add("JSP");
	 
	        //Printing listWithDuplicateElements
	 
	        System.out.print("ArrayList With Duplicate Elements :");
	 
	        System.out.println(listWithDuplicateElements);
	 
	        //Constructing HashSet using listWithDuplicateElements
	 
	        HashSet<String> set = new HashSet<String>(listWithDuplicateElements);
	 
	        //Constructing listWithoutDuplicateElements using set
	 
	        ArrayList<String> listWithoutDuplicateElements = new ArrayList<String>(set);
	 
	        //Printing listWithoutDuplicateElements
	 
	        System.out.print("ArrayList After Removing Duplicate Elements :");   
	        System.out.println(listWithoutDuplicateElements);
	        System.out.println("\nHere are the duplicate elements from list : " + findDuplicates(listWithDuplicateElements));
	    }
	 
	// This method returns the duplicate elements present in ArrayList
	 public static Set<String> findDuplicates(List<String> listContainingDuplicates) {
		 
			 Set<String> setToReturn = new HashSet<String>();
			 Set<String> set1 = new HashSet<String>();
	 
			for (String yourInt : listContainingDuplicates) {
				if (set1.add(yourInt)==false) {
					setToReturn.add(yourInt);
				}
			}
			return setToReturn;
		}
}
