package InterviewPrograms;

public class largest3num {

    public static void main(String args[])
    {
        int a=3, b=5, c=2;

        if(a>=b && a>=c)
        {
            System.out.print(a);
        }
        else if(b>=a && b>=c)
        {
            System.out.print(b);
        }
        else if(c>=a && c>=b)
        {
            System.out.print(c);
        }
    }
}
