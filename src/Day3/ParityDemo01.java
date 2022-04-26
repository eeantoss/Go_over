package Day3;/*
    @ClassName:     BaseEvenDemo
    @Author:        YangXu
    @Need:          判断基偶数
    @Date:          2022/3/17
    @Time:          11:22
    */


import java.util.Scanner;

public class ParityDemo01 {
    public static void main(String[] args) {
        //新建Scanner对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数:");// 4
        int number = sc.nextInt();//接受键盘录入的int类型数据
        if (number % 2 == 0){  // 4 / 2 = 2...0
            System.out.println(number + "是偶数");
        }else{
            System.out.println(number + "是基数");
        }

    }
}
/*

 */