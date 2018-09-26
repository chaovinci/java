public class E16
{
  public static String exR1(int n)
  {
    if (n <= 0)  return "";
    return exR1(n-3) + n + exR1(n-2) + n;
  }

  public static void main(String[] args)
  {
    System.out.println(exR1(6));
  }
}
/*
 Solution of 1.1.16
>>>java E16
311361142246
*/
