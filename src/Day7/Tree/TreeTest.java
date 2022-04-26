package Day7.Tree; /*
                   @ClassName:     TreeTest
                   @Author:        YangXu
                   @Need:           树的测试类
                   @Date:          2022/3/28
                   @Time:          11:24
                   */

//

public class TreeTest {
  public static void main(String[] args) {
    //
    Tree tree = new Tree();
    tree.setType("松树"); // 设置树的品种是
    tree.setSize("粗壮"); // 设置树的大小
    tree.setAge(100); // 设置树的年龄

    int age = tree.getAge(); // 获取到树的年龄
    String size = tree.getSize(); // 获取到树的大小
    String type = tree.getType(); // 获取到树的品种

    System.out.println("树的大小是:" + size + "\n树的品种是：" + type + "\n树的年龄是:" + age);
  }
}
/*

*/
