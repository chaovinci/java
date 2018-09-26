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
