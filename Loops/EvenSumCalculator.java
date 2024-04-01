//Write a Java program to find the sum of all even numbers between 1 and 50 using a while loop.


public class EvenSumCalculator {
    public static void main(String[] args) {
        int sum = 0;
        int num = 2; 
        
        while (num <= 50) {
            sum += num;
            num += 2;
        }
        
        System.out.println("The sum of all even numbers between 1 and 50 is: " + sum);
    }
}
