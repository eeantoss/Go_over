package Day2;/*
    @ClassName:     OperationDemo02
    @Author:        YangXu
    @Need:          三元运算符案例
    @Date:          2022/3/17
    @Time:          10:15
    */


import java.util.Scanner;

public class OperationDemo02 {
    //
    public static void main(String[] args) {
/*        //定义两个整数变量
        int h1 = 175;
        int h2 = 173;

        //用三元运算符比较两个数是否相同，相同则返回true，不相同则返回flase
        boolean result = h1 == h2 ? true : false;
        System.out.println("h1 和 h2是否相同 :"+result);*/
T1();
    }

    public static void T1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数:");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数:");
        int num2 = sc.nextInt();
        boolean result = num1 == num2 ? true : false;
        System.out.println(("num1+与+num2是否相等")+":\t"+result);
    }
}
/*

 */