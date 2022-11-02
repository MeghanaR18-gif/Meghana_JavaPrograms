package InterviewPrograms;

public class Count_Sum_Number {

    public  static void main(String args[])
    {
        int n=1345;
        int sum=0;

        while(n>0)
        {
            sum=sum+n%10;
            n=n/10;
        }
        System.out.print(sum);
    }
}
