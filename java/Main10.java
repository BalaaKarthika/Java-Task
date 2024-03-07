public class Main10{
public static void main(String[] agrs){
int a = 7,b = 3,c = 9, d = 2;
{
a=b++;
b=++a;
c=--d;
d=c++;

System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
}
}
}