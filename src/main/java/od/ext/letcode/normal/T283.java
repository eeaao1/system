package od.ext.letcode.normal;

public class T283 {
    public static void main(String[] args) {
        moveZeroes(new int[]{1});
    }

    public static void moveZeroes(int[] nums) {
        int l = -1;
        int r = 0;
        while (r < nums.length) {
            if (nums[r] == 0) {
                if (l == -1) {
                    l = r;
                }
                r++;
            } else {
                if (l > -1) {
                    nums[l] = nums[r];
                    nums[r] = 0;
                    l++;
                }
                r++;
            }
        }
    }
}
