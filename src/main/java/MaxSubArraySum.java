public class MaxSubArraySum {

    public static int maxSubArraySum(int[] arr) {
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, -2, 3, 5, -1};
        int[] arr2 = {1, -2, 3, -8, 5, 1};
        int[] arr3 = {1, -2, 3, -2, 5, 1};

        System.out.println("Max sum of subarray in arr1: " + maxSubArraySum(arr1));  // 输出 8
        System.out.println("Max sum of subarray in arr2: " + maxSubArraySum(arr2));  // 输出 6
        System.out.println("Max sum of subarray in arr3: " + maxSubArraySum(arr3));  // 输出 7
    }
}
