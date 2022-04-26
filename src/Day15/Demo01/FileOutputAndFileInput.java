package Day15.Demo01;
/*
@ClassName:     FileOutputAndFileInput
@Author:        YangXu
@Need:
@Date:          2022/4/13
@Time:          2022-04-13 10:23
*/

//

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputAndFileInput {
  public static void main(String[] args) throws IOException {
    //
    FileInputStream fis = new FileInputStream("D:\\ab.txt");
    FileOutputStream fos = new FileOutputStream("E:\\ab.txt");
    int bt;
    while ((bt = fis.read()) != -1) {
      fos.write(bt);
    }
    // 关闭资源 先打开的最后关闭
    fos.close();
    fis.close();
  }
}
/*

*/
