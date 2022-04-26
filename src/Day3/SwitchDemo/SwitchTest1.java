package Day3.SwitchDemo;/*
    @ClassName:     SwitchTest1
    @Author:        YangXu
    @Need:          
    @Date:          2022/3/18
    @Time:          10:47
    */

//


import java.util.Scanner;

public class SwitchTest1 {
    public static void main(String[] args) {
        Switchtest2();
    }
    public static void Switchtest2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        switch (month){
            case 3 :
            case 4:
            case 5:
                System.out.println("夏季");
                break;
            case 6 :
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9 :
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12 :
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
    public static void Switchtest1(){
        System.out.println("请输入一个整数,范围在1~7里面");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("今天是星期一,我要努力学习");
                break;
            case 2:
                System.out.println("今天是星期二,我还要努力学习");
                break;
            case 3:
                System.out.println("今天是星期三,我依然要努力学习");
                break;
            case 4:
                System.out.println("今天是星期四,我肯定还要努力学习");
                break;
            case 5:
                System.out.println("今天是星期五,我依然肯定还要努力学习");
                break;
            case 6:
                System.out.println("今天是星期六,我肯定还要非常努力得去学习");
                break;
            case 7:
                System.out.println("今太是星期天,我依然要废寝忘食地去学习");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }

}
/*

 */