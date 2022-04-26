package Day15.Demo01;
/*
@ClassName:     FileInputStreamDemo1
@Author:        YangXu
@Need:
@Date:          2022/4/13
@Time:          2022-04-13 10:06
*/

//

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo1 {
  public static void main(String[] args) throws IOException {
    //
    FileInputStream fileInputStream = new FileInputStream("D:\\ab.txt");
    // 读出数据 一次读一个字节
    int read = fileInputStream.read();
    System.out.println(read);
    fileInputStream.close();
  }
}
/*

*/
