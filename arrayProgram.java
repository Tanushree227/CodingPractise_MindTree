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
}
