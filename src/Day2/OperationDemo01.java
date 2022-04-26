package Day2;/*
    @ClassName:     OperationDemo01
    @Author:        YangXu
    @Need:          
    @Date:          2022/3/17
    @Time:          9:54
    */


public class OperationDemo01 {
    public static void main(String[] args) {
        // 1、+遇到字符串都表示
        System.out.println((1 + 2 + 3 + "广西经贸" + 5 + 6));// 6广西经贸56
        //不拼接写法
        System.out.println((1 + 2 + 3 + "广西经贸" + (5 + 6)));// 6广西经贸11
        // 自增 和 自减 ，注意 前++ 和 后++ 的区别
        //变量前 ++ , 变量自身 + 1 然后参与运算
        //变量后 ++ , 先参与运算, 然后自身+1
        int a = 5; // a:5  a:6 a:7
        int b = a++; // a: 5  b:5
        int c = ++a; // a: 6  a: 7
        System.out.println("b:"+b);//  b: 5
        System.out.println("c:"+c);//  c: 7

        int x=4;
        int y = 5;
/*        System.out.println(x++ > 5 & y++ > 6);
        System.out.println(x);
        System.out.println(y);*/
        System.out.println(x++ > 5 && y++ > 6);
        System.out.println(x);
        System.out.println(y);

    }
}
/*

 */