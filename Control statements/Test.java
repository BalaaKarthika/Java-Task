// Intheritance

class Animal{
    void eat(){
	  System.out.println("eating");
	 }
   }
class Dog extends Animal{
    void brak(){
	  System.out.println("breaking");
	 }
   }
class Test{
  public static void main(String[] args){
  Dog d = new Dog();
  d.brak();
  d.eat();
  }
 }

	  
	
	
	