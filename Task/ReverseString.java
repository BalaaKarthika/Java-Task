// Reverse a String in Java

public class ReverseString{
    public static void main(String[] args){
    String str = "karthika";
	String reversedStr = "";
	for(int i = str.length()-1;i>-1;i--){
	reversedStr += str.charAt(i);
	}
	System.out.println(reversedStr);
	}
}
	
