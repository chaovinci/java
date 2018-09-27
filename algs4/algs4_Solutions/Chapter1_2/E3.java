import edu.princeton.cs.algs4.*;

public class E3 {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    double min = Double.parseDouble(args[1]);
    double max = Double.parseDouble(args[2]);

    StdDraw.setCanvasSize(600,600);
    StdDraw.setXscale(min, max);
    StdDraw.setYscale(min, max);

    Interval1D[] interval1Dx = new Interval1D[n];
    Interval1D[] interval1Dy = new Interval1D[n];
    Interval2D[] interval2Ds = new Interval2D[n];

    for (int i = 0; i < n; i++) {
      double x1 = StdRandom.uniform(min, max);
      double x2 = StdRandom.uniform(min, max);
      if (x1 < x2)  interval1Dx[i] = new Interval1D(x1, x2);
      else                interval1Dx[i] = new Interval1D(x2, x1);

      double y1 = StdRandom.uniform(min, max);
      double y2 = StdRandom.uniform(min, max);
      if (y1 < y2)  interval1Dy[i] = new Interval1D(y1, y2);
      else                interval1Dy[i] = new Interval1D(y2, y1);

      interval2Ds[i] = new Interval2D(interval1Dx[i], interval1Dy[i]);
      interval2Ds[i].draw();
      StdOut.println(i + " : " + interval2Ds[i]);
    }

    // intersects 判断，只需要i和j一次判断
    for (int i = 0; i < interval2Ds.length - 1; i++)
      for (int j = i + 1; j < interval2Ds.length; j++)
        if (interval2Ds[i].intersects(interval2Ds[j]))
          StdOut.println(i + " and " + j + " are intersects.");

    // contains 判断，判断完i是否包含j，还需要判断j是否包含i。
    for (int i = 0; i < interval2Ds.length; i++)
      for (int j = 0; j < interval2Ds.length; j++)
        if (i != j && interval2Ds[i].contains(interval2Ds[j]))
          StdOut.println(i + " and " + j + " are contains.");
  }
}
/*
Solution of 1.2.3
>>>java E3 5 0.0 1.0
0 : [0.4025333983820326, 0.5738137478797859] x [0.4839518957301133, 0.7345004377676841]
1 : [0.27304047970111145, 0.912072563545142] x [0.19722115262017026, 0.8959694565649969]
2 : [0.36403328392547407, 0.7506170393988534] x [0.2734091531669941, 0.8400333137051149]
3 : [0.9611237086771058, 0.9877038468535773] x [0.5285380202401169, 0.7008130571955506]
4 : [0.8615834999700394, 0.9362764895178624] x [0.3479004987562584, 0.8789003434984467]
0 and 1 are intersects.
0 and 2 are intersects.
1 and 2 are intersects.
1 and 4 are intersects.
1 and 0 are contains.
1 and 2 are contains.
2 and 0 are contains.
*/
