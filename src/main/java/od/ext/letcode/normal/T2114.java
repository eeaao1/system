package od.ext.letcode.normal;

import java.util.Map;
import java.util.TreeMap;

public class T2114 {

    public int mostWordsFound(String[] sentences) {
        int res = 0;
        for (String s : sentences) {
            res = Math.max(res, s.split(" ").length);
        }
        return res;
    }
}
