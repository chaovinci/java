public class E24
{
  public static int gcd(int m, int n)
  {
    if(m % n == 0)  return n;
    else
    {
      System.out.println("m: " + m + ", n: " + n);
      return gcd(n, m % n);
    }
  }

  public static void main(String[] args)
  {
    int M = Integer.parseInt(args[0]);
    int N = Integer.parseInt(args[1]);
    System.out.println(gcd(M, N));
  }
}

/*
Solution of 1.1.24
>>>java E24 105 24
m: 105, n: 24
m: 24, n: 9
m: 9, n: 6
3

public static int gcd(int m, int n)
{
  if(m % n == 0)  return n;
  else            return gcd(n, m % n);
}
*/