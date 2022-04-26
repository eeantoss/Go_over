package Day13.GenericsDemo;
/*
@ClassName:     GenericsDemo02
@Author:        YangXu
@Need:
@Date:          2022/4/8
@Time:          2022-04-08 11:13
*/

//

public class GenericsDemo02<T> {
  private T t;

  public T getT() {
    return t;
  }

  public void setT(T t) {
    this.t = t;
  }

  public <T> void test(T t) {
    System.out.println(t);
  }

  public static void main(String[] args) {

    // String类型的
    GenericsDemo02<String> s = new GenericsDemo02<>();
    s.setT("张三");
    s.test(s.t);
    System.out.println(s.getT());

    System.out.println("-------------");

    GenericsDemo02<Integer> i = new GenericsDemo02<>();
    i.setT(10000000);
    System.out.println(i.getT());
    System.out.println("-------------");

    GenericsDemo02<Double> d = new GenericsDemo02<>();
    d.setT(123.6234);
    System.out.println(d.getT());
    System.out.println("-------------");

    GenericsDemo02<Float> f = new GenericsDemo02<>();
    f.setT(123.12f);
    System.out.println("-------------");

    GenericsDemo02<Short> sh = new GenericsDemo02<>();
    Short sh1 = 123;
    sh.setT(sh1);
    System.out.println(sh.getT());
    System.out.println("-------------");

    GenericsDemo02<Boolean> b = new GenericsDemo02<>();
    b.setT(true);
    System.out.println(b.getT());
    System.out.println("-------------");

    GenericsDemo02<Long> l = new GenericsDemo02<>();
    Long a = 12213213L;
    l.setT(a);
    System.out.println(l.getT());
    System.out.println("-------------");
  }
}
/*

*/
