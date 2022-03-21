package practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Arraylist {

	public static void main(String[] args) {
		 LinkedList<String> ll=new LinkedList<String>();  
         ll.add("Ravi");  
         ll.add("Vijay");  
         ll.add("Ajay");  
         //Traversing the list of elements in reverse order  
         Iterator<String> i=ll.descendingIterator();  
         while(i.hasNext())  
         {  
             System.out.println(i.next());  
         }  
         
         
		 ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
         list.add("Ravi");//Adding object in arraylist  
         list.add("Vijay");  
         list.add("Ravi");  
         list.add("Ajay");         
         System.out.println("Traversing list through List Iterator:");  
         //Here, element iterates in reverse order  
            ListIterator<String> list1=list.listIterator(list.size());  
            while(list1.hasPrevious()) 
            {  
                String str=list1.previous();  
                System.out.println(str);  
            }  
      System.out.println("Traversing list through for loop:");  
         for(int i1=0;i1<list.size();i1++)  
         {  
          System.out.println(list.get(i1));     
         }  
         
		//Creating user-defined class objects  
		  Student s1=new Student(101,"Sonoo",23);  
		  Student s2=new Student(102,"Ravi",21);  
		  Student s21=new Student(103,"Hanumat",25);  
		  //creating arraylist  
		  ArrayList<Student> al=new ArrayList<Student>();  
		  al.add(s1);//adding Student class object  
		  al.add(s21);  
		  al.add(s2);  
		  //Getting Iterator  
		  Iterator<Student> itr=al.iterator();  
		  //traversing elements of ArrayList object  
		  while(itr.hasNext()) {
		    Student st=itr.next();  
		    System.out.println(st.rollno+" "+st.name+" "+st.age);  
		  }
//***********************************************************************************************    
		    HashSet<String> set=new HashSet<String>();  
	           set.add("One");    
	           set.add("Two");    
	           set.add("Three");   
	           set.add("Four");  
	           set.add("Five");  
	           Iterator<String> i1=set.iterator();  
	           while(i1.hasNext())  
	           {  
	           System.out.println(i1.next());  
	           }  
 //***********************************************************************************************                      
		    TreeSet<String> set1=new TreeSet<String>();  
	         set1.add("Ravi");  
	         set1.add("Vijay");  
	         set1.add("Ajay");
	         System.out.println("Traversing element through Iterator in descending order"); 
	         Iterator<String> i11=set1.descendingIterator();  
	         while(i11.hasNext())  
	         {  
	             System.out.println(i11.next());  
	         }  
//***********************************************************************************************  
	         TreeSet<String> ns = new TreeSet<>();
	         ns.add("A");
	         ns.add("B");
	         ns.add("C");
	         ns.add("D");
	         ns.add("E");
	         ns.add("F");
	         ns.add("G");
	   
	         NavigableSet <String>new_ns = ns.descendingSet();
	   
	         Iterator <String>itr1 = new_ns.iterator();
	   
	         // Iterate over the elements using itr
	         while (itr1.hasNext()) {
	             System.out.println("Value: " + itr1.next() + " ");
	         }
//***********************************************************************************************  	         
	         TreeSet<Integer> set11=new TreeSet<Integer>();  
	         set11.add(24);  
	         set11.add(66);  
	         set11.add(12);  
	         set11.add(15); 
	         System.out.println("Highest Value: "+set11.pollFirst());  
	         System.out.println("Lowest Value: "+set11.pollLast());  
	         System.out.println(set11);
	         
		  }  
//***********************************************************************************************  	  
		 
}
