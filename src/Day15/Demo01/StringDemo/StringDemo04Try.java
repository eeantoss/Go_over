package Day15.Demo01.StringDemo;
/*
@ClassName:     StringDemo04Try
@Author:        YangXu
@Need:          字符流处理数据----处理异常
@Date:          2022/4/14
@Time:          2022-04-14 10:20
*/

//

import java.io.*;

public class StringDemo04Try {
  public static void main(String[] args) {
    //
    OutputStreamWriter osw = null;
    InputStreamReader isr = null;
    try {
      osw = new OutputStreamWriter(new FileOutputStream("E:\\test\\qq1.jpg"));
      isr = new InputStreamReader(new FileInputStream("E:\\test\\qq.jpg"));

      char[] ch = new char[1024];
      int i;
      while ((i = isr.read(ch)) != -1) {
        osw.write(ch, 0, i);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      System.out.println("处理完毕");
      try {
        isr.close();
        osw.flush();
        osw.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
/*

*/
