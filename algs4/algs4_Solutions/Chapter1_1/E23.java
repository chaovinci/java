import java.util.Arrays;
import edu.princeton.cs.algs4.*;

public class E23
{
  public static int rank(int key, int[] a)
  {  return rank(key, a, 0, a.length -1);}

  public static int rank(int key, int[] a, int lo, int hi)
  {
    if (lo > hi) return -1;
    int mid = lo + (hi - lo) / 2;
    if       (key < a[mid])  return rank(key, a, lo, mid -1);
    else if  (key > a[mid])  return rank(key, a, mid + 1, hi);
    else                     return mid;
  }

  public static void main(String[] args)
  {
    int[] whitelist = In.readInts(args[0]);
    Arrays.sort(whitelist);

    char sign = '+';

    while(!StdIn.isEmpty())
    {
      int key = StdIn.readInt();
      boolean found = (rank(key, whitelist) < 0);
      if (sign == '+' && found)
          StdOut.println(key);
      if (sign == '-' && !found)
          StdOut.println(key);
    }
  }

}
/*
 Solution of 1.1.23
>>>java E23 tinyW.txt < tinyT.txt
50
99
13

可以用此main方法代替上文中的main，则命令行输入如下：
>>>java E23 tinyW.txt true < tinyT.txt
>>>java E23 tinyW.txt false < tinyT.txt

public static void main(String[] args)
{
  int[] whitelist = In.readInts(args[0]);
  Arrays.sort(whitelist);

  boolean sign = Boolean.parseBoolean(args[1]);
  // 接受 0 和 1

  while(!StdIn.isEmpty())
  {
    int key = StdIn.readInt();
    boolean found = (rank(key, whitelist) < 0);
    if (sign == true && found)
        StdOut.println(key);
    if (sign == false && !found)
        StdOut.println(key);
  }
}
*/
