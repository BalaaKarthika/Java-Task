//Modify Element- Change the value of the second element of the array numbers to 10.

public class Modify{
public static void main(String[] args){
int[] numbers ={ 23, 45, 32, 84, 91, 12, 47};
numbers[1] = 24;
System.out.println("update array: ");
for(int i = 0;i<= numbers.length; i++){
System.out.println(numbers[i] + " ");
}
}
}
