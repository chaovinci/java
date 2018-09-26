import edu.princeton.cs.algs4.*;

public class P1_1_9_4_ReadChar
{
  public static void main(String[] args)
  {
    String s = "";
    int cnt = 0;

    while(!StdIn.isEmpty())
    {
      s += StdIn.readChar();
      cnt++;
    }
    StdOut.printf("There are %d leters:", cnt);
    StdOut.println(s);
  }

}
