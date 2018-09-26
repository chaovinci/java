public class E18
{
  public static int mystery(int a, int b)
  {
    if (b == 0)      return 0;
    if (b % 2 == 0)  return mystery(a+a, b/2);
    return mystery(a+a, b/2) + a;
  }

  public static void main(String[] args)
  {
    System.out.println("mystery: ");
    System.out.println(mystery(2, 25));
    System.out.println(mystery(3, 11));
    System.out.println("mystery2: ");
    System.out.println(mystery2(2, 25));
    System.out.println(mystery2(3, 11));
  }

  public static int mystery2(int a, int b)
  {
    if (b == 0)      return 1;
    if (b % 2 == 0)  return mystery2(a*a, b/2);
    return mystery2(a*a, b/2)*a;
  }
}
/*
 Solution of 1.1.18
>>>java E18
mystery:
50
33
mystery2:
33554432
177147
*/
