package JavaInterview;

public class AbstractionTest {

    public static void main(String args[])
    {
        Samsung s=new Samsung();
        s.getMemory();
        Apple a=new Apple();
        a.getMemory();

       // Smartphone sp=new Smartphone(); // Smartphone is an abstract we cant create object for it

    }
}
