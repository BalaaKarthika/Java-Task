public class Average1{
public static void main(String[] args){
int[] arr = {90,38,40,50,59};
int sum=0, avg=0;
for(int i =0;i<arr.length;i++){
sum = sum + arr[i];
}
System.out.println("Sum:"+ sum);
avg = sum/arr.length;
System.out.println("Avg:" + avg);
}}