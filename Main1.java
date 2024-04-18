class Main1{
int modelYear;
String modelName;
public Main1(int year,String name){
modelYear = year;
modelName = name;
}
public static void main(String[] args){
Main1 Car = new Main1(6574,"Mustang");

System.out.print(Car.modelYear +" "+ Car.modelName);
}
}
