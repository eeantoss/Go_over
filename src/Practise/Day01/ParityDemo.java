package Practise.Day01;/*
    @ClassName:     ParityDemo
    @Author:        YangXu
    @Need:          从键盘录入一个数，判断该数是偶数还是奇数，并打印出控制台
    @Date:          2022/3/17
    @Time:          21:29
    */

//


import java.util.Scanner;

public class ParityDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);// 新建一个Scanner对象

        System.out.println("----判断奇偶数----");
        System.out.println("请输入一个数：");

        int i = sc.nextInt();//键盘录入一个数并且赋值给i

        if (i % 2 == 0){    //用 i 除以 2
            System.out.println(i+"是偶数");
        }else{
            System.out.println(i+"是奇数");
        }
    }
}
/*

 */