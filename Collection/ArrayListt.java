import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListt{
   public static void main(String[] args){
	String[] fruits = new String[3];
	fruits[0] = ("mango");
	fruits[1] = ("ghrapes");
	fruits[2] = ("apple");
	System.out.println(fruits);
   // ArrayList
   ArrayList<String> fruitList = new ArrayList<String>();
   fruitList.add("mango");
   fruitList.add("ghrapes");
   fruitList.add("apple");
   System.out.println(fruitList);
   fruitList.remove(2);
   System.out.println(fruitList);
   // LinkedList
   LinkedList<String> li = new LinkedList<String>();
   li.add("orange");
   li.add("pinaple");
   li.add("watermillan");
   System.out.println(li);
   
   }
} 