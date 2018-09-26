public class E8_PrintASCII
{
  public static void main(String[] args)
  {
    for (int i = 0; i < 128; i++)
      System.out.print(i + " : " + (char)i + " |");
  }
}

/*
 Solution of 1.1.8
>>>E8_PrintASCII
打印0-127的ASCII码
*/
