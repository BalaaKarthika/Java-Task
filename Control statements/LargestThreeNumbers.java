public class LargestThreeNumbers{
     public static void main(String[] args){
       int num1 = 37;
       int num2 = 64;
       int num3 = 32;
     // find the largest
       int largest;

       if(num1 >= num2 && num1 >=num3){
         largest = num1;
       }
       else if(num2 >= num1 && num2 >=num3){
         largest = num2;
       }
       else{
         largest = num3;
       }
       System.out.println("the largest number is:"+ largest);
    }
}

    
