package Day3.SwitchDemo;/*
    @ClassName:     SwitchTest2
    @Author:        YangXu
    @Need:          请编写一个程序，该程序可以接收一个字符，比如:a.b.c.d.e.f.g
                    a表示星期一，b表示星 期二= ..
                    根据用户的输入显示相应的信息要求使用iswitch语句完成
                    提示: char c = scanner. next().charAt(0);//读取第0个字符
    @Date:          2022/3/18
    @Time:          11:40
    */

//


import java.util.Scanner;

public class SwitchTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入:");
        char s = sc.next().charAt(0);//读取字符的第0个---->如abcs只读取a
        switch (s){
            case 'a':
                System.out.println("星期一");
                break;
            case 'b':
                System.out.println("星期二");
                break;
            case 'c':
                System.out.println("星期三");
                break;
            case 'd':
                System.out.println("星期四");
                break;
            case 'e':
                System.out.println("星期五");
                break;
            case 'f':
                System.out.println("星期六");
                break;
            case 'g':
                System.out.println("星期七");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
}
/*

 */