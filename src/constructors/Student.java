package constructors;

/* Without INITILIZATION of an value*/

public class Student {
    String name;
    int rollno;

    public static void main(String args[])
    {
        /* 1.we have just created an object for the class Student.
         But we are not performing any initilazation.
         we are not assigning any value to the name and rollno
         2. Once we create an object. For every Student object seprate copy of instance variable will
         be created - name,rollno
         3. For the instance variable default value will be name=null and rollno=0
         4. with in a class I have 600 objects created and i'm approaching 1st object name =null, rollno=0
         and we have same value for all the 600 objects
         5. Once we create an object compulsory we need to perform initilaztion for that object. OR else that object
         is not in the position to respond propelry */
        Student s1=new Student(); /* created Student s1 object */

         /* 1. we have just created an object for the class Student.
         But we are not performing any initilazation.
         we are not assigning any value to the name and rollno
          2. Once we create an object. For every Student object seprate copy of instance variable will
         be created - name,rollno
         3. For the instance variable default value will be name=null and rollno=0
         4. with in a class I have 600 objects created and i'm approaching 1st object name =null, rollno=0
         and we have same value for all the 600 objects
         5. Once we create an object compulsory we need to perform initilaztion for that object. OR else that object
         is not in the position to respond propelry */
        Student s2=new Student(); /* created Student s2 object */

        System.out.println("For Student s1 object, default value for name and rollno is given by JVM -> " +s1.name+","+s1.rollno);
        System.out.println("For Student s2 object, default value for name and rollno is given by JVM -> " +s2.name+","+s2.rollno);
    }
}
