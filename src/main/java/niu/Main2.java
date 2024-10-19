package niu;

import java.util.ArrayList;

//实现一个自有定义的漏斗
//如：
//1、输入：num=3,edge=9;输出：
//333333333
// 3333333
//  33333
//   333
//    3
//   333
//  33333
// 3333333
//333333333
//
//2、输入：num=4,edge=5;输出：
//44444
// 444
//  4
// 444
//44444
public class Main2 {

    public static void main(String[] args) {
        p(4, 7);
    }

    public static void p(int num, int edge) {
        ArrayList<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int e = edge / 2 + 1;
        for (int i = 0; i < e; i++) {
            for (int j = 0; j < edge; j++) {
                if (j < i || (edge - 1 - j) < i) {
                    System.out.print(" ");
                    sb.append(" ");
                } else {
                    System.out.print(num);
                    sb.append(num);
                }
            }
            res.add(sb.toString());
            sb = new StringBuilder();
            System.out.println();
        }
        int size = res.size() -1;
        for (int i = size - 1; i > -1; i--) {
            System.out.println(res.get(i));
        }
    }
}
