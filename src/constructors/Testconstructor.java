package constructors;

public class Testconstructor {

    /* Constructor syntax*/
    /*1. Constructor name should be same as class name*/
    Testconstructor()
    {
        System.out.println("I am constructor");
    }

    public static void main(String args[])
    {
        Testconstructor s1=new Testconstructor(); /*Created Testconstructor s1 Object */
        Testconstructor s2=new Testconstructor(); /*Created Testconstructor s2 Object */
        Testconstructor s3=new Testconstructor(); /*Created Testconstructor s3 Object */
    }
}

/* Note:
* 1. For every object constructor(Testconstructor) will be executed separately*/