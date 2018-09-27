import edu.princeton.cs.algs4.*;

public class E3 {
// 从命令行接受一个整数N、min、max。
// 生成N个 随机的2D间隔。
// 其宽度和高 均匀缝补在但为中性中的min 和 max之间。
// 用StdDraw画出他们
// 打印出相交的间隔对
// 有包含关系的间隔对数量
//
// interval2D(Interval1D x, Interval1D y)
//
// double area()
// boolean contains(Point2D p)
// boolean intersects(Interval2D that)
// void draw()
//

  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    double min = Double.parseDouble(args[1]);
    double max = Double.parseDouble(args[2]);

    StdDraw.setCanvasSize(800,800);
    StdDraw.setXscale(min, max);
    StdDraw.setYscale(min, max);
    // StdDraw.setPenRadius(.005);
    // StdDraw.setPenColor(StdDraw.BLARK);

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

    for (int i = 0; i < interval2Ds.length - 1; i++)
      for (int j = i + 1; j < interval2Ds.length; j++)
        if (interval2Ds[i].intersects(interval2Ds[j]))
          StdOut.println(i + " and " + j + " are intersects.");

  }

  public static boolean contains(Interval2D that) {
    
  }


}
