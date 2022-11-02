package JavaInterview;

public class Testclass {
    public static void main(String args[])
    {
//        classA ca=new classA();
//        ca.method1();
//        classB cb=new classB();
//        cb.method2();
//        System.out.println(ca.a);
//        System.out.println(cb.b);

        // overriding
        Parent p=new Parent(); // p-p
        Child c=new Child(); // c-c reference variable is c of type child . right side  child object is getting created - new keyword is responsible for creating the object
        Parent p1=new Child(); //p-c
       // Child c1=new Parent(); //c-p // java: incompatible types: JavaInterview.classA cannot be converted to JavaInterview.classB --> compile TE
        // child reference variable cant hold parent object
        p.marry(); // subbhalakshmi
        c.marry(); // priyanka
        p1.marry(); //priyanka
    }
}
