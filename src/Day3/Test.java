package Day3;/*
    @ClassName:     Test
    @Author:        YangXu
    @Need:          
    @Date:          2022/3/18
    @Time:          10:08
    */

//


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        SesameCredit();
    }

    public static void SesameCredit(){
        int cedit;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的芝麻信用分");
        // 接受键盘录入
        cedit = sc.nextInt();
        //先判断数据是否大于有效区间1-100内
        if (cedit > 100 || cedit < 1){
            System.out.println("输入有误");
        }else{
            if (cedit == 100){ //
                System.out.println("信用极好");
            }else if (cedit > 80 && cedit <= 99){//不包含 80分 但 包含 99分 在这区间内就提示：信用优秀
                System.out.println("信用优秀");
            }else if (cedit >= 60 && cedit <=80){//包含 60分 也 包含 80 分 在这区间内就提示：信用一般
                System.out.println("信用一般");
            }else {
                System.out.println("信用不及格");
            }
        }
    }
}
/*

 */