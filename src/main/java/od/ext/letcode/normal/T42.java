package od.ext.letcode.normal;

public class T42 {
    public static void main(String[] args) {
        System.out.println(trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    public static int trap(int[] height) {
        int[] lh = new int[height.length];
        int[] rh = new int[height.length];
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            lh[i] = Math.max(max, height[i]);
            max = lh[i];
        }
        max = 0;
        for (int i = height.length - 1; i > -1; i--) {
            rh[i] = Math.max(max, height[i]);
            max = rh[i];
        }
        int res = 0;
        for (int i = 1; i < height.length - 1; i++) {
            res += Math.max(Math.min(lh[i - 1], rh[i + 1]) - height[i], 0);
        }
        return res;
    }

    public static int trap1(int[] height) {
        int l = 1;
        int r = height.length - 2;
        int res = 0;
        int lm = height[l - 1];
        int rm = height[r + 1];
        while (l <= r) {
            if (lm < rm) {
                res += Math.max((lm - height[l]), 0);
                lm = Math.max(lm, height[l]);
                l++;
            } else {
                res += Math.max((rm - height[r]), 0);
                rm = Math.max(rm, height[r]);
                r--;
            }
        }
        return res;
    }

}
