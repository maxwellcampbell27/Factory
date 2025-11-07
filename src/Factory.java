public class Factory {
//todo: make a variable called "year" founded that is an integer
    //instance variables at the top of class, they can be seen by every class
    //they havwe to have the word public
    public int  yearFounded = 1798;
public String FactoryName = "airplane Factory";
public boolean isOpen = true;

    public static void main(String[] args) {
        System.out.println("Welcome to Max's Factory");
 new Factory();
    }

    //constructor
         public Factory(){
        isOpen = false;
        String manager = "Max";
        System.out.println(manager);
        factoryInfo();
        //Todo: change the variable "yearfounded" to be a different value
        // call factoryInf();
    }
        //make a method called factoryInfo, nothing should be in method
    public void factoryInfo(){
//todo: add souts to print out the 3 instance variables
        System.out.println(yearFounded);
        System.out.println(FactoryName);
        System.out.println("It is"+ isOpen + "that the factory is open");
        System.out.println(yearFounded + FactoryName + isOpen);


    }

}
