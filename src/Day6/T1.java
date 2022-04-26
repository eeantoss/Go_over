package Day6; /*
              @ClassName:     T1
              @Author:        YangXu
              @Need:
              @Date:          2022/3/25
              @Time:          11:21
              */

//

public class T1 {
  public static void main(String[] args) {
    //
    Stu stu = new Stu();
    stu.name = "1";
    System.out.println(stu.name);
    changeStu(stu);
    System.out.println(stu.name);
  }

  private static void changeStu(Stu stu) {
    System.out.println(stu);
    stu.name = "2";
  }
}
/*

*/
