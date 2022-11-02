package InterviewPrograms;

public class Palindrom {

    public static void main(String args[])
    {
        int n=121;
        int temp=n;
        int rev=0, rem;

        while(temp!=0)
        {
            rem=temp%10;
            rev=rev*10+rem;
            n=temp/10;
        }
        if(n==rev)
        {
            System.out.println(n+"\n is a palindrom");
        }
        else
        {
            System.out.println(n+ "\n is not a palindrom");
        }
    }
}
