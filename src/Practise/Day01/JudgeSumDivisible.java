package Practise.Day01;/*
    @ClassName:     JudgeSum
    @Author:        YangXu
    @Need:          定义两个变量int，判断二者的和是否能被3又能被5整除，可以整除就打印提示信息，否则也打印提示信息。
    @Date:          2022/3/17
    @Time:          21:42
    */

//


import java.util.Scanner;

public class JudgeSumDivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //定义两个数
        System.out.print("请输入第一个数：");
        int num1 = sc.nextInt();
        System.out.print("请输入第二个数");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        if (sum % 3 == 0 || sum % 5 == 5){
//        if ((num1 + num2) %3 %5 == 0){
            System.out.println("两个数的和可以被3整除跟5整除");
        }else{
            System.out.println("两个数的和可以被3整除跟5整除");
        }
    }
}
/*

 */