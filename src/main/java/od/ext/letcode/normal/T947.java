package od.ext.letcode.normal;

public class T947 {
    public static void main(String[] args) {
//        System.out.println(removeStones(new int[][]{{0, 0}, {0, 1}, {1, 0}, {1, 2}, {2, 1}, {2, 2}}));
        System.out.println(removeStones(new int[][]{{0, 1}, {1, 2}, {1, 3}, {3, 3}, {2, 3}, {0, 2}}));
//        System.out.println(removeStones(new int[][]{{0, 1}, {1, 0}, {1, 1}}));
    }


    public static int removeStones(int[][] stones) {
        int[] f = new int[stones.length];
        int[] s = new int[f.length];
        for (int i = 0; i < f.length; i++) {
            f[i] = i;
            s[i] = 1;
        }
        int steps = 0;
        for (int i = 1; i < stones.length; i++) {
            for (int j = 0; j < i; j++) {
                if (stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1]) {
                    int i1 = find(i, f);
                    int i2 = find(j, f);
                    union(i1, i2, f, s);
                }
            }
        }
        for (int i = 0; i < f.length; i++) {
            if (f[i] == i) {
                steps++;
            }
        }
        return f.length - steps;
    }

    public static int find(int i, int[] f) {
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

    public static void union(int i1, int i2, int[] f, int[] s) {
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
