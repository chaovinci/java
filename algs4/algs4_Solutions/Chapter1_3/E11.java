import edu.princeton.cs.algs4.*;
public class E11 {
    // public static Stack<String> InfixToPostfix(Stack<String> expression) {
    //
    // }

    public static Double evaluatePostfix(Stack<String> expression) {
        // 计算后续表达式的值
        // 4 2 / 3 4 1 - * +      = 11
        // 2 3 * 2 1 - / 3 4 1 - * +   = 15
        Stack<Double> val = new Stack<Double>();

        for (String x : reversal(expression)) {
            if (x.equals("+") || x.equals("-") || x.equals("*") || x.equals("/")) {
                double val2 = val.pop();
                double val1 = val.pop();
                if      (x.equals("+"))  val.push(val1 + val2);
                else if (x.equals("-"))  val.push(val1 - val2);
                else if (x.equals("*"))  val.push(val1 * val2);
                else if (x.equals("/"))  val.push(val1 / val2);
            }
            else  // 当x为数字
                val.push(Double.parseDouble(x));
        }
        return val.pop();
    }


    public static void printStack(Stack<String> ss) {
        for (String x : ss)
            StdOut.print(x + " ");
        StdOut.println();
    }

    public static Stack<String> reversal(Stack<String> ss) {
        Stack<String> rev = new Stack<String>();
        for (String x : ss)
            rev.push(x);
        return rev;
    }

    public static void main(String[] args) {
        Stack<String> origin = new Stack<String>();
        while (!StdIn.isEmpty())
            origin.push(StdIn.readString());
        // for (String x : origin){
        //     StdOut.println(x);
        //     if (x.equals("(") || x.equals(")"))  StdOut.println(" is " + x);
        //     else if (x.equals("+") || x.equals("-") || x.equals("*") || x.equals("/"))  StdOut.println(" is " + x);
        //     else  {
        //         Double tempVals = Double.parseDouble(x);
        //         String tempstr = Double.toString(tempVals);
        //     }
        // }
        StdOut.println("The original: ");
        printStack(origin);

        StdOut.println(evaluatePostfix(origin));

    }

}