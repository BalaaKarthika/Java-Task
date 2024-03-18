public class Average{
public static void main(String[] args){
int[] myArray = {67,89,49,99,56};
int sum = 0;
for(int i =0; i< myArray.length; i++){
sum += myArray[i];
}
double average = (double) sum/ myArray.length;
System.out.println("the average is:" + average);
}
}