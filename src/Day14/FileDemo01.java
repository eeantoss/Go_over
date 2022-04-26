package Day14;
/*
@ClassName:     FileDemo01
@Author:        YangXu
@Need:
@Date:          2022/4/12
@Time:          2022-04-12 9:18
*/

//

import java.io.File;
import java.io.IOException;

public class FileDemo01 {
  public static void main(String[] args) throws IOException {
    // 文件的三种定义格式
    File file = new File("D:\\Test\\666.txt");

    // 第二种
    File file2 = new File("D:\\Test", "b.txt");

    // 第三种
    File file3 = new File("D:\\Test");
    File file4 = new File(file3, "c.txt");

    // 判断是不是文件
    boolean file1 = file.isFile();
    System.out.println(file1);
    // 新建目录
    //    file.mkdirs();
    //    System.out.println(file1);

    // 判断文件是否可以读
    //    file.canRead();

    // 判断文件是否可以写
    //    file.canWrite();

    // 判断文件是否为可执行文件
    //    file.canExecute();

    // 新建文件
    file.createNewFile();

    // 是否是文件类型
    file.isFile();

    // 是否为文件夹
    file.isDirectory();

    // 文件名称
    file.getName();

    // 文件是否存在
    file.exists();

    //    System.out.println(newFile);
  }
}
/*

*/
