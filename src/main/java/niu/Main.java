package niu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {


//    public static void main(String[] args) throws IOException {
//        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
//        in.nextToken();
//        int n = (int)in.nval;
//        char[] chars = String.valueOf(n).toCharArray();
//        int res = 0;
//        for (int i = 0; i < chars.length ; i++) {
//            int i1 = chars[i] - '0';
//            if (i1 > 4) {
//                i1--;
//            }
//            res = res * 9 + i1;
//        }
//
//        System.out.println(res);
//    }

    public static void main(String[] args) throws IOException {
//        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
//        in.nextToken();
//        String x = in.sval;
//        System.out.println(p(x));
        System.out.println(p("bcbcbc"));
    }

    //  0 1 2 3 4 5
    public static int p(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        int r = 0;
        int max = 0;
        boolean tmp = false;
        // i 0   o 1  x 2
        int[] cishu = new int[3];

        ArrayList<Integer> iID = new ArrayList<>();
        ArrayList<Integer> oID = new ArrayList<>();
        ArrayList<Integer> xID = new ArrayList<>();


        while (r != 0 || !tmp) {
            if (!tmp) {
                tmp = true;
            }
            if ('l' == chars[r]) {
                cishu[0]++;
                iID.add(r);
            }
            if ('o' == chars[r]) {
                cishu[1]++;
                oID.add(r);

            }
            if ('x' == chars[r]) {
                cishu[2]++;
                xID.add(r);
            }
            if (ss(cishu[0], cishu[1], cishu[2])) {
                max = Math.max(max, getL(0, r, n));
            }
            if (r == n - 1) {
                r = -1;
            }
            r++;
        }
        int ll = -1;
        int oo = -1;
        int xx = -1;
        if (cishu[0] % 2 == 1) {
            ll = iID.get(iID.size() - 1);
        }
        if (cishu[1] % 2 == 1) {
            oo = iID.get(iID.size() - 1);
        }
        if (cishu[2] % 2 == 1) {
            xx = iID.get(iID.size() - 1);
        }
        max = Math.max(max, getL(Math.min(xx, Math.min(ll, oo)), Math.max(xx, Math.max(ll, oo)), n));
        return max;
    }

    public static int getL(int l, int r, int n) {
        if (l > r) {
            return n - (l - r - 1);
        } else {
            return r - l + 1;
        }
    }

    public static boolean ss(int a, int b, int c) {
        if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
//
//    public static int p(String s) {
//        char[] chars = s.toCharArray();
//        int n = chars.length;
//        int l = 0;
//        int r = 0;
//        int max = 0;
//        boolean tmp = false;
//        // i 0   o 1  x 2
//        int[] cishu = new int[3];
//        // 0,1  i    2,3 o   4,5 x
//        int[] cxid = new int[6];
//        Queue<Integer> iID = new LinkedList<>();
//        Queue<Integer> oID = new LinkedList<>();
//        Queue<Integer> xID = new LinkedList<>();
//        while (l != 0 || !tmp) {
//            if ('i' == chars[r]) {
//                cishu[0]++;
//                iID.add(r);
//                if (ss(cishu[0], cishu[0], cishu[0])) {
//                    max = Math.max(max, getL(l, r, n));
//                }
//                if (cishu[0] == 0) {
//                    cishu[0]++;
//                    cxid[0] = r;
//                } else if (cishu[0] == 1) {
//                    cishu[0]++;
//                    cxid[1] = r;
//                } else {
//                    l = cxid[0] + 1;
//                    cxid[0] = cxid[1];
//                    cxid[1] = r;
//                    if (ss(cishu[0], cishu[0], cishu[0])) {
//                        max = Math.max(max, getL(l, r, n));
//                    }
//                }
//
//            }
//            if ('o' == chars[r]) {
//                if (cishu[1] == 0) {
//                    cishu[1]++;
//                    cxid[2] = r;
//                } else if (cishu[1] == 1) {
//                    cishu[1]++;
//                    cxid[3] = r;
//                } else {
//                    l = cxid[2] + 1;
//                    cxid[2] = cxid[3];
//                    cxid[3] = r;
//                    if (ss(cishu[0], cishu[0], cishu[0])) {
//                        max = Math.max(max, getL(l, r, n));
//                    }
//                }
//            }
//            if ('x' == chars[r]) {
//                if (cishu[2] == 0) {
//                    cishu[2]++;
//                    cxid[4] = r;
//                } else if (cishu[2] == 1) {
//                    cishu[2]++;
//                    cxid[5] = r;
//                } else {
//                    l = cxid[4] + 1;
//                    cxid[4] = cxid[5];
//                    cxid[5] = r;
//                    if (ss(cishu[0], cishu[0], cishu[0])) {
//                        max = Math.max(max, getL(l, r, n));
//                    }
//                }
//            }
//            if (r == n - 1) {
//                r = -1;
//            }
//            r++;
//            if (l != 0 && !tmp) {
//                tmp = true;
//            }
//        }
//        return max;
//    }