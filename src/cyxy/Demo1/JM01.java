package cyxy.Demo1;
/*
@ClassName:     JM01
@Author:        YangXu
@Need:
@Date:          2022/4/4
@Time:          10:44
*/

//

public class JM01 {
  public static void main(String[] args) {
    //
    int[] arr = {12, 312, 313523, 24, 435, 23, 123, 11};
    double max = max(arr);
    System.out.println(max);
  }

  // 1、编写类JM01，定义方法max，实现求某个double数组的最大值，
  // 并返回。数组通过参数传入。
  public static double max(int[] arr) {
    int temp = arr[0];
    for (int i = 1; i < arr.length; i++) {
      //
      if (arr[i] > temp) {
        temp = arr[i];
      }
    }

    return temp;
  }
}
/*

*/
