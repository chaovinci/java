public class E6 {

  public static boolean isCircularRotation(String a, String b) {
    return a.length() == b.length() && a.concat(a).indexOf(b) > -1;
  }

  public static boolean isCircularRotation2(String a, String b) {
    if (a.length() != b.length())  return false;

    for (int i = 0; i < a.length(); i++) {
      String left = a.substring(0, i);
      String right = a.substring(i, a.length());
      if(right.concat(left).equals(b))
        return true;
    }
    return false;
  }

  public static void main(String[] args) {
    String s1 = "abcd";
    String s2 = "cdab";
    System.out.println(isCircularRotation(s1, s2));
  }
}
/*
Solution of 1.2.6
>>>java E6
true
*/
