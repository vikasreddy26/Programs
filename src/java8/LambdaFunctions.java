package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface Cab {
	void bookCab();

}

public class LambdaFunctions {

	public static void main(String[] args) {

		/*
		 * Cab cab = new Cab() {
		 * 
		 * @Override public void bookCab() {
		 * System.out.println("book cab in Ola or Uber");
		 * 
		 * } }; cab.bookCab();
		 */
		Cab cab = () -> System.out.println("book cab in ola or uber");
		cab.bookCab();
//**********************************************************		
		String names[] = { "reddy", "mano", "vikas" };
		Predicate pre = t -> ((String) t).length() == 4;
		for (String name : names) {
			if (pre.test(name)) {
				System.out.println(name);
			}
		}
//***************************************************************		
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);

		List<Integer> list = list1.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
		list1.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.println(e));
		list1.stream().filter(e -> e % 2 == 0).forEach(System.out::println);

		System.out.println(list);

//********************************************************************************************************************	
		List<Product> list11 = new ArrayList<Product>();
		list11.add(new Product(1, "Samsung A5", 17000));
		list11.add(new Product(3, "Iphone 6S", 65000));
		list11.add(new Product(2, "Sony Xperia", 25000));
		list11.add(new Product(4, "Nokia Lumia", 15000));
		list11.add(new Product(5, "Redmi4 ", 26000));
		list11.add(new Product(6, "Lenevo Vibe", 19000));

		Comparator<Product> com = new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				return o1.name.compareTo(o2.name);
			}
		};
		System.out.println(list11);
		Collections.sort(list11, com);

		System.out.println(list11);
		Collections.sort(list11, (s1, s2) -> {
			if (s1.price == s2.price)
				return 0;
			else if (s1.price > s2.price)
				return 1;
			else
				return -1;
		});

		System.out.println(list11);
//********************************************************************************************************************
		
		List<Product> filter = list11.stream().filter(k -> k.price >= 26000).collect(Collectors.toList());
		// we can use "and" & "or" methods for multiple condition checks
		// list11.stream().filter(k->k.price>=26000).forEach(System.out::println);
		list11.stream().filter(f -> f.price > 15000).map(e -> e.price).forEach(System.out::println);
		System.out.println(filter);

		List<Integer> lista = Arrays.asList(1, 2, 3);
		List<Integer> listb = Arrays.asList(4, 5, 6);
		List<List<Integer>> last = Arrays.asList(lista, listb);
		List<Integer> flat = last.stream().flatMap(a -> a.stream()).collect(Collectors.toList());
		System.out.println(flat);
		List<Integer> fmap = last.stream().flatMap(s -> s.stream().map(v -> v + 20)).collect(Collectors.toList());
		System.out.println(fmap);

		List<String> lists = Arrays.asList("mano", "vikas", "reddy");
		List<String> lists1 = Arrays.asList("shadnagar", "hyderabad", "banglore");
		List<List<String>> combine = new ArrayList();
		System.out.println("***********before java 8************");
		combine.add(lists1);
		combine.add(lists);
		for (List<String> one : combine) {

			for (String s : one) {
				System.out.println(s);
			}

		}
		System.out.println("***********after java 8************");

		combine.stream().flatMap(n -> n.stream()).collect(Collectors.toList()).forEach(System.out::println);

		List<Product> list22 = new ArrayList<Product>();
		list22.add(new Product(1, "Oppo Reno", 15000));
		list22.add(new Product(3, "Nokia 6", 18500));
		list22.add(new Product(2, "Oneplus Nord", 25000));
		list22.add(new Product(4, "Google pixel", 45000));
		System.out.println("***********before java 8************");
		List<List<Product>> finalList = new ArrayList();
		finalList.add(list11);
		finalList.add(list22);
		for (List<Product> one : finalList) {
			for (Product s : one) {
				System.out.println(s.name);
			}
		}
		System.out.println("***********after java 8************");

		finalList.stream().flatMap(n -> n.stream().map(m -> m.name)).collect(Collectors.toList())
				.forEach(System.out::println);

		List<String> myname = Arrays.asList("mano", "vikas", "reddy", "mano", "vikas");
		System.out.println("***********java 8 distinct ************");
		myname.stream().distinct().forEach(System.out::println);
		long count = myname.stream().distinct().count();
		System.out.println(count);
		myname.stream().limit(2).forEach(n -> System.out.println(n));
		System.out.println(myname.stream().filter(n -> n.startsWith("m")).count());
		
//********************************************************************************************************************	
		List<Integer> integer = Arrays.asList(1, 2, 3, 5, 7, 11, 15);
		Collections.sort(list22, Comparator.comparing(prod -> prod.price));
		System.out.println(integer);
		System.out.println(integer.stream().sorted());
		Stream<Integer> sort = integer.stream().sorted();
		integer.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("***********************");
		integer.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("***********************");
		
//********************************************************************************************************************	
		System.out.println(integer.stream().max((val1, val2) -> {
			return val1.compareTo(val2);
		}).get());
		// System.out.println(max.get());
		System.out.println(integer.stream().mapToInt(n -> n).sum());
		// min()
		Optional<Integer> min = integer.stream().min((val1, val2) -> {
			return val1.compareTo(val2);
		});
		System.out.println(min);
		System.out.println(min.get());

		List<String> stringList = Arrays.asList("A", "B", "C", "1", "2", "3");

		Optional<String> value1 = stringList.stream().reduce((a, b) -> {
			return a + b;
		});

		System.out.println(value1.get());

		Optional<String> string = stringList.stream().reduce(String::concat);

		System.out.println(string.get());
//********************************************************************************************************************	
		Set<String> fruites = new HashSet<String>();

		fruites.add("One apple");
		fruites.add("One mango");
		fruites.add("Two apples");
		fruites.add("More grapes");
		fruites.add("Two guavas");
		// anyMatch()
		boolean result = fruites.stream().anyMatch(value -> {
			return value.startsWith("One");
		});
		System.out.println(result);// true
		// allMatch()
		result = fruites.stream().allMatch(value -> {
			return value.startsWith("One");
		});
		System.out.println(result);// false
		// noneMatch()
		result = fruites.stream().noneMatch(value -> {
			return value.startsWith("One");
		});
		System.out.println(result);// false

		// findAny()
		List<String> stringList1 = Arrays.asList("one", "two", "three", "one");
		List<String> stringList11 = Arrays.asList();

		Optional<String> ele = stringList1.stream().findAny();
		System.out.println(ele.get());// one //NoSuchElementException

		// findFirst()
		List<String> stringList22 = Arrays.asList("one", "two", "three", "one");
		List<String> stringList23 = Arrays.asList();

		Optional<String> element = stringList22.stream().findFirst();

		System.out.println(element.get()); // one //NoSuchElementException
		
//********************************************************************************************************************			
		
		List<String> animalsList=Arrays.asList("Dog","Cat","Elephant");
		List<String> birdsList=Arrays.asList("peackock","parrot","Crow");
			
		Stream <String>stream1=animalsList.stream();
		Stream <String>stream2=birdsList.stream();
		List<String> finallist=Stream.concat(stream1, stream2).collect(Collectors.toList());	
		System.out.println(finallist);
		
		

//***********************************************************************************************************************		
		Map<String, Integer> map = new HashMap<>();
		map.put("eight", 8);
		map.put("four", 4);
		map.put("ten", 10);
		map.put("two", 2);
		Set<Entry<String, Integer>> entries = map.entrySet();
		System.out.println(entries);
		/*for(Entry entry:entries) {
			
			System.out.println(entry.getKey() +" ******** "+ entry.getValue());
		}*/
		
		ArrayList<Entry<String, Integer>> ar = new ArrayList<Entry<String, Integer>>(entries);
		Collections.sort(ar, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
		System.out.println(ar);
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("****************************");
	    map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);	
	    
		
		List<Product> p = new ArrayList<Product>();
		p.add(new Product(1, "Oppo", 15000));
		p.add(new Product(3, "Nokia", 18500));
		p.add(new Product(2, "Oneplus", 25000));
		p.add(new Product(4, "Google pixel", 45000));	
		p.add(new Product(1, "Samsung", 17000));
		p.add(new Product(3, "Iphone", 65000));
		p.add(new Product(2, "Sony Xperia", 25000));
		p.add(new Product(4, "Nokia", 15000));
		p.add(new Product(5, "Samsung", 26000));
		p.add(new Product(6, "Oppo", 19000));
  			
		Map <String,List<Product>> prodByComp = new HashMap<String,List<Product>>();
		
		for(Product product:p) {
			
			if(!prodByComp.containsKey(product.getName())) {
				 prodByComp.put(product.getName(),new ArrayList<Product>());							
			}
			
			prodByComp.get(product.getName()).add(product);
		}		
		System.out.println("*********** without using streams *****************");
		System.out.println(prodByComp);
	
		Map<String, List<Product>> groupby = p.stream().collect(Collectors.groupingBy(Product::getName));
		
		System.out.println("*********** using streams*****************");
		System.out.println(groupby);
		
		
//**************************************************************************************************************************************

		/*
		 * TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		 * map.put(100,"Amit"); map.put(102,"Ravi"); map.put(101,"Vijay");
		 * map.put(103,"Rahul"); Set<Entry<Integer, String>> entry = map.entrySet();
		 * System.out.println(map.entrySet());
		 * 
		 * System.out.println(map);
		 * 
		 * HashSet<String> set=new HashSet(); set.add("One"); set.add("Two");
		 * set.add("Three"); set.add("Four"); set.add("Five"); System.out.println(set);
		 */
		
		
	/*	HashMap<Integer, String> hm = new HashMap<Integer, String>();  
		hm.put(6, "Tushar");  
		hm.put(12, "Ashu");  
		hm.put(5, "Zoya");  
		hm.put(78, "Yash");  
		hm.put(10, "Praveen");  
		hm.put(67, "Boby");  
		hm.put(1, "Ritesh");  
		System.out.println("Before Sorting:");  
		Set set = hm.entrySet();  
		Iterator iterator = set.iterator();  
		while(iterator.hasNext())   
		{  
		Map.Entry map = (Map.Entry)iterator.next();  
		System.out.println("Roll no:  "+map.getKey()+"     Name:   "+map.getValue());  
		}  
		Map<Integer, String> map = sortValues(hm);   
		System.out.println("\n");  
		System.out.println("After Sorting:");  
		Set set2 = map.entrySet();  
		Iterator iterator2 = set2.iterator();  
		while(iterator2.hasNext())   
		{  
		Map.Entry me2 = (Map.Entry)iterator2.next();  
		System.out.println("Roll no:  "+me2.getKey()+"     Name:   "+me2.getValue());  
		}  
		}  
		//method to sort values  
		private static HashMap sortValues(HashMap map)   
		{   
		List list = new LinkedList(map.entrySet());  
		//Custom Comparator  
		Collections.sort(list, new Comparator()   
		{  
		public int compare(Object o1, Object o2)   
		{  
		return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());  
		}  
		});  
		//copying the sorted list in HashMap to preserve the iteration order  
		HashMap sortedHashMap = new LinkedHashMap();  
		for (Iterator it = list.iterator(); it.hasNext();)   
		{  
		 Map.Entry entry = (Map.Entry) it.next();  
		sortedHashMap.put(entry.getKey(), entry.getValue());  
		}   
		return sortedHashMap;  
		}  */		
	}

}
