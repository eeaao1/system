package od.ext.letcode.normal;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class T76 {

    public static void main(String[] args) {
        System.out.println(minWindow("a", "aa"));
    }

    public static String minWindow(String s, String t) {
        char[] cts = t.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
//        int[] map = new int[t.length() + 1];
        for (char c : cts) {
            Integer v = map.get(c);
            if (v == null) {
                map.put(c, 1);
            } else {
                map.put(c, v + 1);
            }
        }
        char[] tss = s.toCharArray();
        String res = "";
        int l = 0;
        int r = rr(map, -1, tss);
        while (l <= r) {
            if (isF(map)) {
                String substring = s.substring(l, r + 1);
                if (res.length() >= t.length()) {
                    res = res.length() < substring.length() ? res : substring;
                } else {
                    res = substring;
                }

                l = ll(map, l, tss);
            } else {
                if (r == tss.length - 1) {
                    l = ll(map, l, tss);
                } else {
                    r = rr(map, r, tss);
                }
            }
        }
        return res;
    }

    public static int rr(HashMap<Character, Integer> map, int r, char[] tss) {
        r = r + 1;
        Integer v = map.get(tss[r]);
        if (v != null) {
            map.put(tss[r], v - 1);
        }
        return r;
    }

    public static int ll(HashMap<Character, Integer> map, int l, char[] tss) {
        l = l + 1;
        Integer v = map.get(tss[l - 1]);
        if (v != null) {
            map.put(tss[l - 1], v + 1);
        }
        return l;
    }

    public static boolean isF(HashMap<Character, Integer> map) {
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() > 0) {
                return false;
            }
        }
        return true;
    }
}
