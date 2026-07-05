public class PreFIx_sum {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] prefix = new int[arr.length + 1];
        int minPrefix = 0;
        int bestSum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }

        for (int i = 1; i < prefix.length; i++) {
            if (prefix[i] - minPrefix > bestSum) {
                bestSum = prefix[i] - minPrefix;
            }
            minPrefix = Math.min(minPrefix, prefix[i]);
        }

        System.out.println("Maximum subarray sum: " + bestSum);
    }
}
