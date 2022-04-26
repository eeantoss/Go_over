package Day14;
/*
@ClassName:     FileDemo02
@Author:        YangXu
@Need:
@Date:          2022/4/12
@Time:          2022-04-12 9:49
*/

//

import java.io.File;
import java.io.IOException;

public class FileDemo02 {
  public static void main(String[] args) throws IOException {
    //

    File file = new File("D:\\Test\\");
    File file1 = new File(file, "tmp.txt");

    boolean exists = file1.exists();
    System.out.println("文件是否存在" + exists);
    while (true) {
      if (exists) {
        System.out.println("文件存在");
        //        file.mkdirs();
        //        System.out.println("文件创建成功");
        break;
      } else {
        //      file1.delete();
        System.out.println("文件不存在");
        file.mkdirs();
        file1.createNewFile();
        System.out.println("文件创建成功");
        break;
      }
    }
  }
}
/*

*/
