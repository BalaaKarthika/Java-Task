class Student
{
int regno;
String name;
int m1;
int m2;
int m3;
Student (int r,String n,int n1,int n2,int n3)
{
regno=r;
name=n;
m1=n1;
m2=n2;
m3=n3;
}
public int Calculate()
{
return(m1+m2+m3);
}
public void displayStudent()
{
System.out.println("\n Name:"+name);
System.out.println("\n Regno:"+regno);
System.out.println("\n Mark1:"+m1);
System.out.println("\n Mark2:"+m2);
System.out.println("\n Mark3:"+m3);
}
}
public class StudentDemo
{
public static void main (String[] args)
{
Student S= new Student(1,"karthika",87,69,95);
System.out.println("\n output:");
System.out.println("\n Student details:");
S.displayStudent();
System.out.println("\n Total Marks obtained:"+S.Calculate());
}
}

