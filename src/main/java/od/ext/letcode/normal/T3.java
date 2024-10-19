package od.ext.letcode.normal;

public class T3 {

    public static void main(String[] args) {

        ThreadLocal<Integer> tl1 = new ThreadLocal<>();
        ThreadLocal<Integer> tl2 = new ThreadLocal<>();
        ThreadLocal<Integer> tl3 = new ThreadLocal<>();
        tl1.set(1);
        tl2.set(2);
        tl3.set(3);
        Thread thread = Thread.currentThread();
    }

    public static int lengthOfLongestSubstring(String s) {
        int res = 0;
        int t = 1;
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i - 1; j > -1; j--) {
                if (chars[j] == chars[i]) {
                    t = i - j;
                    break;
                } else if (t == i - j) {
                    t++;
                    break;
                }
            }
            res = Math.max(res, t);
        }
        return res;
    }
}
