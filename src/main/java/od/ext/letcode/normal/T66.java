package od.ext.letcode.normal;

public class T66 {

    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int tmp;
        boolean f = false;
        for (int i = len - 1; i > -1; i--) {
            tmp = digits[i];
            if (tmp == 9) {
                digits[i] = 0;
            } else {
                f = true;
                digits[i] = tmp + 1;
                break;
            }
        }
        if (f) {
            return digits;
        } else {
            int[] ints = new int[len + 1];
            System.arraycopy(digits, 0, ints, 1, len);
            ints[0] = 1;
            return ints;
        }
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }

    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        if (x < 4) {
            return 1;
        }
        long l = 1;
        long r = x / 2;
        long m = 0;
        long mm = 0;
        while (l <= r) {
            m = l + (r - l) / 2;
            mm = m * m;
            if (mm > x) {
                r = m - 1;
            } else if (mm < x) {
                l = m + 1;
            } else {
                return (int)m;
            }
        }
        if (mm > x) {
            return (int)(m - 1);
        } else {
            return (int) m;
        }
    }
}
