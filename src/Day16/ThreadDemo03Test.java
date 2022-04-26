package Day16;
/*
@ClassName:     ThreadDemo03Test
@Author:        YangXu
@Need:
@Date:          2022/4/15
@Time:          2022-04-15 10:22
*/

//

public class ThreadDemo03Test {
  public static void main(String[] args) {
    //

    ThreadDemo03 threadDemo03 = new ThreadDemo03();

    Thread t1 = new Thread(threadDemo03, "窗口1");
    Thread t2 = new Thread(threadDemo03, "窗口2");
    Thread t3 = new Thread(threadDemo03, "窗口3");

    t1.setName("窗口111");
    t2.setName("窗口222");
    t3.setName("窗口333");

    t2.setPriority(9);
    t1.setPriority(8);
    t3.setPriority(1);

    t3.start();
    t1.start();
    t2.start();
  }
}
/*

*/
