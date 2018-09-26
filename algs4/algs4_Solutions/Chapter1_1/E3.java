public class E3
{
  public static void main(String[] args)
  {
    int a1 = Integer.parseInt(args[0]);
    int a2 = Integer.parseInt(args[1]);
    int a3 = Integer.parseInt(args[2]);

    if (a1 == a2 && a1 == a3)  System.out.println("equal");
    else                       System.out.println("not  equal");
  }
}

/*
 Solution of 1.1.3
 >>>java E3 1 2 2
 not equal

 >>>java E3 7 7 7
 equal
*/
