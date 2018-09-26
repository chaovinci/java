import java.util.Arrays;
import edu.princeton.cs.algs4.*;


public class javatest
{
  public static double sqrt( double c)
  {
    if (c < 0) return Double.NaN;
    double err = 1e-15;
    double t = c;
    while (Math.abs(t - c/t) > err * t)
      t = (c/t + t) / 2.0;
    return t;

  }

  public static double H(int N)
  {
    double sum = 0.0;
    for (int i = 1; i <= N; i++)
      sum += 1.0 / i;
    return sum;
  }

  public static void main(String[] args)
  {
    StdDraw.setCanvasSize(600, 800);
    StdDraw.setPenColor(StdDraw.RED);
    StdDraw.setPenRadius(0.02);
    StdDraw.line(0.1, 0.8, 0.9, 0.1);
    StdDraw.point(0.5,0.5);


  }
}
