package InterviewPrograms;

public class stringReverse {

    public static void main(String srgs[]) {

    String name = "meghana";

    int length = name.length();   // length() and charAt() method we are using to find the reverse string
    System.out.println(length);
    String rev ="";

    for(int i = length - 1; i>=0;i--)
    {
      rev=rev+name.charAt(i);
    }
    System.out.println(rev);
}
}
