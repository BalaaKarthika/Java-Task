// write a java program to show single thread in java

import java.util.Thread;
public class Thread{
  public static void main(String[] args){
  Thread t = Thread.CurrentThread();
  t.setName("My main Thread");
  t.setPriority(7);
  System.out.println(t.getName());
  System.out.println(t.getPriority());
 }
} 