package od.ext.niu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.HashMap;

public class BCJ {

    static class UnionFind {
        int[] f;
        int[] s;
        int[] h;

        public UnionFind(int max) {
            f = new int[max];
            s = new int[max];
            h = new int[max];
            for (int i = 0; i < max; i++) {
                f[i] = i;
                s[i] = 1;
            }
        }

        public String isSameSet(int a, int b) {
            return find(a) == find(b) ? "Yes" : "No";
        }

        public void union(int a, int b) {
            int aa = find(a);
            int bb = find(b);
            if (aa != bb) {
                if (s[aa] > s[bb]) {
                    f[bb] = aa;
                    s[aa] += s[bb];
                } else {
                    f[aa] = bb;
                    s[bb] += s[aa];
                }
            }
        }

        public int find(int i) {
            int d = 0;
            while (f[i] != i) {
                h[d++] = i;
                i = f[i];
            }
            while (d > 0) {
                f[h[--d]] = i;
            }
            return i;
        }
    }


    public static void main(String[] args) throws IOException {
        UnionFind uu = new UnionFind(100);
        System.out.println(uu.isSameSet(1, 3));
        uu.union(1, 3);
        System.out.println(uu.isSameSet(1, 3));


//        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
//        while (in.nextToken() != StreamTokenizer.TT_EOF) {
//            int a = (int) in.nval;
//            in.nextToken();
//            int b = (int) in.nval;
//            UnionFind uu = new UnionFind(a);
//            for (int i = 0; i < b; i++) {
//                in.nextToken();
//                int n1 = (int) in.nval;
//                in.nextToken();
//                int n2 = (int) in.nval;
//                in.nextToken();
//                int n3 = (int) in.nval;
//                if (n1 == 1) {
//                    System.out.println(uu.isSameSet(n2, n3));
//                } else {
//                    uu.union(n2, n3);
//                }
//            }
//        }

    }
}
