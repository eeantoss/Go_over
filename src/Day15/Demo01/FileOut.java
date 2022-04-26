package Day15.Demo01;
/*
@ClassName:     FileOut
@Author:        YangXu
@Need:
@Date:          2022/4/13
@Time:          2022-04-13 9:08
*/

//

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOut {
  public static void main(String[] args) throws IOException {
    // 创建输出流对象，会创建成功文件
    FileOutputStream fileOutputStream = new FileOutputStream("D:\\a.txt");
    // 文件写入
    //    fileOutputStream.write(7);
    byte[] bytes = {97, 98, 124, 123, 5};
    fileOutputStream.write(bytes);

    String s = "zhangsan";
    fileOutputStream.write(s.getBytes());

    // 数组的  从0开始 写入两个
    fileOutputStream.write(bytes, 0, 2);
    // 关闭资源
    fileOutputStream.close();
  }
}
/*

*/
