package Day15.Demo01.StringDemo;
/*
@ClassName:     StringDemo02
@Author:        YangXu
@Need:
@Date:          2022/4/14
@Time:          2022-04-14 9:34
*/

//

import java.io.*;

public class StringDemo02 {
  public static void main(String[] args) throws IOException {
    // 字符流的定义方法1
    InputStreamReader isr1 = new InputStreamReader(new FileInputStream("E:\\e.txt"));
    // 一次读一个字节
    int i;
    while ((i = isr1.read()) != -1) {
      System.out.println(i);
    }

    // 关闭资源
    isr1.close();
    // 字符流的定义方法2
    InputStreamReader isr2 = new InputStreamReader(new FileInputStream("E:\\a.exe"), "utf-8");
    // 字节数组读取
    char[] cha = new char[1024];
    int i1;
    while ((i1 = isr2.read(cha)) != -1) {
      System.out.println(cha);
    }

    // 字符流的定义方法3
    OutputStreamWriter osw1 = new OutputStreamWriter(new FileOutputStream("E:\\e.txt"));
    // 用字符串的方式 写入张三
    osw1.write("张三");

    // 写入int类型的字符
    int a = 12312412;
    osw1.write(a);

    // 写入char类型的数组
    char[] chars = new char[] {'李', '四'};
    osw1.write(chars);

    // 写入char类型数组的一部分
    char[] chars1 = new char[] {'王', '五'};
    osw1.write(chars1, 0, 1);

    // 写入String类型的字符串，附带长度
    String ss1 = "张三";
    String ss2 = "刘六";
    // 从第一个字符开始写入,写入一个字符串
    osw1.write(ss1, 1, 1);
    // 关闭资源
    osw1.close();

    // 字符流的定义方法4
    OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream("E:\\e1.txt"), "gbk");
    osw2.write("张三");

    // 写入int类型的字符
    int b = 12312412;
    osw2.write(b);

    // 写入char类型的数组
    char[] chars2 = new char[] {'李', '四'};
    osw2.write(chars2);

    // 写入char类型数组的一部分
    char[] chars3 = new char[] {'王', '五'};
    osw2.write(chars3, 0, 1);

    // 写入String类型的字符串,附带长度
    osw2.write("这就五个字", 1, 2); // 写入 这就五个字，从第一个开始写,写入两个长度

    // 刷新流
    osw1.flush();
    osw2.flush();

    // 关闭资源
    osw1.close();
    osw2.close();
  }
}
/*

*/
