package InterviewPrograms;

import java.util.Arrays;

public class sortarray {

    public  static void main(String args[])
    {
        int[] array= new int[] {-9,-5,8,12,1,3,0};
        for(int i=0; i< array.length;i++)
        {
            //System.out.print(array[i]);
        }
        Arrays.sort(array);
       // System.out.print("");
        System.out.print(Arrays.toString(array));

    }
}
