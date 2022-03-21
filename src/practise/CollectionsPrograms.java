package practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class CollectionsPrograms {

	public static void main(String[] args) {
		  ArrayList<Student> al=new ArrayList<Student>();  
	      al.add(new Student("Viru"));  
	      al.add(new Student("Saurav"));  
	      al.add(new Student("Mukesh"));  
	      al.add(new Student("Tahir"));  
	      
	    Collections.sort(al);  
	    for (Student s : al) {  
	      System.out.println(s.name); 
	    }  
	    System.out.println("**********************************************");   
	    
	    ArrayList<Student> al1=new ArrayList<Student>();    
	    al1.add(new Student(101,"Vijay",23));    
	    al1.add(new Student(106,"Ajay",27));    
	    al1.add(new Student(105,"Jai",21));    
	    
	    Collections.sort(al1);    
	    for(Student st:al1){    
	    System.out.println(st.rollno+" "+st.name+" "+st.age);    
	}

	    System.out.println("**********************************************");   

	    // Creating a HashMap of String keys and String values
	    HashMap<String, String> hashmap = new HashMap<String, String>();
	    hashmap.put("Key1", "Value1");
	    hashmap.put("Key2", "Value2");
	    
	    System.out.println("Iterating or looping map using foreach loop");
	    // Iterating or looping using keySet() method
	       for(String key:hashmap.keySet()) {
	    	   System.out.println("key"+" "+hashmap.get(key));
	    }
	    System.out.println("**********************************************");   
	 // Creating a HashMap of String keys and String values
	    HashMap<String, String> hashmap1 = new HashMap<String, String>();
	    hashmap1.put("Key1", "Value1");
	    hashmap1.put("Key2", "Value2");
	    System.out.println("Iterating or looping map using keySet Iterator");
	    // Iterating or looping using keySet() method
	    Set<String> keySet = hashmap1.keySet();
	    Iterator<String> keySetIterator = keySet.iterator();
	    while (keySetIterator.hasNext()) {
	        String key = keySetIterator.next();
	        System.out.println("key: " + key + " value: " + hashmap1.get(key));
	    }
	    
	    System.out.println("**********************************************");   
	    HashMap<String, String> hashmap11 = new HashMap<String, String>();
	    hashmap11.put("Key1", "Value1");
	    hashmap11.put("Key2", "Value2");
	    System.out.println("Iterating or looping map using entrySet and foreach loop");
	    // Iterating or looping using entrySet() method
	    Set<Entry<String, String>> entrySet = hashmap11.entrySet();
	    for (Entry<String, String>entry : entrySet) {
	        System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
	    }
	    System.out.println("**********************************************");   
	    
	    // Creating a HashMap of String keys and String values
	    HashMap<String, String> hashmap111 = new HashMap<String, String>();
	    hashmap111.put("Key1", "Value1");
	    hashmap111.put("Key2", "Value2");
	    System.out.println("Iterating or looping map using entrySet and Iterator");
	    // Iterating or looping using entrySet() method
	    Set<Map.Entry<String, String>> entrySet1 = hashmap111.entrySet();
	    Iterator<Map.Entry<String, String>> entrySetIterator = entrySet1.iterator();
	    while (entrySetIterator.hasNext()) {
	    	Map.Entry<String, String> entry = entrySetIterator.next();
	        System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
	    }
	    System.out.println("**********************************************");   
	    
	    HashMap<Integer, String> hashmap1111 = new HashMap<Integer, String>();
	    
	    // Adding Key and Value pairs to HashMap
	    hashmap1111.put(22,"A");
	    hashmap1111.put(55,"B");
	    hashmap1111.put(33,"Z");
	    hashmap1111.put(44,"M");
	    hashmap1111.put(99,"I");
	    hashmap1111.put(88,"X");
	 
	    System.out.println("Before Sorting:");
	   Set<Entry<Integer, String>> set = hashmap1111.entrySet();
	    Iterator<Entry<Integer, String>>  iterator = set.iterator();
	    while(iterator.hasNext()) {
	        Map.Entry<Integer, String> pair = iterator.next();
	        System.out.print(pair.getKey() + ": ");
	        System.out.println(pair.getValue());
	    }
	    Map<Integer, String> map = new TreeMap<Integer, String>(hashmap1111);     System.out.println("After Sorting:");
	    Set set2 = map.entrySet();
	    Iterator iterator2 = set2.iterator();
	    while(iterator2.hasNext()) {
	        Map.Entry pair = (Map.Entry)iterator2.next();
	        System.out.print(pair.getKey() + ": ");
	        System.out.println(pair.getValue());
	    } 
	    System.out.println("**********************************************");   
	    ArrayList<String> arraylist = new ArrayList<String>();
	    arraylist.add("Apple");
	    arraylist.add("Banana");
	    arraylist.add("Pear");
	    arraylist.add("Mango");

	    /*Unsorted List: ArrayList content before sorting*/
	    System.out.println("ArrayList Before Sorting:");
	    for(String str: arraylist){
	   System.out.println(str);
	  }

	    /* Sorting in decreasing (descending) order*/
	    Collections.sort(arraylist, Collections.reverseOrder());

	    /* Sorted List in reverse order*/
	    System.out.println("ArrayList in descending order:");
	    for(String str: arraylist){
	   System.out.println(str);
	    }
	    System.out.println("**********************************************");   
	    
	 
	      
  }

	

	
}
