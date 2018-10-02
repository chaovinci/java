import edu.princeton.cs.algs4.*;
public class E4_Parentheses {
    public static void main(String[] args) {
        Stack<String> parentheses = new Stack<String>();
        boolean flag = true;
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if      (s.equals("("))  parentheses.push(s);
            else if (s.equals("["))  parentheses.push(s);
            else if (s.equals("{"))  parentheses.push(s);
            else if (s.equals(")")) {
                if (!parentheses.pop().equals("("))
                    flag = false;
            }
            else if (s.equals("]")) {
                if (!parentheses.pop().equals("["))
                    flag = false;
            }
            else if (s.equals("}")) {
                if (!parentheses.pop().equals("{"))
                    flag = false;
            }
            else  {   }
        }

        if (!parentheses.isEmpty())
            flag = false;
        StdOut.println(flag);
    }
}
/*
Solution of 1.3.4
>>>java E4_Parentheses
( [ ] { [ ] } )
true
>>>java E4_Parentheses
( [ ) ]
false
*/