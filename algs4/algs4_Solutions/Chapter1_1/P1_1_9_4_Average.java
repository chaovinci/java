import edu.princeton.cs.algs4.*;

public class P1_1_9_4_Average
{
  public static void main(String[] args)
  {
    double sum = 0.0;
    int cnt = 0;
    while(!StdIn.isEmpty())
    {
      sum += StdIn.readDouble();
      cnt++;
    }
    double avg = sum / cnt;
    StdOut.printf("These are %d numbers, Average is %.5f\n", cnt, avg);
  }

}
