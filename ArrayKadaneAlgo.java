package tryouts;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class ArrayKadaneAlgo {
 /* Finding Missing no and Repeating no in Array in O(N) */

    public static void FindSubArraywithMaxSum(int arr[])
    {
        int n = arr.length;
        int i; int sum = 0;
        int startIndex = 0; int endIndex = 0; int sIndex=0; //Not able to implement it
        boolean flag = false;
        int max = arr[0];

        for(i=0;i<n;i++)
        {
            sum += arr[i];

            if(sum<0)
                sum = 0;

            if(sum>max)
            {
                max = sum;
            }
        }
        System.out.print("Subarray giving Maximum sum of "+max);
    }
    public static void main(String[] args) {

        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};

        FindSubArraywithMaxSum(arr);

    }
}
