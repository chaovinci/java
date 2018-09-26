public class E20
{
  public static long factorial(int N)
  {
    if (N == 0 || N == 1) return 1;
    return  N * factorial(N - 1);
  }

  public static void main(String[] args)
  {
    int n = Integer.parseInt(args[0]);
    System.out.println(factorial(n));
    System.out.println(Math.log(factorial(n)));
  }
}
/*
 Solution of 1.1.20
>>>java E20 10
3628800
15.104412573075516
*/
