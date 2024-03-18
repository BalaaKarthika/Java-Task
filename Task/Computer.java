abstract class Computer {
//abstract void();
  void TurnOn() {
    System.out.println("turningon");
  }
}

class HP extends Computer {

}

class Dell extends Computer {

}

public class Abstraction {
  public static void main(String[] args) {
    HP ob = new HP();
    ob.TurnOn(); 

    Dell ob1 = new Dell();
    ob1.TurnOn(); 
  }
}

