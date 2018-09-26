public class E14
{
  public static int lg(int N)
  {
    int max = 0;
    for (int i = 0; pow2(i) < N; i++)
      max = i + 1;
    return max;
  }

  public static int pow2(int n)
  {
    int r = 1;
    for (int i = 0; i < n; i++)
      r = r * 2;
    return r;
  }

  public static void main(String[] args)
  {
    int n = Integer.parseInt(args[0]);
    System.out.println(lg(n));
  }
}
/*
 Solution of 1.1.14
>>>java E14 4
2
java E14 5
3
java E14 7
3
java E14 8
4
*/
