public class E10
{
  public static void main(String[] args)
  {
    int[] a = new int[10];
    for (int i = 0; i < 10; i++)
      a[i] = i * i;

    for(int x : a)  System.out.print(x + " ");
    System.out.println();
  }
}

/*
 Solution of 1.1.10
>>>java E10
0 1 4 9 16 25 36 49 64 81
*/
