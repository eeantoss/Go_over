package Practise.Day04;

// 演示功能：动态数组初始化
public class Array02 {
  public static void main(String[] args) {
    String[] names = new String[5];
    // 1、 通过数组下标给数组赋值,下标从0开始
    names[0] = "张无忌";
    names[1] = "赵敏";
    names[2] = "周芷若";
    names[3] = "小昭";
    names[4] = "殷离";

    // 2、数组的属性 length，表示数组的长度。数组长度声明后不可改变
    System.out.println(names.length); // 5
    // 3、数组的遍历
    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }
  }
}
