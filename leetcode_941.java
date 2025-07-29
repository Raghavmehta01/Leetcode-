class Solution {
    public boolean leetcode_941(int[] arr) {
        int n = arr.length;

      
        if (n < 3) {
            return false;
        }


        int peak = 0;
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                peak = i;
            }
        }


        if (peak == 0) {
            return false;
        }
        if (peak == n - 1) {
            return false;
        }


        for (int i = 0; i < peak; i++) {
            if (arr[i] >= arr[i + 1]) {
                return false;
            }
        }

   
        for (int i = peak; i < n - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
