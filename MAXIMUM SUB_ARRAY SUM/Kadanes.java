import java.util.*;
public class Kadanes {
    public static int maxSubArraySum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i=0;i<arr.length;i++){
            currsum = Math.max(arr[i], currsum+arr[i]);
            maxSum = Math.max(maxSum, currsum);
        }
        return maxSum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(maxSubArraySum(arr));
        sc.close();
    }
}
