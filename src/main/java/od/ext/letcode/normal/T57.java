package od.ext.letcode.normal;

import java.util.Arrays;

public class T57 {
    public static void main(String[] args) {
        int[][] ints = {{0, 1}, {2, 6}, {9, 11}};
        int[] intd = {5, 10};

        int[][] insert = insert(ints, intd);
        System.out.println(insert);

    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int len = intervals.length;
        if (len == 0) {
            int[][] res = new int[1][2];
            res[0] = newInterval;
            return res;
        }
        if (newInterval[0] > intervals[len - 1][1]) {
            int[][] res = new int[len + 1][2];
            System.arraycopy(intervals, 0, res, 0, len);
            res[len] = newInterval;
            return res;
        }
        if (newInterval[1] < intervals[0][0]) {
            int[][] res = new int[len + 1][2];
            System.arraycopy(intervals, 0, res, 1, len);
            res[0] = newInterval;
            return res;
        }

        int l = 0;
        int r = len - 1;
        int m = 0;
        while (l <= r) {
            m = l + (r - l) / 2;
            if (intervals[m][1] > newInterval[0]) {
                r = m - 1;
            } else if (intervals[m][1] < newInterval[0]) {
                l = m + 1;
            } else {
                break;
            }
        }
        int sflag = -1;
        if (intervals[m][1] >= newInterval[0] && intervals[m][0] <= newInterval[0]) {
            sflag = 1;
        } else if (intervals[m][1] < newInterval[0]) {
            if (intervals[m + 1][0] <= newInterval[0]) {
                sflag = 1;
            } else {
                sflag = 0;
            }
            m++;
        } else {
            sflag = 0;
        }
        int mm = m;
        l = m;
        r = len - 1;
        while (l <= r) {
            m = l + (r - l) / 2;
            if (intervals[m][1] > newInterval[1]) {
                r = m - 1;
            } else if (intervals[m][1] < newInterval[1]) {
                l = m + 1;
            } else {
                break;
            }
        }
        int eflag = -1;
        if (intervals[m][1] >= newInterval[1] && intervals[m][0] <= newInterval[1]) {
            eflag = 1;
        } else if (intervals[m][1] < newInterval[1]) {
            if (m < len - 1) {
                if (intervals[m + 1][0] <= newInterval[1]) {
                    m++;
                    eflag = 1;
                } else {
                    eflag = 2;
                }
            } else {
                eflag = 2;
            }
        } else {
            m--;
            eflag = 2;
        }
        int newLen = len - (m - mm);
        int[][] res = new int[newLen][2];
        System.arraycopy(intervals, 0, res, 0, mm);
        if (m < len - 1) {
            System.arraycopy(intervals, m + 1, res, mm + 1, len - 1 - m);
        }
        if (sflag == 0) {
            res[mm][0] = newInterval[0];
        } else {
            res[mm][0] = intervals[mm][0];
        }
        if (eflag == 2) {
            res[mm][1] = newInterval[1];
        } else {
            res[mm][1] = intervals[m][1];
        }
        return res;
    }
}
