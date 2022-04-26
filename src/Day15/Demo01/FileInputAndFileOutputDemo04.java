package Day15.Demo01;
/*
@ClassName:     FileInputAndFileOutputDemo04
@Author:        YangXu
@Need:
@Date:          2022/4/13
@Time:          2022-04-13 11:01
*/

//

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileInputAndFileOutputDemo04 {
  public static void main(String[] args) {
    // 定义字节输出流
    FileOutputStream fos = null;
    FileInputStream fis = null;
    try {

      fos = new FileOutputStream("E:\\a.exe");
      fis = new FileInputStream("D:\\b.txt");
      byte[] b = new byte[10];
      int read = fis.read(b);
      System.out.println(Arrays.toString(b));
      System.out.println(b);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        fis.close();
        fos.close();
      } catch (IOException e) {

      }
    }
  }
}
/*

*/
