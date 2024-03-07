abstract class Computer{
void turnOn(){
System.out.println("Turning on");
}
}
class Lenova extends Computer{

}
class Abstract{
public static void main(String[] args){
Computer ob = new Lenova();
ob.turnOn();
   
}
}   