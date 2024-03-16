public class Mark{
public static void main(String[] args)
{
int mark1=50;
int mark2=65;
int mark3=87;
int mark4=97;
int mark5=78;
int total= mark1+mark2+mark3+mark4+mark5;
float avg=total/5;
if(avg==50){
System.out.println("c");
}
else if(avg<=51 && avg<=60){
System.out.println("B");
}
else if(avg<=61 && avg<75) {
System.out.println("B+");
}
else if(avg<=76 &&avg<85){
System.out.println("A++");
}
else if (avg<=86 && avg<=100){
System.out.println("A");
}
}
}