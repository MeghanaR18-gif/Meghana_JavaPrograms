package constructors;

public class Student1 {

    // Instance variable
    String name;
    int rollno;

    //constructor
    /* Instance variable what we created passing as a argument.
     Person who create an object will be sending values to the name & rollno */
    Student1(String name,int rollno)
    {
        this.name=name; /* currect object name = name(name which we have provided --> Durga)*/
        this.rollno=rollno; /* currect object rollno = rollno(rollno which we have provided --> 123)*/
    }

    public static void  main(String args[])
    {
        /* created Student1 s1 object.
        Constructor call.We are calling Student1 constructor by passing values - Durga,123 */
        Student1 s1=new Student1("Durga",123);

        /* created Student1 s1 object.
        Constructor call.We are calling Student1 constructor by passing values - Ravi,124 */
        Student1 s2=new Student1("Ravi",124);

        /* created Student1 s1 object.
        Constructor call.We are calling Student1 constructor by passing values - Siva,125 */
        Student1 s3=new Student1("Siva",125);

        System.out.println("For Student1 s1 object -> " +s1.name +","+ s1.rollno);
        System.out.println("For Student1 s2 object -> " +s2.name +","+ s2.rollno);
        System.out.println("For Student1 s3 object -> " +s3.name +","+ s3.rollno);
    }
}

/*NoTE:
* WHen constructor will be exectued - after the object creation constructors will be executed.
* whenever we use "new" operator */