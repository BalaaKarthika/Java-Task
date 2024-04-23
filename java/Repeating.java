// first repeating number in integer in array
public class Repeating{
public static void main (String[] args){
int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
firstRepeating(arr);
}public static void repeating(int[] arr){
int minimum = -1;
Hashset set = new Hashset();
for (int i = arr.length-1;i>=0;i--){
if(set.contains(arr[i]))
minimum = i;
else
set.add(arr[i]);
}
if(minimum ! = -1){
System.out.println("First repeating element is:" + arr[minimum]);
}
}
}
