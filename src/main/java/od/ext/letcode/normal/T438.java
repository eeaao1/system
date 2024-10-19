package od.ext.letcode.normal;

import java.util.ArrayList;
import java.util.List;

public class T438 {
    public static void main(String[] args) {
        System.out.println(findAnagrams("acdcaeccde","c"));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        char[] pc = p.toCharArray();
        char[] sc = s.toCharArray();
        int pl = pc.length;
        int sl = sc.length;
        int[] pf = new int[26];
        int[] sf = new int[26];
        for (int i = 0; i < pl; i++) {
            pf[pc[i] - 'a'] += 1;
        }
        int l = 0;
        int r = 0;
        boolean addf = true;
        List<Integer> res = new ArrayList<>();
        while (r < sl) {
            sf[sc[r] - 'a'] += 1;
            if (r - l == pl - 1) {
                addf = true;
                for (int i = 0; i < 26; i++) {
                    if (pf[i] != sf[i]) {
                        addf = false;
                        break;
                    }
                }
                if (addf) {
                    res.add(l);
                }
                sf[sc[l] - 'a'] -= 1;
                l++;
            }
            r++;
        }
        return res;
    }
}
