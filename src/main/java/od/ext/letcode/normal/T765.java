package od.ext.letcode.normal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Stream;

public class T765 {
    public static void main(String[] args) {
        System.out.println(minSwapsCouples(new int[]{1, 4, 0, 5, 8, 7, 6, 3, 2, 9}));
    }


    public static int minSwapsCouples(int[] row) {
        int[] f = new int[row.length / 2];
        int[] s = new int[f.length];
        for (int i = 0; i < f.length; i++) {
            f[i] = i;
            s[i] = 1;
        }
        int c;
        int steps = 0;
        for (int i = 0; i < row.length; i += 2) {
            if ((row[i] & 1) == 0) {
                c = row[i] + 1;
            } else {
                c = row[i] - 1;
            }
            if (c != row[i + 1]) {
                union(row[i], row[i + 1], f, s);
            }
        }
        for (int i = 0; i < f.length; i++) {
            if (f[i] == i) {
                steps++;
            }
        }
        return f.length - steps;
    }

    public static int find(int i, int[] f, int[] s) {
        int ii = i;
        int tmp = i;
        while (f[i] != i) {
            i = f[i];
        }
        while (tmp != f[tmp]) {
            tmp = f[tmp];
            f[ii] = i;
            ii = tmp;
        }
        return i;
    }

    public static void union(int i, int j, int[] f, int[] s) {
        int i1 = find(i / 2, f, s);
        int i2 = find(j / 2, f, s);
        if (i1 != i2) {
            if (s[i1] > s[i2]) {
                f[i2] = i1;
                s[i1] += s[i2];
            } else {
                f[i1] = i2;
                s[i2] += s[i1];
            }
        }
    }
}
