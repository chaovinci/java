## E01:
### 1.1.1 答案：
  a: 7  
  b: 100.000000.1  
  c: true  

```java
public class E1
{
  public static void main(String[] args)
  {
    System.out.println((0 + 15) / 2);
    System.out.println(2.0e-6 * 1000000000.1);
    System.out.println(true && false || true && true);
  }
}

```
### 1.1.2 答案：
  a: 1.618  float  
  b: 10.0   float  
  c: true   boolean  
  d: 33     String  
  // 如果是 “1” + 2 + 3 则会打印 123 String

```java
public class E2
{
  public static void main(String[] args)
  {
    System.out.println((1 + 2.236) / 2);
    System.out.println(1 + 2 + 3 + 4.0);
    System.out.println(4.1 >= 4);
    System.out.println(1 + 2 + "3");
    System.out.println("1" + 2 + 3);
  }
}

  ```
### 1.1.3 答案：
```java
public class E3
{
  public static void main(String[] args)
  {
    int a1 = Integer.parseInt(args[0]);
    int a2 = Integer.parseInt(args[1]);
    int a3 = Integer.parseInt(args[2]);

    if (a1 == a2 && a1 == a3)  System.out.println("equal");
    else                       System.out.println("not  equal");
  }
}

/*
 java E3 1 2 2
 >>> not equal

 java E3 7 7 7
 >>> equal
*/
```

### 1.1.4 答案：
  a: java中if语句不需要then，c = 0 后面需要分号;  
  b. if的判断语句必须用小括号括起来if (a > b)  
  c. 正确  
  d. c = 0 后面需要跟分号;  

### 1.1.5 答案：
```java
public class E5
{
  public static boolean between0and1(double a, double b)
  {
    if ((a < 1 && a > 0) && (b < 1 && b > 0))  return true;
    else                                       return false;
  }

  public static void main(String[] args)
  {
    double x = Double.parseDouble(args[0]);
    double y = Double.parseDouble(args[1]);
    System.out.printf("%f -- %f Both numbers are between 1 and 0: ", x, y);
    System.out.println("\n" + between0and1(x, y));
  }
}

/*
 Solution of 1.1.4
 java E5 1.2 0.2
 >>>1.200000 -- 0.200000 Both numbers are between 1 and 0:
 >>>false

 java E5 0.23 0.9998
 >>>0.230000 -- 0.999800 Both numbers are between 1 and 0:
 >>>true

 注意后两个数字，0.99999999 被打印出来变成了 1.000000，这和Double数据类型的计算机现实有关。
 java E5 0.23 0.9999999
 >>>0.230000 -- 1.000000 Both numbers are between 1 and 0:
 >>>true

 java E5 0.23 0.99999999999999999
 >>>0.230000 -- 1.000000 Both numbers are between 1 and 0:
 >>>false

*/
```


### 1.1.6 答案：
会输出斐波那契数列（Fibonacci sequence ）的前15位。

```java
import edu.princeton.cs.algs4.*;

public class E6
{
  public static void main(String[] args)
  {
    int f = 0;
    int g = 1;
    for (int i = 0; i <= 15; i++)
    {
      StdOut.println(f);
      f = f + g;
      g = f - g;
    }
  }
}

/*
 Solution of 1.1.6
 会输出斐波那契数列（Fibonacci sequence ）的前15位。
>>>java E6
0
1
1
2
3
5
8
13
21
34
55
89
144
233
377
610
*/

```

### 1.1.7 答案
  a. 3.00009  
  b. 499500  
  c. 10000  

```java
import edu.princeton.cs.algs4.*;

public class E7
{
  public static void main(String[] args)
  {
    double t = 9.0;
    while (Math.abs(t - 9.0/t) > 0.001)
      t = (9.0/t + t) / 2.0;
    StdOut.printf("%.5f \n", t);

    int sum = 0;
    for (int i = 1; i < 1000; i++)
      for (int j = 0; j < i; j++)
        sum++;
    StdOut.println(sum);

    int sum2 = 0;
    for (int i = 1; i < 1000; i *=2)
      for (int j = 0; j< 1000; j++)
        sum2++;
    StdOut.println(sum2);
  }
}

/*
 Solution of 1.1.7
>>>java E7
3.00009
499500
10000
*/
```

## 1.1.8 答案
  a.b    打印一个字符char  
  b.197  java中当两个char相加时，将按照char在源代码中的int值进行计算，‘b’ = 98， 'c' = 99  
  c.e    'a' = 97, 'e' = 101 可以在 ASCII码表 或 unicode码表中查询到所有的字符字面值  
```java
public class E8
{
  public static void main(String[] args)
  {
    System.out.println('b');
    System.out.println('b' + 'c');
    System.out.println((char)('a' + 4));
  }
}

/*
 Solution of 1.1.8
>>>java E8
b
197
e
*/
```
以下程序可以打印0-127的ASCII码：  
```java
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

```


### 1.1.9 答案：
  书本上的实现：  
```java
public class E9
{
  public static void main(String[] args)
  {
    String s = "";
    int N = Integer.parseInt(args[0]);
    for (int n = N; n > 0; n /=2)
      s = (n % 2) + s;
    System.out.println(s);
  }
}

/*
 Solution of 1.1.9
>>>java E9 8
1000
>>>java E9 9
1001
*/
```
  使用递归实现  
```java
public class E9_2
{
  public static void toBinmaryString(int n)
  {
    if(n >= 2) // 也可以写成 if (n / 2 != 0)
      toBinmaryString(n / 2);
    System.out.print(n % 2);
  }

  public static void main(String[] args)
  {
    int N = Integer.parseInt(args[0]);
    toBinmaryString(N);
    System.out.println(); // 打印一个换行符

  }
}

/*
 Solution of 1.1.9 使用递归实现，关键在于最小的情况是 (n > 2) 也可以写成 (n / 2 != 0)
>>>java E9_2 8
1000
>>>java E9_2 9
1001
*/
```

### 1.1.10 答案
  书上有解答，没有为a[]分配内存，正确的写法是: int[] a  = new int[10];  
  测试代码如下：  

```java
public class E10
{
  public static void main(String[] args)
  {
    int[] a = new int[10];
    for (int i = 0; i < 10; i++)
      a[i] = i * i;

    for(int x : a)  System.out.print(x + " ");
    System.out.println();
  }
}

/*
 Solution of 1.1.10
>>>java E10
0 1 4 9 16 25 36 49 64 81
*/
```

### 1.1.11 答案：
  我们以一个 4 x 6 的二维数组为例，建议先自己尝试，一行一行的测试，慢慢把格式搞清楚，可以锻炼下自己对控制流的执行顺序的判断。


```java
public class E11
{
  public static void main(String[] args)
  {
    int M = Integer.parseInt(args[0]);
    int N = Integer.parseInt(args[1]);
    // 从命令行得到两个int数，作为数组的行和列，为了打印美观，数不要太大。
    boolean[][] a = new boolean[M][N];
    a[0][1] = true;
    a[2][2] = true;
    a[3][3] = true;
    //随便赋值几个，以免打印出来都是空格

    for (int i = 0; i < a.length; i++)
    {
      System.out.print(i + " ");//打行列数i，从0开始

      for (int j = 0; j < a[i].length; j++)
      {
        if   (a[i][j] == true)  System.out.print("* ");
        else                    System.out.print("  ");
      }
      System.out.println();
      // 在每行结束时打印一个换行符
    }

    System.out.print("  ");
    for(int j = 0; j < a[1].length; j++)
      System.out.print(j + " "); //打印列数j
  }
}

/*
 Solution of 1.1.11
>>>E11 4 6
0   *
1
2     *
3       *
  0 1 2 3 4 5
*/

```

### 1.1.12 答案：
！请注意，书本上的题目打印错误，最后一句是 System.out.println(i); 应该是 System.out.println(a[i]); 打印i的值毫无意义，永远都是0-9。   
本题的答案是： 0 1 2 3 4 4 3 2 1 0   
不理解的同学可以尝试把数组的**内容和下标**写在纸上，然后看第二个for语句怎么依次赋值的。  
理解这一题再去做第12题，就知道倒转一个数组时，最好新建一个新的数组，以避免原数组被覆盖。

```java
public class E12
{
  public static void main(String[] args)
  {
    int[] a = new int[10];
    for (int i = 0; i < 10; i++)
      a[i] = 9 - i;
    for (int i = 0; i < 10; i++)
      a[i] = a[a[i]];
    for (int i = 0; i < 10; i++)
       System.out.println(a[i]);
  }
}
/*
 Solution of 1.1.12
>>>java E12
0
1
2
3
4
4
3
2
1
0
*/
```

### 1.1.13 答案：
这个示例程序中，我把1.1.11中的打印二维数组的程序作为一个方法来复用。print2DArray(int[][] x)（去掉了行号和列号的打印）
```java
public class E13
{
  public static void main(String[] args)
  {
    int[][] a = {{1, 2, 3, 4, 5},
                 {2, 4, 6, 8, 10}};
    // 先创建一个2维数组a
    System.out.println("Print array a:");
    print2DArray(a);

    int M = a.length;
    int N = a[0].length;

    int[][] b = new int[N][M];


    for (int i = 0; i < M; i++)
      for (int j = 0; j < N; j++)
        b[j][i] = a[i][j];

    System.out.println("Print array b:");
    print2DArray(b);
  }


  public static void print2DArray(int[][] x)
  {
    for (int i = 0; i < x.length; i++)
    {
      for (int j = 0; j < x[i].length; j++)
      {
        System.out.print(x[i][j] + " ");
        // 在每行结束时打印一个换行符
      }
      System.out.println();
    }
  }
}
/*
 Solution of 1.1.13
>>>java E13
Print array a:
1 2 3 4 5
2 4 6 8 10
Print array b:
1 2
2 4
3 6
4 8
5 10
*/
```

### 1.1.14 答案：
这一题的题目理解起来似乎比较麻烦，所以我自作主张把题目改了一下，以方便理解（我甚至揣测原题目就是这个意思，后面可能是写错了）：   
#### 改写的题目： 编写一个静态的方法lg()，该方法接受一个整型参数N，计算最少需要多少个2进制字节才能存储N，即大于N的最小log2的值。
这个方法是很有用的，例如想要表示数字5，需要至少3个2进制数，3个2进制数的取值范围是 000-111(0-8)。 log2(3) = 8

```java
public class E14
{
  public static int lg(int N)
  {
    int max = 0;
    for (int i = 0; pow2(i) < N; i++)
      max = i + 1;
    return max;
  }

  public static int pow2(int n)
  {
    int r = 1;
    for (int i = 0; i < n; i++)
      r = r * 2;
    return r;
  }

  public static void main(String[] args)
  {
    int n = Integer.parseInt(args[0]);
    System.out.println(lg(n));
  }
}
/*
 Solution of 1.1.14
>>>java E14 4
2
java E14 5
3
java E14 7
3
java E14 8
4
*/
```

### 1.1.15 答案：
这一题的关键在于：如何统计数组中的各数值的个数，建议大家自己先做一遍。然后对比答案，看下你是不是用了过多的for语句了（实际上一个for就够了）

```java
public class E15
{
  public static int[] histogram(int[] a, int M)
  {
    int[] histogramArray = new int[M];
    for (int i = 0; i < a.length; i++)
      if (a[i] < M)  histogramArray[a[i]]++;
    return histogramArray;
  }

  public static void main(String[] args)
  {
    int[] a = {1, 0, 1, 1, 3, 3, 4};
    System.out.println("The histogram for 5: ");
    for (int x : histogram(a, 5))  System.out.print(x + ", ");
    System.out.println();

    System.out.println("The histogram for 4: ");
    for (int x : histogram(a, 4))  System.out.print(x + ", ");
    System.out.println();
  }
}
/*
 Solution of 1.1.15
>>>java E15
The histogram for 5:
1, 3, 0, 2, 1,
The histogram for 4:
1, 3, 0, 2,
*/
```

### 1.1.16 答案：
这道题预热了一下递归，用笔和纸细心点就可以写出答案： 311361142246
```java
public class E16
{
  public static String exR1(int n)
  {
    if (n <= 0)  return "";
    return exR1(n-3) + n + exR1(n-2) + n;
  }

  public static void main(String[] args)
  {
    System.out.println(exR1(6));
  }
}
/*
 Solution of 1.1.16
>>>java E16
311361142246
*/
```

### 1.1.18 答案：
递归再次预热，这次比较复杂一点，需要细心的分析一下，初学者看到递归也不要害怕，递归的处理原则是： 从最小的情况入手，从洋葱的最里层往外剥。我们来一步一步看：  
```java
所有的判断都和b有关，a就可以先不管。  
程序可以做一点改写，让它看上去更加直观，对于b只有3中情况，等于0，被2除尽（偶数），被2除有余（奇数）：  
if (b == 0)      return 0;  
    b = 0 时，返回0；  
if (b % 2 == 0)  return mystery(a+a, b/2);  
   情况2，b是偶数时，a变为 a+a = 2a, b变为 b/2(b/2有两种结果，为奇数，或偶数)  
if (b % 2 == 1)  return mystery(a+a, b/2) + a;  
   情况1，b为奇数时，递归（再来一次） 并且加上 a；  
   总结一下，b为奇数时，结果加a； b为偶数时， b除以2，结果乘以2；直到b为0。  

我们就以11为例，来看下b的变化情况。

11 % 2 = 1  情况1;   b/2 = 5;             m(2a, 5) + a  
5 % 2 = 1   情况1;   b/2 = 2;        m(4a, 2) + 2a + a  
2 % 2 = 1   情况1;   b/2 = 1;        m(8a, 1) + 2a + a  
1 % 2 = 0   情况2;   b/2 = 0;  m(16a, 0) + 8a + 2a + a  
0   b = 0   结束     b == 0;           0 + 8a + 2a + a = 11a  
```
递归需要多练习，仔细学习几个简单的算法，例如本书第13也 sqrt方法，第28页BinarySearch，习题1.1.9中我给出的递归解法 E9_2.java,习题1.119，这些都是经典算法。递归是程序中的重要思想！！！ 必须多多练习，遇到关于递归的题目一定要仔细消化，慢慢就能体会递归的思想。

第二部分 + 改为 x，return 0改为 return 1，之后，结果为：
33554432
177147
这里两个问题给大家思考，1)变成x号后，尝试同上做逐步分解。 2）为什么要把return 0 变为1。

```java
public class E18
{
  public static int mystery(int a, int b)
  {
    if (b == 0)      return 0;
    if (b % 2 == 0)  return mystery(a+a, b/2);
    return mystery(a+a, b/2) + a;
  }

  public static void main(String[] args)
  {
    System.out.println("mystery: ");
    System.out.println(mystery(2, 25));
    System.out.println(mystery(3, 11));
    System.out.println("mystery2: ");
    System.out.println(mystery2(2, 25));
    System.out.println(mystery2(3, 11));
  }

  public static int mystery2(int a, int b)
  {
    if (b == 0)      return 1;
    if (b % 2 == 0)  return mystery2(a*a, b/2);
    return mystery2(a*a, b/2)*a;
  }
}
/*
 Solution of 1.1.18
>>>java E18
mystery:
50
33
mystery2:
33554432
177147
*/
```
### 1.1.19 答案：
Fibonacci数列的算法深受数学家和程序教程喜欢，几乎每本算法书都会拿Fibonacci做例子。  
这一题对于初学语言的同学建议跳过，对于已经有基础的同学，就仔细研究下以下三种不同实现方式的区别。  
找到一个不错的Fibonacci讲解，写的很清楚，现在看不懂没关系，等学到后面的算法分析的时候就自然懂了。  
https://loggerhead.me/posts/qiu-fibonacci-shu-lie-de-n-chong-suan-fa.html

```java
public class Fibonacci
{
  public static long F(int N)
  {
    if (N == 0) return 0;
    if (N == 1) return 1;
    return (F(N - 1) + F(N - 2));
  }

  public static long F2(int N)
  {
    long[] r = new long[N + 2];
    //N + 2是为了避免在N = 0 or 1的时候出现 java.lang.ArrayIndexOutOfBoundsExceptio
    r[0] = 0; r[1] = 1;
    if (N <= 1)  return r[N];
    r[N] = F2(N - 2) + F2(N - 1);
    return r[N];
  }

  public static long F3(int N)
  {
    long f1 = 0, f2 = 1;
    long temp = 0;

    for(int i = 0; i < N; i++)
    {
      temp = f2;
      f2 = f2 + f1;
      f1 = temp;
    }
    return f1;
  }

  public static void main(String[] args)
  {
    int n = Integer.parseInt(args[0]);
    for (int i = 0; i < n; i++)
      System.out.println(F2(i));
      //这里可以改为 F(i) / F1(i) / F2(i)
  }
}

/*
 Solution of 1.1.18
>>>java Fibonacci 5
0
1
1
2
3
*/
```

### 1.1.20 答案：
这一题只关注阶乘即可，关于ln的部分可以暂时跳过，大家自行搜索 对数函数，重点关注 常用对数log 10和自然对数 log e。
程序直接使用Math库中的log方法。  
阶乘的递归很简单，N x (N-1) x (N-2) ...x 2 x 1:
```java
public class E20
{
  public static long factorial(int N)
  {
    if (N == 0 || N == 1) return 1;
    return  N * factorial(N - 1);
  }

  public static void main(String[] args)
  {
    int n = Integer.parseInt(args[0]);
    System.out.println(factorial(n));
    System.out.println(Math.log(factorial(n)));
  }
}
/*
 Solution of 1.1.20
>>>java E20 10
3628800
15.104412573075516
*/
```

### 1.1.21 答案：
留意第11行，int 和 float格式的/运算是不一样的。

```java
import edu.princeton.cs.algs4.*;
public class E21
{
  public static void main(String[] args)
  {
    while(StdIn.hasNextLine())
    {
      String name = StdIn.readString();
      int m = StdIn.readInt();
      int n = StdIn.readInt();
      float rate = (float)m / n;
      // 可以试试 rate = m / n 时的情况，这里也可以写成 m * 1.0 / n

      StdOut.printf("%12s  | %5d | %5d | %8.3f \n",name,m,n,rate);
    }
  }
}
/*
 Solution of 1.1.21
>>>java E21 < E21Data.txt
     Michael  |     7 |    67 |    0.104
       David  |    12 |   115 |    0.104
        Noad  |     5 |    34 |    0.147
       Aiden  |     7 |    97 |    0.072
      Joshua  |    23 |   276 |    0.083
        Alex  |     4 |    94 |    0.043
     William  |     5 |   121 |    0.041
*/
```
测试数据文件名 E21Data.txt，内容如下：
```
Michael 7 67
David 12 115
Noad 5 34
Aiden 7 97
Joshua 23 276
Alex 4 94
William 5 121
```

### 1.1.22 答案：
此题我直接用了书中提供的tinyW.txt，大家可以去本书官网下载。 https://algs4.cs.princeton.edu/home/   
另外我稍微调整了一下原方法中的语句的执行顺序，这一句 if (lo > hi) return -1;   
并且多打印了一些内容，为了大家方便看到程序在什么情况返回-1。大家可以把这一句提前，看看效果是怎么样。

```java
import java.util.Arrays;
import edu.princeton.cs.algs4.*;

public class E22
{
  public static int rank(int key, int[] a)
  {  return rank(key, a, 0, a.length -1, 0);}

  public static int rank(int key, int[] a, int lo, int hi, int depth)
  {
    int mid = lo + (hi - lo) / 2;

    for (int i = 0; i < depth; i++)  System.out.print(" ");
    System.out.printf("mid: %d, a[min]: %d : lo: %d, hi: %d, depth: %d \n", mid, a[mid], lo, hi, depth);
    depth++;

    if (lo > hi) return -1;
    if       (key < a[mid])  return rank(key, a, lo, mid -1, depth);
    else if  (key > a[mid])  return rank(key, a, mid + 1, hi, depth);
    else                     return mid;
  }

  public static void main(String[] args)
  {
    int[] whitelist = In.readInts(args[0]);
    Arrays.sort(whitelist);
    int key = Integer.parseInt(args[1]);
    if (rank(key, whitelist) < 0)
      StdOut.println(key);
  }
}
/*
 Solution of 1.1.22
>>>java E22 tinyW.txt 30
mid: 7, a[min]: 33 : lo: 0, hi: 14, depth: 0
 mid: 3, a[min]: 16 : lo: 0, hi: 6, depth: 1
  mid: 5, a[min]: 23 : lo: 4, hi: 6, depth: 2
   mid: 6, a[min]: 29 : lo: 6, hi: 6, depth: 3
    mid: 7, a[min]: 33 : lo: 7, hi: 6, depth: 4
30
*/

```

### 1.1.23 答案：
直接看代码即可：

```java
import java.util.Arrays;
import edu.princeton.cs.algs4.*;

public class E23
{
  public static int rank(int key, int[] a)
  {  return rank(key, a, 0, a.length -1);}

  public static int rank(int key, int[] a, int lo, int hi)
  {
    if (lo > hi) return -1;
    int mid = lo + (hi - lo) / 2;
    if       (key < a[mid])  return rank(key, a, lo, mid -1);
    else if  (key > a[mid])  return rank(key, a, mid + 1, hi);
    else                     return mid;
  }

  public static void main(String[] args)
  {
    int[] whitelist = In.readInts(args[0]);
    Arrays.sort(whitelist);

    char sign = '+';

    while(!StdIn.isEmpty())
    {
      int key = StdIn.readInt();
      boolean found = (rank(key, whitelist) < 0);
      if (sign == '+' && found)
          StdOut.println(key);
      if (sign == '-' && !found)
          StdOut.println(key);
    }
  }

}
/*
 Solution of 1.1.23
>>>java E23 tinyW.txt < tinyT.txt
50
99
13
*/
```

这里也提供一个测试用例，从命令行接受一个boolean值（true / false)，来代替+ 和 -，免得要一直修改main方法。
可以用此main方法代替上文中的main，则命令行输入如下：  
java E23 tinyW.txt true < tinyT.txt  
java E23 tinyW.txt false < tinyT.txt

```java
public static void main(String[] args)
{
  int[] whitelist = In.readInts(args[0]);
  Arrays.sort(whitelist);

  boolean sign = Boolean.parseBoolean(args[1]);
  // 接受 0 和 1

  while(!StdIn.isEmpty())
  {
    int key = StdIn.readInt();
    boolean found = (rank(key, whitelist) < 0);
    if (sign == true && found)
        StdOut.println(key);
    if (sign == false && !found)
        StdOut.println(key);
  }
}
```

### 1.1.24 答案：
欧几里德算法又称辗转相除法，一般也叫做最大公约数（Greatest Common Divisor）缩写为gcd。gcd算法本身很简单，原理可自行百度。
```java
public static int gcd(int m, int n)
{
  if(m % n == 0)  return n;
  else            return gcd(n, m % n);
}
```
完整用例如下：

```java
public class E24
{
  public static int gcd(int m, int n)
  {
    if(m % n == 0)  return n;
    else
    {
      System.out.println("m: " + m + ", n: " + n);
      return gcd(n, m % n);
    }
  }

  public static void main(String[] args)
  {
    int M = Integer.parseInt(args[0]);
    int N = Integer.parseInt(args[1]);
    System.out.println(gcd(M, N));
  }
}

/*
Solution of 1.1.24
>>>java E24 105 24
m: 105, n: 24
m: 24, n: 9
m: 9, n: 6
3
*/
```

### 1.1.25 答案：
数学归纳法... 好吧，我们还是去百度吧