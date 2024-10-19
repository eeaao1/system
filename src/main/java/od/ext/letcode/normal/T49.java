package od.ext.letcode.normal;

import java.util.ArrayList;
import java.util.List;

public class T49 {
    public static void main(String[] args) {
        groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<List<String>> res = new ArrayList<>();
        int[][] ff = new int[strs.length][26];
        boolean ffff = false;
        for (int j = 0; j < strs.length; j++) {
            int[] f = f(strs[j]);
            for (int r = 0; r < res.size(); r++) {
                if (compare(ff[r], f)) {
                    res.get(r).add(strs[j]);
                    ffff = true;
                    break;
                }
            }
            if (!ffff) {
                ArrayList<String> subres = new ArrayList<>();
                subres.add(strs[j]);
                ff[res.size()] = f;
                res.add(subres);
            }
            ffff = false;
        }
        return res;
    }

    public static int[] f(String n) {
        int[] res = new int[26];
        char[] nc = n.toCharArray();
        for (int i = 0; i < nc.length; i++) {
            res[nc[i] - 'a']++;
        }
        return res;
    }

    public static boolean compare(int[] of, int[] nf) {
        for (int i = 0; i < nf.length; i++) {
            if (nf[i] != of[i]) {
                return false;
            }
        }
        return true;
    }
}
