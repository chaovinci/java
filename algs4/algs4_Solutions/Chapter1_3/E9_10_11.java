import edu.princeton.cs.algs4.*;
public class E9_10_11 {

    public static Stack<String> repairParentheses(Stack<String> expression) {
        Stack<String> fixed = new Stack<String>();
        Stack<String> temp = new Stack<String>();
        for (String x : expression) {
            fixed.push(x); // 把原来的元素放进去
            // 用temp来存“pr”-） 和 “op”-运算符，用于后面的判断
            if (x.equals(")"))  temp.push("pr");
            else if (x.equals("+") || x.equals("-") || x.equals("*") || x.equals("/"))
                temp.push("op");
            else  {
                //遇到数字的时候看一下temp的元素，如果顶上是op，则添加一个(，并且弹出两个元素
                while (!temp.isEmpty() && temp.peek().equals("op")) {
                    fixed.push("(");
                    temp.pop(); temp.pop();
                }
            }
        }
        return fixed;
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

    //
    // public static Stack<String> InfixToPrefix(Stack<String> expression) {
    //
    //
    // }

    // public static Stack<String> InfixToPostfix(Stack<String> expression) {
    //     // 计算后续表达式的值
    //     //4 2 / 3 4 1 - * +      = 11
    //     //2 3 * 2 1 - / 3 4 1 - * +
    // }

    // public static String PostfixToInfix(String expression) {
    //
    // }

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

        StdOut.println("The repair Parentheses: ");
        printStack(repairParentheses(origin));
    }

}