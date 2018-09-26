### 1.2.1 答案：
这一题比较简单，Point2D.java以及后面题目中出现的文件，可以去官网下载。https://algs4.cs.princeton.edu/12oop/  
答案中有两个关于计算最近距离的实现（minDist 和 minDist2），大家可以对比下区别。
```java
import edu.princeton.cs.algs4.*;

public class E1
{
  public static void main(String[] args) {
    StdDraw.setCanvasSize(600,400);
    StdDraw.setXscale(0, 1);
    StdDraw.setYscale(0, 1);
    StdDraw.setPenRadius(.02);
    StdDraw.setPenColor(StdDraw.RED);
    // 前面这几行只是了美观，如果不加这几行，Draw会使用默认的样式，点就很小，看不清。

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

```


### 1.2.2 答案：
这一题和上一题的主要现实差不多，就是不用画出来。  
Interval1D就像是数轴上的一段线段，有个地方需要注意：
min 必须小于小于或等于 max，所以在随机创建的时候需要做大小判断。
```java
for (int i = 0; i < intervals.length; i++) {
  double temp1 = StdRandom.random() * 100;
  double temp2 = StdRandom.random() * 100;
  if (temp1 < temp2)  intervals[i] = new Interval1D(temp1, temp2);
  else                intervals[i] = new Interval1D(temp2, temp1);
}
```
完整实现如下：
```java
import edu.princeton.cs.algs4.*;

public class E2
{
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    Interval1D[] intervals = new Interval1D[n];

    for (int i = 0; i < intervals.length; i++) {
      double temp1 = StdRandom.random() * 100;
      double temp2 = StdRandom.random() * 100;
      if (temp1 < temp2)  intervals[i] = new Interval1D(temp1, temp2);
      else                intervals[i] = new Interval1D(temp2, temp1);
    }

    StdOut.println("All Intervals: ");
    for (int i = 0; i < intervals.length; i++)
      StdOut.println(i + " : " + intervals[i]);
    StdOut.println();

    for (int i = 0; i < intervals.length - 1; i++)
      for (int j = i + 1; j < intervals.length; j++)
          if (intervals[i].intersects(intervals[j]))
            StdOut.println(i + " and " + j + " are intersects.");
  }
}
/*
 Solution of 1.2.1
>>>java java E2 3
All Intervals:
0 : [33.48579524983259, 36.95083286074507]
1 : [14.849275810849393, 59.54862058663627]
2 : [75.21421316244648, 88.2557709639555]

0 and 1 are intersects.
*/

```