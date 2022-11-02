package InterviewPrograms;

public class missingelement {
    public static void main (String args[])
    {
        int array[]={1,2,4,5};
        int sum1=0;

        //finding the count of the array
        for(int i=0;i< array.length;i++)
        {
            sum1=sum1+array[i];
        }
        System.out.println("count of the array: \n" +sum1);

        //finding the range of the array element
        int sum2=0;
        for(int i=1;i<=5;i++)
        {
            sum2 = sum2 + i;
        }
            System.out.println("range of the array: \n" + sum2);
        System.out.println("missing number is:" +(sum2-sum1));
    }
}
