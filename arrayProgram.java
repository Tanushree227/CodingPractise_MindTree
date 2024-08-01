public class arrayProgram {
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] reverseArr(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            reversed[arr.length - 1 - i] = arr[i];
        }
        return reversed;
    }

    public static int findFirstDuplicate(int[] arr) {
        boolean[] seen = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (seen[arr[i]]) {
                return arr[i];
            }
            seen[arr[i]] = true;
        }
        return -1; // No duplicates found
    }

    public static int findMissing(int[] arr) {
        int n = arr.length + 1;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }
        return expectedSum - actualSum;
    }

    // Rotate an array
    public static int[] rotateArr(int[] arr, int k) {
        k = k % arr.length;
        int[] rotated = new int[arr.length];
        for (int i = arr.length - k; i < arr.length; i++) {
            rotated[i - (arr.length - k)] = arr[i];
        }
        for (int i = 0; i < arr.length - k; i++) {
            rotated[k + i] = arr[i];
        }
        return rotated;
    }

    // Find the pair of elements in an array that add up to a given sum
    public static int[] findPair(int[] arr, int target) {
        boolean[] seen = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (complement >= 0 && complement < arr.length && seen[complement]) {
                return new int[] { complement, arr[i] };
            }
            seen[arr[i]] = true;
        }
        return null; // No pair found
    }

    // Find the longest increasing subsequence in an array
    public static int[] findLIS(int[] arr) {
        int[] dp = new int[arr.length];
        dp[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }
        int maxLen = 0;
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (dp[i] > maxLen) {
                maxLen = dp[i];
                maxIndex = i;
            }
        }
        int[] lis = new int[maxLen];
        int index = maxIndex;
        for (int i = maxLen - 1; i >= 0; i--) {
            lis[i] = arr[index];
            for (int j = index - 1; j >= 0; j--) {
                if (arr[j] < arr[index] && dp[j] == dp[index] - 1) {
                    index = j;
                    break;
                }
            }
        }
        return lis;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Max element: " + findMax(arr));
        System.out.println("Reversed array: " + java.util.Arrays.toString(reverseArr(arr)));
        System.out.println("First duplicate: " + findFirstDuplicate(new int[] { 1, 2, 3, 2, 4 }));
        System.out.println("Missing element: " + findMissing(new int[] { 1, 2, 3, 5 }));
        System.out.println("Rotated array: " + java.util.Arrays.toString(rotateArr(arr, 2)));
    }
}
