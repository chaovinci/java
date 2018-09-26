import java.util.Arrays;
import edu.princeton.cs.algs4.*;

public class E22
{
  public static int rank(int key, int[] a)
  {  return rank(key, a, 0, a.length -1, 0);}

  public static int rank(int key, int[] a, int lo, int hi, int depth)
  {
    int mid = lo + (hi - lo) / 2;

    for (int i = 0; i < depth; i++)  System.out.print(" ");
    System.out.printf("mid: %d, a[min]: %d : lo: %d, hi: %d, depth: %d \n", mid, a[mid], lo, hi, depth);
    depth++;

    if (lo > hi) return -1;
    if       (key < a[mid])  return rank(key, a, lo, mid -1, depth);
    else if  (key > a[mid])  return rank(key, a, mid + 1, hi, depth);
    else                     return mid;
  }

  public static void main(String[] args)
  {
    int[] whitelist = In.readInts(args[0]);
    Arrays.sort(whitelist);
    int key = Integer.parseInt(args[1]);
    if (rank(key, whitelist) < 0)
      StdOut.println(key);
  }
}
/*
 Solution of 1.1.22
>>>java E22 tinyW.txt 30
mid: 7, a[min]: 33 : lo: 0, hi: 14, depth: 0
 mid: 3, a[min]: 16 : lo: 0, hi: 6, depth: 1
  mid: 5, a[min]: 23 : lo: 4, hi: 6, depth: 2
   mid: 6, a[min]: 29 : lo: 6, hi: 6, depth: 3
    mid: 7, a[min]: 33 : lo: 7, hi: 6, depth: 4
30
*/
