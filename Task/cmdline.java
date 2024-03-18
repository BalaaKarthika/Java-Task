public class cmdline{
public static void main(String[] args){
String name = args[0];
int age = Integer.parseInt(args[1]);
//System.out.println(name +"is "+ (age>=18? "Eligible" : "not Eligible"));

if(age>=18){
System.out.println("eligible for vote");
}
else{
System.out.println("not eligible for vote");
}
}
}