import java.util.Arrays;
import edu.princeton.cs.algs4.*;

public class E9 {
  public static int rank(int key, int[] a, Counter sc)
  {  return rank(key, a, 0, a.length -1, sc); }

  public static int rank(int key, int[] a, int lo, int hi, Counter sc)
  {
    int mid = lo + (hi - lo) / 2;
    if (lo > hi) return -1;
    sc.increment();
    if       (key < a[mid])  return rank(key, a, lo, mid -1, sc);
    else if  (key > a[mid])  return rank(key, a, mid + 1, hi, sc);
    else  return mid;
  }

  public static void main(String[] args)
  {
    int[] whitelist = In.readInts(args[0]);
    Arrays.sort(whitelist);
    int key = Integer.parseInt(args[1]);
    Counter search = new Counter("search");
    if (rank(key, whitelist, search) < 0)
      StdOut.println(key);

    StdOut.println(search);
  }
}

/*
 Solution of 1.2.9
>>>java E9 tinyW.txt 30
30
4 search
*/
