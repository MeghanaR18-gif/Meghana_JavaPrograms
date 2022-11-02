package InterviewPrograms;

public class Palindromstring {

    public static void main(String args[])
    {
        String text="MADAM";
        String rev="";

        int length= text.length();
        System.out.println(length);

        for(int i=length-1;i>=0;i--)
        {
            rev=rev+text.charAt(i);
        }

        if(text.toUpperCase().equals(rev.toUpperCase()))
        {
            System.out.print(text+  "\n text is a palindrom");
        }
        else
        {
            System.out.println(text+ "\n text is not a palindrom");
        }
    }
}
