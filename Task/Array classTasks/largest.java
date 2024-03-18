// Fine the largest element in an array


public class largest{
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
System.out.println("The largest element in array:"+ maxElement);
}
}

