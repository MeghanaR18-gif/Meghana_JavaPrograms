package InterviewPrograms;

public class Count_Num_EVEN_ODD {

    public static void main(String args[])
    {
        int num=234988170;
        int even_count=0;
        int odd_count=0;

        while(num>0)
        {
            int rem=num%10;

            if(rem%2==0)
            {
                even_count++;
            }
            else
            {
                odd_count++;
            }

            num=num/10;
        }
        System.out.print("even count:\n"+even_count);
        System.out.print("odd count:\n"+odd_count);
    }
}
