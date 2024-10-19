package od.ext.letcode.normal;

import java.util.*;

public class T11 {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    public static int maxArea1(int[] height) {
        int l = 0;
        int r = l + 1;
        int max = 0;
        while (true) {
            max = Math.max(max, (r - l) * Math.min(height[l], height[r]));
            r++;
            if (r == height.length) {
                l++;
                r = l + 1;
                if (l == height.length - 1) {
                    break;
                }
            }
        }
        return max;
    }

    public static int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        boolean rflag = true;
        int max = 0;
        if (height[l] > height[r]) {
            max = r * height[r];
            r--;
        } else {
            max = r * height[l];
            l++;
            rflag = false;
        }
        while (l < r) {
            if (rflag) {
                if (height[r] < height[r + 1]) {
                    r--;
                    continue;
                }
            } else {
                if (height[l] < height[l - 1]) {
                    l++;
                    continue;
                }
            }
            if (height[l] > height[r]) {
                max = Math.max(max, (r - l) * height[r]);
                r--;
                rflag = true;
            } else {
                max = Math.max(max, (r - l) * height[l]);
                l++;
                rflag = false;
            }
        }
        return max;
    }
}
