package practise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import java.util.Map.Entry; 

public class HashMapToArraylist {
	 public static void main(String[] args) 
	    { 
	       
	        HashMap<String, String> studentPerformanceMap = new HashMap<String, String>(); 
	         
	        //Adding elements to HashMap 
	         
	        studentPerformanceMap.put("John Kevin", "Average"); 
	         
	        studentPerformanceMap.put("Rakesh Sharma", "Good"); 
	         
	        studentPerformanceMap.put("Prachi D", "Very Good"); 
	         
	        studentPerformanceMap.put("Ivan Jose", "Very Bad"); 
	         
	        studentPerformanceMap.put("Smith Jacob", "Very Good"); 
	         
	        studentPerformanceMap.put("Anjali N", "Bad"); 
	         
	        //Getting Set of keys 
	         
	        Set<String> keySet = studentPerformanceMap.keySet(); 
	      
	        //Creating an ArrayList of keys 
	         
	        ArrayList<String> listOfKeys = new ArrayList<String>(keySet); 
	         
	        System.out.println("ArrayList Of Keys :"); 
	         
	        for (String key : listOfKeys) 
	        { 
	            System.out.println(key); 
	        }
	         
	        System.out.println("--------------------------"); 
	         
	        //Getting Collection of values 
	         
	        Collection<String> values = studentPerformanceMap.values(); 
	         
	        //Creating an ArrayList of values 
	         
	        ArrayList<String> listOfValues = new ArrayList<String>(values); 
	         
	        System.out.println("ArrayList Of Values :"); 
	         
	        for (String value : listOfValues) 
	        { 
	            System.out.println(value); 
	        } 
	         
	        System.out.println("--------------------------"); 
	         
	        
	        
	     ArrayList<Map<String, String>> listOfEntry = new ArrayList<Map<String,String>>(); 
	        listOfEntry.add(studentPerformanceMap);
	        System.out.println(studentPerformanceMap);   		 
	       
	       for (Map<String, String> entry:listOfEntry) 
	        { 
	    	   
	            for(Entry<String, String> set:entry.entrySet()) {
	            	System.out.println(set.getKey() + " "  +set.getValue());
	            }
	        } 
	        //Getting the Set of entries 
	         
	       Set<Entry<String, String>> entrySet = studentPerformanceMap.entrySet(); 
	         
	        //Creating an ArrayList Of Entry objects 
	         
	       ArrayList<Entry<String, String>> listOfEntry1 = new ArrayList<Entry<String,String>>(entrySet); 
	         
	        System.out.println("ArrayList of Key-Values :"); 
	         
	        for (Entry<String, String> entry : listOfEntry1) 
	        { 
	            System.out.println(entry.getKey()+" : "+entry.getValue()); 
	        } 
	    } 

}
