import edu.princeton.cs.algs4.*;
public class E10 {

    public static Stack<String> InfixToPrefix(Stack<String> expression) {
        // 1 + ( ( 2 + 3 ) * 4 ) - 5
        // - + 1 * + 2 3 4 5
        // 2 * 3 / ( 2 - 1 )  + 3 * ( 4 - 1 )         2 3 * 2 1 - / 3 4 1 - * +
        // 11 + 2 * 3 / ( 4 + 5 ) - 9 * ( 8 + 3 )     11 2 3 * 4 5 + / + 9 8 3 + * -
        // * / * 11 + 2 3 + 4 5 - 9 + 8 3             + / * 2 3 - 2 1 * 3 - 4 1

        Stack<String> postFix = new Stack<String>();
        Stack<String> opt = new Stack<String>();
        for(String x : reversal(expression)) { //output: 5 - ) 4 * ) +3 2 ( ( + 1
            // StdOut.print(x);
            if (x.equals("+") || x.equals("-") || x.equals("*") || x.equals("/")) {
                if (opt.isEmpty())
                    opt.push(x);
                else if (opt.peek().equals("(") || rank(x) > rank(opt.peek()))
                    opt.push(x);
                else {
                    postFix.push(opt.pop());
                    opt.push(x);
                }
            }
            else if (x.equals(")")) {
                postFix.push(opt.pop());
                if (opt.peek().equals("("))  opt.pop();
            }
            else if (x.equals("("))  opt.push(x);
            else                     postFix.push(x);
        }
        while(!opt.isEmpty())
            postFix.push(opt.pop());
        return postFix;
    }

    public static Integer rank(String operator) {
        if      (operator.equals("+"))  return 1;
        else if (operator.equals("-"))  return 1;
        else if (operator.equals("*"))  return 2;
        else if (operator.equals("/"))  return 2;
        else if (operator.equals("("))  return 3;
        else                            return 3;
    }

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

        printStack(InfixToPrefix(origin));
        printStack(reversal(InfixToPrefix(origin)));

        // StdOut.println(evaluatePostfix(InfixToPrefix(origin)));
        // StdOut.println(evaluatePostfix(reversal(origin)));

        // StdOut.println(evaluatePostfix(origin));


    }

}