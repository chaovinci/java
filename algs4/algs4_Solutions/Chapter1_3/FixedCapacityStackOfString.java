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
