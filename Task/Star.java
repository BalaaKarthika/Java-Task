package Patterns;
import java.util.Scanner;
 public class Star{
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	
    System.out.println(Enter the number of row:");
	
    int rows = sc.nextInt();
    for (int i = 0;i<=rows-1;i++){ //for loop col

        for(int j=0;j<=i;j++){

    System.out.println("*"+"");

    }
        System.out.println("");// new line
    }
       for(int i=rows-1;i>=0;i--){

        for(int i=0;j<=i-1;j++);

        System.out.println("*" + "");

    }
        System.out.println("");
    }
    sc.close();
    }
}


 

