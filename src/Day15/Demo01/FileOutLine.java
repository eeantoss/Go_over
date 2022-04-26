package Day15.Demo01;
/*
@ClassName:     FileOutLine
@Author:        YangXu
@Need:          字节流写入数据换行的实现
@Date:          2022/4/13
@Time:          2022-04-13 9:45
*/

/*
windows:\r\n
linux:\n
mac:\r
 */

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutLine {
  public static void main(String[] args) throws IOException {
    //
    FileOutputStream fos = new FileOutputStream("D:\\ab.txt", true);
    FileOutputStream fos1 = new FileOutputStream("D:\\ab.txt", true);

    // 写入10次hello java
    for (int i = 0; i < 10; i++) {
      fos.write("hello java".getBytes()); // hello java 转换成byte类型的数组
      fos.write("\r\n".getBytes()); // 换行操作
    }
    // 关闭资源
    fos.close();
  }
}
/*

*/
