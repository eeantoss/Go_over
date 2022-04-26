package Day15.Demo01;
/*
@ClassName:     BufferDemo
@Author:        YangXu
@Need:
@Date:          2022/4/13
@Time:          2022-04-13 11:53
*/

//

import java.io.*;

public class BufferDemo {
  public static void main(String[] args) throws IOException {
    //
    BufferedOutputStream bfo = new BufferedOutputStream(new FileOutputStream("D:\\1.exe"));
    BufferedInputStream bfi = new BufferedInputStream(new FileInputStream("E:\\b.exe"));

    byte[] bys = new byte[1024];
    int len;
    while ((len = bfi.read(bys)) != -1) {
      bfo.write(bys);
    }
  }
}
/*

*/
