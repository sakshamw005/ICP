class Solution {
    public int countValidSelections(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (simulate(nums, i, -1)) count++; // try left
                if (simulate(nums, i, 1)) count++;  // try right
            }
        }
        return count;
    }

    private boolean simulate(int[] nums, int start, int direction) {
        int[] arr = Arrays.copyOf(nums, nums.length);
        int curr = start;
        int dir = direction;

        while (curr >= 0 && curr < arr.length) {
            if (arr[curr] == 0) {
                curr += dir;
            } else {
                arr[curr]--;
                dir *= -1;
                curr += dir;
            }
        }

        for (int num : arr) {
            if (num != 0) return false;
        }
        return true;
    }
}