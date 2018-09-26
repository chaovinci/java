public class E9
{
  public static void main(String[] args)
  {
    String s = "";
    int N = Integer.parseInt(args[0]);
    for (int n = N; n > 0; n /=2)
      s = (n % 2) + s;
    System.out.println(s);
  }
}

/*
 Solution of 1.1.9
>>>java E9 8
1000
>>>java E9 9
1001
*/
