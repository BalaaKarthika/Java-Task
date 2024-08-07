// Write java program to reverse a string without using string inbuilt function

public class ReverseModel{
  public static void main(String[] args){
  String Str="software";
  StringBuilder Str2= new StringBuilder();
  Str2.append(Str);
  Str2=Str2.reverse();
  System.out.println(Str2);
  }
}