// print the maximum element in the array numbers.


public class Maximum{
public static void main(String[] args){
int array[] = {10,5,29,12,57,2,1};
int maxElement = array[0];
for( int i=0 ;i < array.length; i++)
{
if( array[i] > maxElement)
{
maxElement = array[i];
}
}
System.out.println("The maximum element in array:"+ maxElement);
}
}