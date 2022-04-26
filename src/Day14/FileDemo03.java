package Day14;
/*
@ClassName:     FileDemo03
@Author:        YangXu
@Need:
@Date:          2022/4/12
@Time:          2022-04-12 10:17
*/

import java.io.File;
import java.io.IOException;

// 判断方法
public class FileDemo03 {
  public static void main(String[] args) throws IOException {
    //

    File file = new File("D:\\test\\");
    File file1 = new File(file, "a.txt");
    // 创建目录
    //    file.mkdirs();
    // 创建文件
    //    file1.createNewFile();
    file1.mkdirs();

    // 判断文件是否存在
    if (file1.exists()) {
      System.out.println("文件存在");
      if (file1.isFile()) {
        System.out.println(file1 + "不是文件");
        if (file1.isDirectory()) {
          System.out.println(file1 + "是目录");
        } else {
          System.out.println(file1 + "不是目录");
        }
      } else {
        System.out.println(file1 + "是文件");
      }
    } else {
      System.out.println("文件不存在");
    }
    file.delete();
  }
}
/*

*/
