import java.util.*;
public class Co{
   public static void main(String[] args){
   ArrayList<Integer> li = new ArrayList<Integer>();
   li.add(20);
   li.add(10);
   li.add(40);
   li.add(30);
   System.out.println(li);
   
   LinkedList<Integer> lii = new LinkedList<Integer>();
   lii.add(10);
   lii.add(20);
   lii.add(300);
   System.out.println(lii);
   
   Set<Integer> liii = new HashSet<Integer>();
   liii.add(10);
   liii.add(10);
   liii.add(200);
   liii.add(300);
   liii.remove(300);
   System.out.println(liii);
   
   
   
   }
}