package NonPrimitive_DataType;

public class NonPrimitivedatatype {
    // Declaration of a primitive variable
    String name="OLA";

    public static void main(String[] args)
    {
        // Creating an object of the class NonPrimitivedatatype
        NonPrimitivedatatype np=new NonPrimitivedatatype(); //np is Non-primitive data type, i.e. Object REFERENCE.
        // Print the address of the memory location of an Object.
        System.out.println(np);
        // Now we cannot access instance variable directly.
        // We call instance variable by using reference variable sc which is created above.
        System.out.println(np.name);
    }
}
