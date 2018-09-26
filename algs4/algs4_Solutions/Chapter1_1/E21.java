import edu.princeton.cs.algs4.*;
public class E21
{
  public static void main(String[] args)
  {
    while(StdIn.hasNextLine())
    {
      String name = StdIn.readString();
      int m = StdIn.readInt();
      int n = StdIn.readInt();
      float rate = (float)m / n;
      // 可以试试 rate = m / n 时的情况，这里也可以写成 m * 1.0 / n

      StdOut.printf("%12s  | %5d | %5d | %8.3f \n",name,m,n,rate);
    }
  }
}
/*
 Solution of 1.1.21
>>>java E21 < E21Data.txt
     Michael  |     7 |    67 |    0.104
       David  |    12 |   115 |    0.104
        Noad  |     5 |    34 |    0.147
       Aiden  |     7 |    97 |    0.072
      Joshua  |    23 |   276 |    0.083
        Alex  |     4 |    94 |    0.043
     William  |     5 |   121 |    0.041
*/
