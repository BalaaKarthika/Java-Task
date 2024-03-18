//concatenate two Arrays into a single array

public class Concat{
public static void main(String[] args){
int[] array1 = {1,2,3};
int[] array2 = {4,5,6};
int length = array1.length + array2.length;
int[] resultArray = new int[length];
for(int i= 0;i<array1.length; i++){
resultArray[i] = array1[i];
}
for(int i= 0;i<array2.length; i++){
resultArray[ array1.length+ i] = array2[i];
}
System.out.println("concatenated Array:");
for(int i =0; i < length; i++){
System.out.println(resultArray[i] + " ");
}
}}
