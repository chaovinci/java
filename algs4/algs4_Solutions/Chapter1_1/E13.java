public class E13
{
  public static void main(String[] args)
  {
    int[][] a = {{1, 2, 3, 4, 5},
                 {2, 4, 6, 8, 10}};
    // 先创建一个2维数组a
    System.out.println("Print array a:");
    print2DArray(a);

    int M = a.length;
    int N = a[0].length;

    int[][] b = new int[N][M];
    for (int i = 0; i < M; i++)
      for (int j = 0; j < N; j++)
        b[j][i] = a[i][j];

    System.out.println("Print array b:");
    print2DArray(b);
  }


  public static void print2DArray(int[][] x)
  {
    for (int i = 0; i < x.length; i++)
    {
      for (int j = 0; j < x[i].length; j++)
      {
        System.out.print(x[i][j] + " ");
        // 在每行结束时打印一个换行符
      }
      System.out.println();
    }
  }
}
/*
 Solution of 1.1.13
>>>java E13
Print array a:
1 2 3 4 5
2 4 6 8 10
Print array b:
1 2
2 4
3 6
4 8
5 10
*/
