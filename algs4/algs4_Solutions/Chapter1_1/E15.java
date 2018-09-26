public class E15
{
  public static int[] histogram(int[] a, int M)
  {
    int[] histogramArray = new int[M];
    for (int i = 0; i < a.length; i++)
      if (a[i] < M)  histogramArray[a[i]]++;
    return histogramArray;
  }

  public static void main(String[] args)
  {
    int[] a = {1, 0, 1, 1, 3, 3, 4};
    System.out.println("The histogram for 5: ");
    for (int x : histogram(a, 5))  System.out.print(x + ", ");
    System.out.println();

    System.out.println("The histogram for 4: ");
    for (int x : histogram(a, 4))  System.out.print(x + ", ");
    System.out.println();
  }
}
/*
 Solution of 1.1.15
>>>java E15
The histogram for 5:
1, 3, 0, 2, 1,
The histogram for 4:
1, 3, 0, 2,
*/
