### 1.3.1
就一句话：public boolean isFull() {  return N == a.length;}  
可以写一个很简单的用例：  
```java
public class FixedCapacityStackOfString {
    private String[] a;
    private int N;
    public FixedCapacityStackOfString(int cap) { a = new String[cap];}
    public boolean      isEmpty() {  return N == 0;  }
    public int             size() {  return N;       }
    public void push(String item) {  a[N++] = item;  }
    public String           pop() {  return a[--N];  }
    public boolean       isFull() {  return N == a.length;}

    public static void main(String[] args) {
        FixedCapacityStackOfString s;
        s = new FixedCapacityStackOfString(3);
        s.push("a");
        System.out.println("Is full? : " + s.isFull());
        s.push("b");
        System.out.println("Is full? : " + s.isFull());
        s.push("c");
        System.out.println("Is full? : " + s.isFull());
    }
}
/*
Solution of 1.3.1
>>>java FixedCapacityStackOfString
Is full? : false
Is full? : false
Is full? : true
*/
```

### 1.3.2
was best the times of it was the it (0 left on stack)

### 1.3.3
b. 0 1 的顺序不可能，2在前面，0 1 已经压入栈，0不可能在1前面弹出。改成 1 0 就可以  
f. 1 2 的顺序不可能，3在前面  
g. 0 2 的顺序不可能，3在前面  

### 1.3.4
这一题就是繁琐， if else 特别多，建议多加{ }，避免错误。另外这一题和1.3.9、10、11相关，可以互相参考。

```java
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
```

### 1.3.7
用数组实现的Stack返回 a[N]就可以，不执行 N--  
```java
public String peek() {  return a[N]; }  
```
用链表实现的Stack则返回 first.item:  
```java
public Item peek() { return first.item; }  
```

### 1.3.8
数组长度为2，最后还剩下一个元素 “it”， 看ResizeingArrayStack.java, 在resize中加入了一个打印语句，方便看到resize的路径。

```java
import edu.princeton.cs.algs4.*;
import java.util.Iterator;

public class ResizeingArrayStack<Item> implements Iterable<Item> {
    private Item[] a = (Item[]) new Object[1];
    private int N = 0;

    public boolean isEmpty()  {  return N == 0; }
    public int size()         {  return N;      }
    public void resize(int max) {
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++)
            temp[i] = a[i];
        a = temp;
        StdOut.println("the length of Array： " + max);
    }

    public void push(Item item) {
        if (N == a.length)  resize(2*a.length);
        a[N++] = item;
    }

    public Item pop() {
        Item item = a[--N];
        a[N] = null;
        if (N > 0 && N == a.length/4)  resize(a.length/2);
        return item;
    }

    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item> {
        private int i = N;
        public boolean hasNext()  {  return i > 0;  }
        public    Item next()     {  return a[--i]; }
        public    void remove()   {                 }
    }

    public static void main(String[] args) {
        ResizeingArrayStack<String> s;
        s = new ResizeingArrayStack<String> ();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-"))
                s.push(item);
            else if  (!s.isEmpty())
                StdOut.print(s.pop() + " ");
        }
        StdOut.println("(" + s.size() + " left on stack)");
        for (String x : s)  StdOut.println(x);
    }
}

/*
Solution of 1.3.4
>>java ResizeingArrayStack
it was - the best - of times - - - it was - the - -
the length of Array： 2
was the length of Array： 4
best times of the length of Array： 2
the the length of Array： 4
was the the length of Array： 2
it (1 left on stack)
it
*/
```