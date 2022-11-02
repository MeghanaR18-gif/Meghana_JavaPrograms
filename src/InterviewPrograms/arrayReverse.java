package InterviewPrograms;

public class arrayReverse {
    public static void main(String args[]) {

        int[] array = new int[]{1,2,3,4,5};

        System.out.print("array ");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + ",");
        }
    }
}
