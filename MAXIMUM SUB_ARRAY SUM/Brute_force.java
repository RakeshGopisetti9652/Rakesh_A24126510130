public class Brute_force {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int bestSum = arr[0];
        int start = 0, end = 0;

        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                if (currentSum > bestSum) {
                    bestSum = currentSum;
                    start = i;
                    end = j;
                }
            }
        }

        System.out.println("Maximum subarray sum: " + bestSum);
        System.out.println("Subarray from " + start + " to " + end);
    }
}
