package Practise.Day01;/*
    @ClassName:     JudgeLeapYear
    @Author:        YangXu
    @Need:          判断一个年份是否是闰年，闰年的条件是符合下面二者之一
                    (1)年份能被4整除，但不能被100整除；(2)能被400整除
    @Date:          2022/3/17
    @Time:          21:48
    */
//

import java.util.Scanner;

public class JudgeLeapYear {
    public static void main(String[] args) {
        //new一个Scanner对象
        Scanner sc = new Scanner(System.in);
        //提示用户输入
        System.out.print("请输入年份：");
        // 接收键盘录入
        int year = sc.nextInt();
        //闰年的2种条件：1、年份能被4整除，但不能被100整除;
        if (( year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0){
            System.out.println("是闰年");
        }else{
            System.out.println("不是闰年");
        }
    }
}
/*

 */