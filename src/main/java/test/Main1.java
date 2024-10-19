package test;

import test.common.pojo.*;

public class Main1 {

    public static void main(String[] args) throws Exception {
        int i = 10 ^ 14;
        int r = i & (-i);
        int z=0;
        if((r  & 10) == 0){
            z ^= 10;
        }
        if((r  & 14) == 0){
            z ^= 14;
        }
        System.out.println(z);
        System.out.println(z ^ i);

    }
    private static  int tableSizeFor(int c) {
        int n = c - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= 1 << 30) ? 1 << 30 : n + 1;
    }
}


