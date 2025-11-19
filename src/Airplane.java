public class Airplane {
/// instance vars
/// 1. used in the whple class
/// 2. they should be at the top of the class
/// 3. have public in front
    public int capacity;
    public String name;
    public String model;
    public boolean isDoubleDecker;
    public int length;

    //constructor with parameters
    //todo: add a parameter for model, is doubledecker, and length to the constructor
    //to set the value pf the instance variables to the parameters
    //fix the related problems in factory
    public Airplane(int pCapacity, String pName, String pmodel, int plength){
capacity = pCapacity;
name = pName;
//pname = name;

model = pmodel;
isDoubleDecker = false;
length = plength;
    }
    //todo make a method called printInfo() that the airplanes instance variables
    public void printInfoo(){
}

}
