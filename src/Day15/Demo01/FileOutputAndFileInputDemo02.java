package Day15.Demo01;
/*
@ClassName:     FileOutputAndFileInputDemo02
@Author:        YangXu
@Need:
@Date:          2022/4/13
@Time:          2022-04-13 10:29
*/

//

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputAndFileInputDemo02 {
  public static void main(String[] args) {
    //
    FileInputStream fis = null;
    FileOutputStream fos = null;
    try {

      fis = new FileInputStream("C:\\Users\\null\\Pictures\\3.jpg");
      fos = new FileOutputStream("D:\\3.jpg");
      int b;
      while ((b = fis.read()) != -1) {
        fos.write(b);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        fis.close();
        fos.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
/*

*/
