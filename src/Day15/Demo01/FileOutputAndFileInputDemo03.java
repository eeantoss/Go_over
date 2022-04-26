package Day15.Demo01;
/*
@ClassName:     FileOutputAndFileInputDemo03
@Author:        YangXu
@Need:
@Date:          2022/4/13
@Time:          2022-04-13 10:37
*/

//

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputAndFileInputDemo03 {
  public static void main(String[] args) {
    //
    FileOutputStream fos = null;
    FileInputStream fis = null;
    try {
      fos = new FileOutputStream("E:\\kali.7z");
      fis = new FileInputStream("E:\\kali-linux-2019.3-vmware-amd64.7z");
      byte[] b = new byte[1024];
      long l = System.currentTimeMillis();
      ;
      int len;
      while ((len = fis.read(b)) != -1) {
        fos.write(b, 0, len); // 从数组的1024个字节中，从0开始，到所需要的长度
      }
      long l1 = System.currentTimeMillis();
      int i = (int) (l1 - l);
      System.out.println(i);
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
    /*
    / TODO: 2022/4/13 没写
     */
  }
}
/*

*/
