package Day2;/*
    @ClassName:     OperationDemo03
    @Author:        YangXu
    @Need:          用三元运算符之比较三个人的身高
    @Date:          2022/3/17
    @Time:          10:37
    */


public class OperationDemo03 {
    public static void main(String[] args) {
        // 定义三个人的身高变量
        int h1 = 170;
        int h2 = 172;
        int h3 = 176;
        //先判断 h1是否大于h2 大于的话就拿h1去跟h3比较, h2大的话就拿去h3的比较
        int result = (h1 > h2 ? (h1 > h3 ? h1 : h3) : (h2 > h3 ? h2 :h3));
        System.out.println("最高的身高是:"+result +"cm");

    }
}
/*

 */