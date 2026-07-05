public class Kadanes {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int currentSum = arr[0];
        int bestSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            bestSum = Math.max(bestSum, currentSum);
        }

        System.out.println("Maximum subarray sum: " + bestSum);
    }
}
