//Remove an element at the end on int array.

public class RemoveArray{
public static void main(String[] args)
{
int[] Array = {1,2,3};
int newArray[] = new int[Array.length-1];
for(int i = 0; i < Array.length; i++)
{
newArray[i] = Array[i];
}
for(int i = 0; i <newArray.length; i++)
{
System.out.println(newArray[i]);
}
}
}