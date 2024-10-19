package od.ext.letcode.normal;

public class T7 {

    public static void main(String[] args) {

        System.out.println(reverse(-2147483648));
    }

    public static int reverse(int x) {
        boolean fuhao = true;
        if (x < 0) {
            fuhao = false;
        }
        Long xl = Long.valueOf(x);
        xl = Math.abs(xl);
        String xs = String.valueOf(xl);
        int len = xs.length();
        char[] xscs = xs.toCharArray();
        char[] xcs = new char[len];
        int ind = 0;
        for (int i = len - 1; i > -1; i--) {
            xcs[ind] = xscs[i];
            ind++;
        }
        Long res = Long.valueOf(String.valueOf(xcs));
        if (!fuhao) {
            res = -res;
        }
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
            return 0;
        }
        return res.intValue();
    }
}
