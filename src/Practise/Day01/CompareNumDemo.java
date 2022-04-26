package Practise.Day01;/*
    @ClassName:     CompareNumDemo
    @Author:        YangXu
    @Need:          声明2个double型变量并赋值，判断第一个数大于10.0，且第2个数小于20.0，打印两数之和。
    @Date:          2022/3/17
    @Time:          21:34
    */

//
public class CompareNumDemo {
    public static void main(String[] args) {
        //声明两个double型的变量
        double d1 = 10.3;
        double d2 = 10.7;

        //判断第一个数是否大于10.0  并且 第二个数也小于20.0
        if (d1 > 10.0 && d2 < 20.0){
            System.out.println("两个数的和是"+(d1 + d2));
        }else {
            System.out.println("不满足要求");
        }
    }
}
/*

 */