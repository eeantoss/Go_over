package Day13.GenericsDemo;
/*
@ClassName:     GenericsDemo03_Test
@Author:        YangXu
@Need:          
@Date:          2022/4/8
@Time:          2022-04-08 11:39
*/

//


public class GenericsDemo03Impl<T> implements GenericsDemo03<T>{

    @Override
    public void show(T t) {
    System.out.println(t);
    }

  public static void main(String[] args) {
    //
      GenericsDemo03Impl<String> s = new GenericsDemo03Impl<>();
      s.show("hello");
    System.out.println("----------");

      GenericsDemo03Impl<Integer> i = new GenericsDemo03Impl<>();
      i.show(1);
    System.out.println("-----------");

      GenericsDemo03Impl<Long> L = new GenericsDemo03Impl<>();
      L.show(11L);
    System.out.println("-----------");

      GenericsDemo03Impl<Short> sh = new GenericsDemo03Impl<>();
      Short sh1 = 123;
      sh.show(sh1);
    System.out.println("--------------");

      GenericsDemo03Impl<Boolean> b = new GenericsDemo03Impl<>();
      b.show(true);
      System.out.println("--------------");

  }
}
/*

 */