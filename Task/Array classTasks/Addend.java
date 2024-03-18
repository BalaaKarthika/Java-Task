// Add an element at the end on int array.

public class Addend{
public static void main(String[] args){
int ValueToBeAdded= 6;
int arr[]={1,2,3};
int newArray[]=new int[arr.length+1];
for(int i=0;i<arr.length;i++)
{
newArray[i]=arr[i];
}
newArray[arr.length]= ValueToBeAdded;

for(int i=0;i<newArray.length;i++)
{
System.out.println(newArray[i]);
}

}}