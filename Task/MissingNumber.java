//MissingNumber

public class MissingNumber{
 public static void main(String[] args){
   int[] array = {1, 2, 3, 4, 5};
   int n = array.length+1;
   int expectedSum=n*(n+1)/2;
   int actualSum = 0;
   for(int i = 0;i<=array.length;i++){
    actualSum += array[i];
    }
   int missingNumber = expectedSum - actualSum;
   System.out.println("The missing number is: "+ missingNumber);
  }
 }