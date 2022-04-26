package Day2;/*
    @ClassName:     TestDemo04
    @Author:        YangXu
    @Need:          用键盘录入三个变量，再用三元运算符比较出最大值
    @Date:          2022/3/17
    @Time:          10:59
    */


import java.util.Scanner;

public class OperationDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 定义三个身高
        System.out.println("请输入第一个人的身高:");
        int h3 = sc.nextInt();
        System.out.println("请输入第二个人的身高:");
        int h2 = sc.nextInt();
        System.out.println("请输入第三个人的身高:");
        int h1 = sc.nextInt();
        // 先判断 h1是否大于h2 大于的话就拿h1去跟h3比较, h2大的话就拿去h3的比较
        int result = (h1 > h2 ? (h1 > h3 ? h1 : h3) : (h2 > h3 ? h2 :h3));

        System.out.println("最高的身高是:"+result);
    }
}
/*

 */