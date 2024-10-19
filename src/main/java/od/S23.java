package od;

/**
 公司用一个字符串来表示员工的出勤信息
 1.absent:缺勤
 2.late:迟到
 3.leaveearly:早退
 4.present:正常上班
 现需根据员工出勤信息，判断本次是否能获得出勤奖，能获得出勤奖的条件如下
 缺勤不超过一次;
 没有连续的迟到/早退，
 任意连续7次考勤，缺勤/迟到/早退不超过3次。

 输入描述:
 用户的考勤数据字符串
 第一行为考勤记录次数N
 接下来N行为考勤记录，每行考勤记录为一个礼拜的考勤记录可能不一定为七个
 1.记录条数 >=1;
 2.输入字符串长度<10000;
 3.不存在非法输入;

 输出描述：
 根据考勤数据字符串，如果能得到考勤奖，输出"true”;否则输出"false”
 每个结果之间用空格隔开
 */
public class S23 {

//    public static void main(String[] args) {
//        System.out.println(ss(17));
//    }

    public static void ss(int s) {
        int[] q ={8 ,6 ,2 ,8 ,6};
        String[][] t = new String[4][6];
//        t[0][] = {"camila" ,"66" ,"70" ,"46" ,"158", "80"};
//        TreeMap<Integer, TreeSet> map = new TreeMap<>();
//        for(){
//
//        }
    }
}
