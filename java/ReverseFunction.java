//write a java program to reverse a string without using string inbuilt function reverse

public class ReverseFunction {
    public static void main(String[] args) {
        String str = "Software";
        char[] charArray = str.toCharArray();
        
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
    }
}