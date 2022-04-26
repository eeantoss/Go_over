package Day14;
/*
@ClassName:     FileDemo05
@Author:        YangXu
@Need:
@Date:          2022/4/12
@Time:          2022-04-12 11:42
*/

//

import java.io.File;

public class FileDemo05 {
  public static void main(String[] args) {
    //

    File file = new File("D:\\test");
    getAblousePath(file);
  }

  public static void getAblousePath(File a) {

    File[] files = a.listFiles();
    for (File f : files) {
      if (f.isFile()) {
        System.out.println(f.getAbsolutePath());
      } else {
        getAblousePath(f);
      }
    }
  }
}
/*

*/
