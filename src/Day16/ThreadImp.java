package Day16;
/*
@ClassName:     ThreadImp
@Author:        YangXu
@Need:
@Date:          2022/4/15
@Time:          2022-04-15 9:05
*/

//

public class ThreadImp implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 1000; i++) {
      //
      try {
        // 睡i秒
        Thread.sleep(i);
        System.out.println(Thread.currentThread().getName() + ":" + i);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
/*

*/
