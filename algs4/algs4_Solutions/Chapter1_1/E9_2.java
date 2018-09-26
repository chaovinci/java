public class E9_2
{
  public static void toBinmaryString(int n)
  {
    if(n >= 2) // 也可以写成 if (n / 2 != 0)
      toBinmaryString(n / 2);
    System.out.print(n % 2);
  }

  public static void main(String[] args)
  {
    int N = Integer.parseInt(args[0]);
    toBinmaryString(N);
    System.out.println(); // 打印一个换行符

  }
}

/*
 Solution of 1.1.9 使用递归实现，关键在于最小的情况是 (n > 2) 也可以写成 (n / 2 != 0)
>>>java E9_2 8
1000
>>>java E9_2 9
1001
*/
