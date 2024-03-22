import java.util.*;
public class CollectionEx{
    public static void main(String[] args){
	String[] arr = {"a", "b", "c", "a", "b", "c"};
    System.out.println(arr);
    ArrayList<String> arrList = new ArrayList<>(Arrays.asList(arr));
    System.out.println(arrList);
	
//ArayList
   ArrayList<String> list1 = new ArrayList<String>();
   list1.add("A");
   list1.add("B");
   list1.add("C");
   System.out.println(list1);
   
   //LinkedList
    LinkedList<String> list2 = new LinkedList<String>();
    list2.add("A");
    list2.add("B");
	list2.add("C");
	list2.remove("A");
    System.out.println(list2);
   
   // Hashset
   Set<String> list3 = new HashSet<>();
   list3.add("A");
   list3.add("E");
   list3.add("D");
   list3.remove("D");
   System.out.println(list3);

	//LinkedHashSet	
    LinkedHashSet<String> list = new LinkedHashSet<String>();
	list.add("A");
	list.add("B");
	list.add("A");
	list.add("D");
    System.out.println(list);
	
	// HashMap
    HashMap<String, String> Map= new HashMap<String, String>();
	Map.put("name","karthi");
	System.out.println(Map);
	
	Map<String, Integer> map = new TreeMap<>();
	map.put("A", 3);
	map.put("B", 6);
	System.out.println(map);
	System.out.println(map.get("A"));
    }
}
	
	