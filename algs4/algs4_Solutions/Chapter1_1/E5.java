public class E5
{
  public static boolean between0and1(double a, double b)
  {
    if ((a < 1 && a > 0) && (b < 1 && b > 0))  return true;
    else                                       return false;
  }

  public static void main(String[] args)
  {
    double x = Double.parseDouble(args[0]);
    double y = Double.parseDouble(args[1]);
    System.out.printf("%f -- %f Both numbers are between 1 and 0: ", x, y);
    System.out.println("\n" + between0and1(x, y));
  }
}

/*
 Solution of 1.1.4
 >>>java E5 1.2 0.2
 1.200000 -- 0.200000 Both numbers are between 1 and 0:
 false

 >>>java E5 0.23 0.9998
 0.230000 -- 0.999800 Both numbers are between 1 and 0:
 true

 注意后两个数字，0.99999999 被打印出来变成了 1.000000，这和Double数据类型的计算机现实有关。
 >>>java E5 0.23 0.9999999
 0.230000 -- 1.000000 Both numbers are between 1 and 0:
 true

 >>>java E5 0.23 0.99999999999999999
 0.230000 -- 1.000000 Both numbers are between 1 and 0:
 false

*/
