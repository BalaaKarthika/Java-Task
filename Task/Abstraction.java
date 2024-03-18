abstract class Computer {
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
    Computer ob = new HP();
    ob.TurnOn(); 
    //ob.TurnOff(); 
  }
}

