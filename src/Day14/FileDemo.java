package Day14;
/*
@ClassName:     FileDemo
@Author:        YangXu
@Need:
@Date:          2022/4/12
@Time:          2022-04-12 11:33
*/

//

import java.io.File;

public class FileDemo {
  public static void main(String[] args) {
    //
    File file = new File("D:\\test\\新建文本文档 - 副本 (2).txt");
    File file1 = new File("D:\\test\\a.txt - 副本 (8)");

    file.delete();
    file1.delete();
  }
}
/*

*/
