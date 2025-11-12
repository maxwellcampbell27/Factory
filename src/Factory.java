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
        System.out.println("manager:"+ manager);
        factoryInfo();
        //Todo: change the variable "yearfounded" to be a different value

        yearFounded = 2000;
        isOpen = true;

        //type varName = value
        //object of type airplane
         Airplane plane1 = new Airplane();
         //plane1.name = "Maximus";
         System.out.println(plane1.name);
         //Todo: give all of plane1"s instance var values
             plane1.model = "Prime";
            plane1.capacity = 30;
            plane1.length = 50;
            plane1.isDoubleDecker = true;
             System.out.println(plane1.length);
             //Plane2
             Airplane plane2  = new Airplane();
             System.out.println(plane2.capacity);

             //HW: make 2 more airplane pbjects
             //for one of the objects change all the instance variables
             //for both objects print all the instance variables

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
