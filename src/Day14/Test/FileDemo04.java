package Day14.Test;
/*
@ClassName:     FileDemo04
@Author:        YangXu
@Need:
@Date:          2022/4/12
@Time:          2022-04-12 10:25
*/

//

import java.io.File;
import java.io.IOException;

public class FileDemo04 {
  public static void main(String[] args) throws IOException {
    //
    File file = new File("D:\\Test\\");
    File file1 = new File("Test\\b.txt");
    String absolutePath = file.getAbsolutePath();

    //    System.out.println(file.getPath());

    /*    file1.mkdirs();
    file.mkdirs();*/
    //    System.out.println(absolutePath);

    String path = file.getPath();
    //    System.out.println(path);

    String name = file.getName();
    //    System.out.println(name);

    File[] files = file.listFiles();
    for (File f : files) {

      if (f.isFile()) {
        System.out.println(f.getName());
      }
    }
    //    System.out.println(files);

    String[] list = file.list();
    for (String s : list) {
      //      System.out.println(s);
    }

    //    System.out.println(list);
  }

  // File类的获取方法

}
/*

*/
