package cyxy.Demo1;
/*
@ClassName:     JM03
@Author:        YangXu
@Need:
@Date:          2022/4/4
@Time:          11:02
*/

//

/*
4、编写类JM03, 实现数组的复制功能copyArr，输入旧数组，返回一个新数组，元素和旧数组一样
	提示：
	1、旧数组通过方法形参传入
	2、旧数组复制到新数组
	3、返回新数组
 */
public class JM03 {

  public int[] copyArr(int[] arr) {
    int[] temp = arr;

    return temp;
  }

  public static void main(String[] args) {
    //
    int[] arr = {12, 3121, 512, 312, 5};
    JM03 jm03 = new JM03();
    int[] ints = jm03.copyArr(arr);
    System.out.println(ints[1]);
  }
}
/*

*/
