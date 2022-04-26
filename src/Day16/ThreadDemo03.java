package Day16;
/*
@ClassName:     ThreadDemo03
@Author:        YangXu
@Need:
@Date:          2022/4/15
@Time:          2022-04-15 10:19
*/

//

public class ThreadDemo03 implements Runnable {
  private int votes = 100;
  private Object obj = new Object();

  @Override
  public void run() {
    sell();
  }

  private synchronized void sell() {
    while (true) {
      if (votes > 0) {
        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ":出售第" + votes + "张票");
        votes--;
      }
    }
  }
}
/*

*/
