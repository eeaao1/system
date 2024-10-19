package od;

import java.util.HashMap;
import java.util.Map;

/**
 给定用户密码输入流input，输入流中字符'<'表示退格，可以清除前一个输入的字符，请你编写程序，输出最终得到的密码字符，并判断密码是否满足如下的密码安全要求。
 ​ 密码安全要求如下：
 ​ 1.密码长度>=8;
 ​ 2.密码至少需要包含1个大写字母;
 ​ 3.密码至少需要包含1个小写字母;
 ​ 4.密码至少需要包含1个数字;
 ​ 5.密码至少需要包含1个字母和数字以外的非空白特殊字符
 ​ 注意空串退格后仍然为空串，且用户输入的字符串不包含‘<’字符和空白字符。
 ​

 输入描述
 用一行字符串表示输入的用户数据，输入的字符串中‘<’字符标识退格，用户输入的字符串不包含空白字符，例如：ABC<c89%000<

 输出描述
 输出经过程序处理后，输出的实际密码字符串，并输出改密码字符串是否满足密码安全要求。两者间由‘,’分隔， 例如：ABc89%00,true

 示例1
 输入

 ABC<c89%000<
 输出

 ABc89%00,true

 作者：不上岸不改名！
 链接：https://www.nowcoder.com/discuss/633995528522498048?sourceSSR=search
 来源：牛客网
 */
public class S3 {
    public static void main(String[] args) {

        System.out.println(Integer.valueOf('a'));//97
        System.out.println(Integer.valueOf('z'));//122
        System.out.println(Integer.valueOf('A'));//65
        System.out.println(Integer.valueOf('Z'));//90
        System.out.println(Integer.valueOf('0'));//90
        System.out.println(Integer.valueOf('9'));//90
        boolean[] bl = new boolean[5];
        String ss = ss("ABC<c89%000<", bl);
        System.out.println(ss );
        if (ss.length()>=8 && bl[1] && bl[2] && bl[3] && bl[4]){
            System.out.println("true" );
        }else{
            System.out.println("false" );
        }
    }
    public static String ss(String input, boolean[] bl) {
        String rs = "";
        for (char c :input.toCharArray()){
            if (c == '<' && rs.length()>0){
                rs = rs.substring(0, rs.length()-1);
            } else {
                rs += c;
                if(c>=65 && c<=90){
                    bl[1] = true;
                }
                else if(c>=97 && c<=122){
                    bl[2] = true;
                } else if(c>=48 && c<=57){
                    bl[3] = true;
                } else{
                    bl[4] = true;
                }
            }
        }
        return rs;
    }
}
