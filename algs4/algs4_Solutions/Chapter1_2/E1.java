import edu.princeton.cs.algs4.*;

public class E1
{
  public static void main(String[] args) {
    StdDraw.setCanvasSize(600,400);
    StdDraw.setXscale(0, 1);
    StdDraw.setYscale(0, 1);
    StdDraw.setPenRadius(.02);
    StdDraw.setPenColor(StdDraw.RED);

    int n = Integer.parseInt(args[0]);

    Point2D[]  points = new Point2D[n];
    for (int i = 0; i < n; i++) {
      double x = StdRandom.random();
      double y = StdRandom.random();
      points[i] = new Point2D(x, y);
      points[i].draw();
    }

    double minDist = 2.0;
    for (int i = 0; i < n; i++)
      for (int j = 0; j < n; j++)
        if (i != j) {
          if (minDist > points[i].distanceTo(points[j]))
            minDist = points[i].distanceTo(points[j]);
      }
    StdOut.println(minDist);

    double minDist2 = 2.0;
    for (int i = 0; i < n - 1; i++)
      for (int j = i + 1; j < n; j++)
          if (minDist2 > points[i].distanceTo(points[j]))
            minDist2 = points[i].distanceTo(points[j]);
    StdOut.println(minDist2);
  }
}
/*
 Solution of 1.2.1
>>>java E1 5
0.1447928099410894
0.1447928099410894
*/
