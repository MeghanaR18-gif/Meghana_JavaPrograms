package InterviewPrograms;

public class Even_or_Odd_num {

    public static void main (String args[])
    {
        int array[]={2,3,4,8,5};

        for(int i=0;i< array.length;i++)
        {
            if(array[i]%2==0)
                System.out.println(array[i]+ "is even");
        }
        for(int i=0;i< array.length;i++)
        {
            if(array[i]%2!=0)
                System.out.println(array[i]+ "is odd");
        }
    }
}
