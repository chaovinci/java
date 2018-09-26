import edu.princeton.cs.algs4.*;

public class Accumulator {
  private int N;
  private double total;

  public Accumulator() {
    N = 0; total = 0.0;
  }

  public  void addDataValue(double val) {
    total += val;
    N++;
  }

  public  double mean() {
    return total / N;
  }

  public String toString() {
    return "Mean's (" + N +" values): " + this.mean();
  }

  public static void main(String[] args) {
    int T = Integer.parseInt(args[0]);
    Accumulator a = new Accumulator();

    for (int t = 0; t < T; t++)
      a.addDataValue(StdRandom.random());
    System.out.println(a);
  }
}