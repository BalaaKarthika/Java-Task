// Remove Element: Remove the element at index 2 from the array numbers.

public class RemoveElement{
public static void main(String[] args){
int[] oldArr ={1, 2, 3, 4, 5};
int indexToBeRemoved = 2;
int newArr[] = new int[oldArr.length-1];
int j = 0;
for(int i = 0;i< oldArr.length; i++){
if(i != indexToBeRemoved){
newArr[j] = oldArr[i];
j++;
}
}
for(int i=0;i< newArr.length;i++){
System.out.println(newArr[i]);
}
}
}



