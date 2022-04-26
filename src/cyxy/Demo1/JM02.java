package cyxy.Demo1;
/*
@ClassName:     JM02
@Author:        YangXu
@Need:
@Date:          2022/4/4
@Time:          10:47
*/

/*
/2、编写类JM02，定义方法find，实现查找某字符串是否在字符串数组中，并返回索引，如果找不到，返回-1
	提示：
	分析
		1. 方法名 find
		2. 返回值 int
		3. 形参 (String , String[])
 */

import java.util.Scanner;

public class JM02 {

  public static int find(String num, String[] arr) {

    for (int i = 0; i < arr.length; i++) {
      //
      if (num.equals(arr[i])) {
        return i;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    //
    String[] arr = {"张三", "李四", "王五", "刘六"};
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入你要查找的字符：");
    String s = scanner.next();
    int i = find(s, arr);
    System.out.println("数组的索引是" + i);
  }
}
/*

*/
