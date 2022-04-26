package Day15.Demo01.StringDemo;
/*
@ClassName:     StringDemo03
@Author:        YangXu
@Need:          字符流复制文件
@Date:          2022/4/14
@Time:          2022-04-14 10:10
*/

//

import java.io.*;

public class StringDemo03 {
  public static void main(String[] args) throws IOException {
    //
    InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\test\\1.txt"));
    OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\test\\复制后的1.txt"));

    char[] chars = new char[1024];
    int len;
    while ((len = isr.read(chars)) != -1) {
      System.out.println(chars);
      osw.write(chars, 0, len);
    }
    System.out.println("复制成功");
    osw.flush();
    osw.close();

    isr.close();
  }
}
/*

*/
