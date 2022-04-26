package Day9.Person;
/*
@ClassName:     Zi
@Author:        YangXu
@Need:
@Date:          2022/3/30
@Time:          10:25
*/

//

public class Zi extends Fu {
  String name;

  public Zi(int a, String name) {
    super(a);
    this.name = name;
    System.out.println("我是子类的有参构造方法");
  }

  public void met() {
    show();
  }

  /*  @Override
  public void show() {
    System.out.println("我是子类的show方法");
  }*/

  public static void main(String[] args) {
    //
    //    Zi zi = new Zi();
    Zi zi1 = new Zi(1, "张三");
    System.out.println(zi1.getAge() + "\t" + zi1.name);
  }
}
/*

*/
