import edu.princeton.cs.algs4.*;

public class E7
{
  public static void main(String[] args)
  {
    double t = 9.0;
    while (Math.abs(t - 9.0/t) > 0.001)
      t = (9.0/t + t) / 2.0;
    StdOut.printf("%.5f \n", t);

    int sum = 0;
    for (int i = 1; i < 1000; i++)
      for (int j = 0; j < i; j++)
        sum++;
    StdOut.println(sum);

    int sum2 = 0;
    for (int i = 1; i < 1000; i *=2)
      for (int j = 0; j< 1000; j++)
        sum2++;
    StdOut.println(sum2);
  }
}

/*
 Solution of 1.1.7
>>>java E7
3.00009
499500
10000
*/
