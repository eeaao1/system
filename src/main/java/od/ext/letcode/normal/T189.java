package od.ext.letcode.normal;

public class T189 {
    public static void main(String[] args) {
        rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        if (k > n - 1) {
            k = k % n;
        }
        int starts = 0;
        int start = starts;
        int t = nums[start];
        start += k;
        int tmp;
        boolean end = false;
        int c = 0;
        while (c < n) {
            tmp = nums[start];
            nums[start] = t;
            t = tmp;
            c++;
            if (end) {
                starts++;
                if (starts == k) {
                    break;
                }
                start = starts;
                t = nums[start];
                start += k;
                end = false;
            } else {
                if (start + k > n - 1) {
                    start += k - n;
                } else {
                    start += k;
                }
                if (start == starts) {
                    end = true;
                }
            }
        }
        System.out.println("11");
    }


}
