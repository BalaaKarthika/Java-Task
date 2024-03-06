// Find Minimum-Find and print the minimum element in the array numbers.


public class Minimum{
public static void main(String[] args){
int array[] = {10,5,29,12,57,2,1};
int minElement = array[0];
for( int i=0 ;i < array.length; i++)
{
if( array[i] < minElement)
{
minElement = array[i];
}
}
System.out.println("The minimum element in array:"+ minElement);
}
}