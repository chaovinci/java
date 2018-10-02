import edu.princeton.cs.algs4.*;

public class FixedCapacityStack<Item> {
    private Item[] a;
    private int N = 1;
    public FixedCapacityStack() {
        a = (Item[]) new Object[N];
        a[0] = null;
    }

    public boolean isEmpty() {
        return a[N-1] == null;
    }

    public int size() {
        return N - 1;
    }

    public void push(Item item) {
        if (N == a.length)  resize(2 * a.length);
        a[N++] = item;
    }

    public Item pop() {
        // if (N == 0)  return -1;
        Item item = a[--N];
        a[N] = null;
        if (N > 0 && N == a.length/4)  resize(a.length/2);
        return item;
    }

    public void resize(int max) {
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++)
            temp[i] = a[i];
           a = temp;
    }

    public static void main(String[] args) {
        FixedCapacityStack<String> s;
        s = new FixedCapacityStack<String> ();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-"))
                s.push(item);
            else if  (!s.isEmpty())
                StdOut.print(s.pop() + " ");
        }

        StdOut.println("(" + s.size() + " left on stack)");
    }

}