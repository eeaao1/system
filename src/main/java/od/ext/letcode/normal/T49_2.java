package od.ext.letcode.normal;

import java.util.*;

public class T49_2 {
    public static void main(String[] args) {
        groupAnagrams(new String[]{"ac", "c"});
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<List<String>> res = new ArrayList<>();
        HashMap<Integer, HashMap<Integer, Integer>> ff = new HashMap<>();
        boolean ffff = false;
        for (int j = 0; j < strs.length; j++) {
            HashMap<Integer, Integer> f = f(strs[j]);
            for (int r = 0; r < res.size(); r++) {
                if (compare(ff.get(r), f)) {
                    res.get(r).add(strs[j]);
                    ffff = true;
                    break;
                }
            }
            if (!ffff) {
                ArrayList<String> subres = new ArrayList<>();
                subres.add(strs[j]);
                ff.put(res.size(), f);
                res.add(subres);
            }
            ffff = false;
        }
        return res;
    }

    public static HashMap<Integer, Integer> f(String n) {
        HashMap<Integer, Integer> res = new HashMap<>();
        char[] nc = n.toCharArray();
        int key;
        for (int i = 0; i < nc.length; i++) {
            key = nc[i] - 'a';
            Integer tt = res.get(key);
            if (tt == null) {
                res.put(key, 1);
            } else {
                res.put(key, res.get(key) + 1);
            }
        }
        return res;
    }

    public static boolean compare(HashMap<Integer, Integer> of, HashMap<Integer, Integer> nf) {
        if (of.size() != nf.size()) {
            return false;
        }
        Set<Map.Entry<Integer, Integer>> entries = nf.entrySet();
        for (Map.Entry en : entries) {
            if (of.get(en.getKey()) != en.getValue()) {
                return false;
            }
        }
        return true;
    }
}
