import edu.princeton.cs.algs4.*;

public class E5Random
{
  public static void main(String[] args)
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

}
