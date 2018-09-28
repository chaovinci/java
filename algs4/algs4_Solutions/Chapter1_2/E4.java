public class E4 {
  public static void main(String[] args) {
    String string1 = "hello";
    String string2 = string1;
    string1 = "world";
    System.out.println(string1);
    System.out.println(string2);
  }
}
/*
Solution of 1.2.4
>>>java E4
world
hello
*/
