package JavaInterviewQuestions;

import java.util.Arrays;

public class Rotation {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,7};
        int n=3;
        int temp=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;

            }

        }
        System.out.println(Arrays.toString(arr));

    }
}
