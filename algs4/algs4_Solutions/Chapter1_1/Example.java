import java.util.Arrays;
import edu.princeton.cs.algs4.*;
public class Example
{
  public static void RandomSeq(String[] args)
  {
    int N = Integer.parseInt(args[0]);
    double lo = Double.parseDouble(args[1]);
    double hi = Double.parseDouble(args[2]);

    for (int i = 0; i < N; i++)
    {
      double x = StdRandom.uniform(lo, hi);
      double y = StdRandom.uniform(lo, hi);
      StdOut.printf("%f %f \n", x, y);
    }
  }
  // 输出为文件： java E5Random 10 -0.02 1.1 > data.txt
  // 输出给另外一个程序： java E5Random 10 -0.02 1.1 | java Average

  public static void main(String[] args)
  {
    ;
  }
}
