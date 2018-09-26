public class E11
{
  public static void main(String[] args)
  {
    int M = Integer.parseInt(args[0]);
    int N = Integer.parseInt(args[1]);
    // 从命令行得到两个int数，作为数组的行和列，为了打印美观，数不要太大。
    boolean[][] a = new boolean[M][N];
    a[0][1] = true;
    a[2][2] = true;
    a[3][3] = true;
    //随便赋值几个，以免打印出来都是空格

    for (int i = 0; i < a.length; i++)
    {
      System.out.print(i + " ");//打行列数i，从0开始

      for (int j = 0; j < a[i].length; j++)
      {
        if   (a[i][j] == true)  System.out.print("* ");
        else                    System.out.print("  ");
      }
      System.out.println();
      // 在每行结束时打印一个换行符
    }

    System.out.print("  ");
    for(int j = 0; j < a[1].length; j++)
      System.out.print(j + " "); //打印列数j
  }
}

/*
 Solution of 1.1.11
>>>E11 4 6
0   *
1
2     *
3       *
  0 1 2 3 4 5
*/
