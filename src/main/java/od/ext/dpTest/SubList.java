package od.ext.dpTest;


import java.util.Stack;

public class SubList {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(2);
        st.push(1);
        f(st);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
    }

    //字符串所有子序列
    public static void ss(String s, int index, String currS) {
        if (index == s.length()) {
            System.out.println(currS + "/");
            return;
        }

        ss(s, index + 1, currS + String.valueOf(s.charAt(index)));
        ss(s, index + 1, currS);
        return;
    }

    // 字符串所有 排列组合
    public static void ss1(char[] s) {
        for (int i = 0; i < s.length; i++) {

        }
    }

    public static int f(Stack<Integer> st) {
        Integer result = st.pop();
        if (st.isEmpty()) {
            return result;
        } else {
            int last = f(st);
            st.push(result);
            return last;
        }
    }
}
