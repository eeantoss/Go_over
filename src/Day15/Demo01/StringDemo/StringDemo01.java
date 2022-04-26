package Day15.Demo01.StringDemo;
/*
@ClassName:     StringDemo01
@Author:        YangXu
@Need:
@Date:          2022/4/14
@Time:          2022-04-14 9:19
*/

//

import java.io.IOException;
import java.util.Arrays;

public class StringDemo01 {
  public static void main(String[] args) throws IOException {
    //
    String s = "经贸";
    byte[] bys = s.getBytes("utf-8");
    System.out.println(Arrays.toString(bys));
    String ss = new String(bys, "utf-8");
    System.out.println(ss);
  }
}
/*

*/
