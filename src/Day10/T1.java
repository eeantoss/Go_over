package Day10;
/*
@ClassName:     T1
@Author:        YangXu
@Need:
@Date:          2022/4/1
@Time:          11:56
*/

//

public class T1 extends Thread {
  @Override
  public void run() {
    for (int i = 0; i <= 10000; i++) {
      //
      System.out.println(i);
    }
  }

  public static void main(String[] args) {
    //
    T1 t1 = new T1();
    T1 t2 = new T1();
    t1.start();
    t2.start();
  }
}
/*

*/
