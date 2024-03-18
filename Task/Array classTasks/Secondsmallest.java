public class Secondsmallest
{
public static void main(String[] args)
{
int[] arr= {1,5,7,9,2,10};
int min= 0;
for(int i =0; i< arr.length;i++){
for(int j=i+1;j< arr.length;j++){
if(arr[i]<arr[j])
min= arr[i];
}
}
System.out.println(min);
}
}