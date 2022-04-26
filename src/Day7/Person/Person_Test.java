package Day7.Person; /*
                     @ClassName:     Person_Test
                     @Author:        YangXu
                     @Need:          人的测试类
                     @Date:          2022/3/28
                     @Time:          11:08
                     */

//

public class Person_Test {
  public static void main(String[] args) {
    //

    Person p = new Person();

    p.setAge(17); // 设置人的年龄
    p.setSex('男'); // 设置人的性别
    p.setWeight(61.01); // 设置人的体重

    int age = p.getAge(); // 得到人的年龄
    char sex = p.getSex(); // 得到人的性别
    double weight = p.getWeight(); // 得到人的体重
    System.out.println("xx" + age + "岁\n是个" + sex + "的\n体重是：" + weight);
  }
}
/*

*/
