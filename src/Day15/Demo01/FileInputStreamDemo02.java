package Day15.Demo01;
/*
@ClassName:     FileInputStreamDemo02
@Author:        YangXu
@Need:
@Date:          2022/4/13
@Time:          2022-04-13 10:11
*/

//

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo02 {
  public static void main(String[] args) throws IOException {
    //
    FileInputStream fis = new FileInputStream("D:\\ab.txt");

    int by;

    while ((by = fis.read()) != -1) {
      System.out.println((char) by);
    }
    // 关闭资源
    fis.close();
  }
}
/*

*/
