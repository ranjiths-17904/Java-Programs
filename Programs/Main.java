 /**********  Reverse odd position Numbers   **********/

// import java.util.*;

// public class Main
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
        
//         int n = sc.nextInt();
//         int a[] = new int[n];
        
//         for(int i=0;i<n;i++)
//         {
//             a[i] = sc.nextInt();
//         }
        
//         ArrayList<Integer> sa = new ArrayList<>();
        
//         for(int i=0;i<n;i+=2)
//         {
//             sa.add(a[i]);
//         }
//         Collections.sort(sa , Collections.reverseOrder());
        
//         int ind = 0;
//         for(int i=0;i<n;i+=2)
//         {
//             a[i] = sa.get(ind);
//             ind++;
//         }
        
//         for(int i=0;i<n;i++)
//         {
//             System.out.print(a[i] + " ");
//         }
        
//     }
// }

// import java.util.*;

// public class ArrayListOperations {
//     public static void main(String[] args) {
//         // 1. Create an ArrayList of Integers, add 5 members, and print them.
//         ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
//         System.out.println("ArrayList: " + list);

//         // 2. Find and print the max and minimum number
//         int max = Collections.max(list);
//         int min = Collections.min(list);
//         System.out.println("Max: " + max + ", Min: " + min);

//         // 3. Check whether a number is present or not
//         int search = 30;
//         System.out.println("Is " + search + " present? " + list.contains(search));

//         // 4. Remove all even numbers and print remaining elements
//         list.removeIf(n -> n % 2 == 0);
//         System.out.println("After removing evens: " + list);

//         // 5. Create a string ArrayList, add 5 names, and sort in reverse alphabetical order
//         ArrayList<String> names = new ArrayList<>(Arrays.asList("John", "Alice", "Bob", "David", "Eve"));
//         names.sort(Collections.reverseOrder());
//         System.out.println("Sorted Names in Reverse: " + names);

//         // 6. Merge two integer ArrayLists and remove duplicates
//         ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//         ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));
//         Set<Integer> mergedSet = new HashSet<>(list1);
//         mergedSet.addAll(list2);
//         System.out.println("Merged List without duplicates: " + mergedSet);

//         // 7. Reverse an ArrayList without built-in functions
//         ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//         for (int i = 0, j = numbers.size() - 1; i < j; i++, j--) {
//             int temp = numbers.get(i);
//             numbers.set(i, numbers.get(j));
//             numbers.set(j, temp);
//         }
//         System.out.println("Reversed List: " + numbers);

//         // 8. Find and remove duplicate elements from an ArrayList
//         ArrayList<Integer> withDuplicates = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));
//         Set<Integer> uniqueSet = new LinkedHashSet<>(withDuplicates);
//         System.out.println("Without Duplicates: " + uniqueSet);

//         // 9. Find the second largest number in an ArrayList
//         ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
//         Collections.sort(numList, Collections.reverseOrder());
//         System.out.println("Second Largest: " + numList.get(1));

//         // 10. Rotate the list by k positions to the right
//         int k = 2;
//         Collections.rotate(numList, k);
//         System.out.println("Rotated List: " + numList);
//     }
// }


/********** Pattern box diagonals **********/

// import java.util.*;

// public class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();
        
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<n;j++)
//             {
//                 if(i==0 || i==n-1)
//                 {
//                     System.out.print("*");
//                 }
//                 else if(j==0 || j==n-1)
//                 {
//                     System.out.print("*");
//                 }
//                 else if(i == j || i+j == n-1)
//                 {
//                     System.out.print("*");
//                 }
//                 else
//                 {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }

//     }
// }

/********** Sum numbers in the String  EG: setw324bng2rr34 RES: 360  **********/

// import java.util.*;

// public class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc  = new Scanner(System.in);
//         String s1 = sc.nextLine();
//         String s2 = "ab";
//         String s = s1 + s2;
//         String num = "";
//         int sum = 0;

//         for(int i=0;i<s.length();i++)
//         {
//             char ch = s.charAt(i);

//             if(ch >= '0' && ch <='9')
//             {
//                 num += ch;
//             }
//             else
//             {
//                 if(!num.equals(""))
//                 {
//                     sum += Integer.parseInt(num);
//                     num = "";
//                 }
//             }
//         }
//         System.out.println(sum);
//     }
// }

/** Sum the numbers in string while testcase case size will given **/

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);

//               int t = sc.nextInt();
//               // sc.nextLine();
//               int sum = 0;
//               for(int i=0;i<t;i++)
//               {
//                      String s1 = sc.next();
//                      String res = "";
//                      String s2 = "ad";
//                      String s = s1 + s2;
//                      int n = s.length();
//                      for(int j=0;j<n;j++)
//                      {
//                             char c = s.charAt(j);

//                             if(c >= '0' && c <= '9')
//                             {
//                                    res += c;
//                             }
//                             else
//                             {
//                                    if(!res.equals(""))
//                                    {
//                                           sum += Integer.parseInt(res);
//                                           res = "";
//                                    }
//                             }
//                      }
//               }
//               System.out.println(sum);

//        }
// }

/** Size of string given only get numbers from String  **/ 

// import java.util.*;

// public class Main
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         sc.nextLine();

//         for(int i=0;i<n;i++)
//         {
//             String s = sc.nextLine();
//             String num = "";

//             for(int j=0;j<s.length();j++)
//             {
//                 char ch = s.charAt(j);

//                 if(ch >= '0' && ch<='9')
//                 {
//                     num += ch;
//                 }
//                 else
//                 {
//                     if(!num.equals(""))
//                     {
//                         System.out.print(num + " ");
//                         num = "";
//                     }
//                 }
//             }
//             if(!num.equals(""))
//             {
//                 System.out.println(num);
//             }
//             System.out.println();
//         }
//     } 
// }

/********
PATTERN
1     * 
2 3 * *
********/

// import java.util.*;
// public class Main{
//         public static void main(String[] args)
//         {
//                 Scanner sc = new Scanner(System.in);
//                 int n= sc.nextInt();
//                 int num = 1; 
//                 for(int i=1;i<=n;i++)
//                 {
//                         for(int j=1;j<=i;j++)
//                         {
//                                 System.out.print(num + " ");
//                                 num++;
//                         }

//                         for(int k = 1;k<=(2* ( n - i));k++)
//                         {
//                                 System.out.print("  ");
//                         }
//                         for(int k=1;k<=i;k++)
//                         {
//                                 System.out.print("* ");
//                         }
//                         System.out.println();
//                 }
//         } 
// }

/**** UPPERCASE ****/

// import java.util.*;
// public class Main{
//         public static void main(String[] args)
//         {
//                 Scanner sc = new Scanner(System.in);
//                 String s = sc.nextLine();
//                 String upp = "";

//                 for(int i=0;i<s.length();i++)
//                 {
//                         char ch = s.charAt(i);

//                         if(ch >= 'a' && ch <= 'z')
//                         {
//                                 ch = (char)(ch-32);
//                         }
//                         upp += ch;
//                 }
//                 System.out.print(upp + " ");
//         }
// }

/**** 
Input 
aA
aaAbb
Result
3

[wrong Answer only obtained]
****/

// import java.util.*;

// public class Main{
//         public static void main(String[] args){
//                 Scanner sc = new Scanner(System.in);
//                 String s = sc.nextLine();
//                 String s1 = sc.nextLine();
//                 int count = 0;
//                 for(int i=0;i<s.length();i++)
//                 {
//                         char ch = s.charAt(i);

//                         if(ch >= 'a' && ch <= 'z')
//                         {
//                                 ch = (char)(ch - 32);
//                         }

//                 for(int j=0;j<s1.length();j++)
//                 {
//                         char h = s1.charAt(j);

//                         if(h >= 'a' && h <= 'z')
//                         {
//                                 h = (char)(h-32);
//                         }
//                         if(h == ch)
//                         {
//                                 count++;
//                         }
//                 }
//             }
//                 System.out.println(count);
//         }
// }

/*** Binary Conversation
 Input: 2 
2 4
Result

0 1 
0 1 10 11 ***/

// import java.util.*;

// public class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
        
//         int n = sc.nextInt();
//         int a[] = new int[n];

//         for(int i=0;i<n;i++)
//         {
//               a[i] = sc.nextInt();
//         }

//         for(int i=0;i<n;i++)
//         {
//               for(int j=0;j<a[i];j++)
//               {
//                      System.out.print(Integer.toBinaryString(j) + " ");
//               }
//               System.out.println();
//        }    
//     }
// }

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);

//               int n = sc.nextInt();
//               int a[] = new int[n];
//               for(int i=0;i<n;i++)
//               {
//                      a[i] = sc.nextInt();
//               }

//               for(int i=0;i<n;i++)
//               {
//                      for(int j=0;j<a[i];j++)
//                      {
//                             System.out.print(Integer.toBinaryString(j) + " ");
//                      }
//                      System.out.println();
//               }
//        }
// }

/******** Longest Prefix in a String *******/

// import java.util.*;
// public class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         String s1[] = s.split(" ");

//         for(int i=0; i<s1[0].length() && i<s1[s1.length-1].length();i++)
//         {
//             if(s1[0].charAt(i) == s1[s1.length-1].charAt(i))
//             {
//                 System.out.print(s1[0].charAt(i));
//             }
//             else
//             {
//                 break;
//             }
//         }
        
//     }
// }

/****** Extract two numbers sum is equal to K ******/

// import java.util.*;

// public class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         String s[] = sc.nextLine().split(" ");
//         int a[] = new int[s.length];

//         for(int i=0;i<s.length;i++)
//         {
//             a[i] = Integer.parseInt(s[i]);
//         }

//         int k = sc.nextInt();
//         boolean ch = false;

//         for(int i=0;i<a.length;i++)
//         {
//             for(int j=i+1;j<a.length;j++)
//             {
//                 if(a[i] + a[j] == k)
//                 {
//                     System.out.println("index 1: " + i);
//                     System.out.println("index 2: " + j);
//                     ch = true;
//                     break;
//                 }
//             }
//         }
//         if(!ch)
//         {
//             System.out.print("Not a Valid Input");
//         }

//     }
// }


/****  Diamond space Inside based on the size  ****/

// import java.util.*;

// public class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i=n;i>=1;i--)
//         {
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print("*");
//             }
//             for(int j=1;j<=(n-i) * 2 + 1;j++)
//             {
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         } 
        
//         for(int i=1;i<=n;i++)
//         {
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print("*");
//             }
//             for(int j=1;j<= (n-i) * 2 + 1;j++)
//             {
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

/**** Natural Number in Binary EG:34430 RES: 312 ****/

// import java.util.*;

// public class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner (System.in);
//         long M = sc.nextLong();

//         for(long i=2;i<M;i++)
//         {
//             long num = i;
//             long digit = num % i;
//             boolean ch = true;

//             while(num > 0)
//             {
//                 if(num != digit % i )
//                 {
//                     ch = false;
//                     break;
//                 }
//                 num /= i;
//             }
//             if(ch)
//             {
//                 System.out.print(i);
//                 return;
//             }
//         }
//         System.out.println(M-1);
//     }
// }

/** Box Pattern **/

// import java.util.*;
// public class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<n;j++)
//             {
//                 if(i== 0 || j == 0 || i == n-1 || j == n-1)
//                 {
//                     System.out.print("*");
//                 }
//                 else
//                 {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }

//     }
// }

/*    */

// import java.util.*;

// public class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i=1;i<=n;i+=3)
//         {
//             System.out.print( i + " ");
//         }
//     }
// }

/** Even Power numbers **/

// import java.util.*;

// public class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

// //         for(int i=1;i<= 2*(n*n*n);i*=4)
// //         {
// //             System.out.print(i + " ");
// //         }

// //             int res = 1;
// //             for(int i=0;i<n;i++)
// //             {
// //                 System.out.print(res + " ");
// //                 res *= 4;
// //             }
// //     }
// // }

/****           Pattern 1 *2             ****/

// import java.util.*;

// public class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i=1;i<=n;i++)
//         {
//             for(int j=1;j<=i;j++)
//             {
//                 if(j> 1)
//                 {
//                 System.out.print(" *");
//                 }
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//         for(int i=n;i>=1;i--)
//         {
//             for(int j=1;j<=i;j++)
//             {
//                 if(j> 1)
//                 {
//                 System.out.print(" *");
//                 }
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

/*  Pattern  */
/*     1
       2 3
       2 3
       1   
              */
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt(); 

//         int k = 1; 
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(k++ + " ");
//             }
//             System.out.println();
//         }
//         k -= n;  
//         for (int i = n; i >= 1; i--) {
//           int l = k;
//             for (int j = 1; j <=i; j++) {
//                 System.out.print(l++ + " ");
//             }
//             k -= (i-1);  
//             System.out.println();
//         }
//     }
// }

/*** IN: 10 20 30 5 10 RES : 5 ***/

// import java.util.*;

// public class Main
// {
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);
//               int n= sc.nextInt();

//               int a[] = new int[n];

//               for(int i=0;i<n;i++)
//               {
//                      a[i] = sc.nextInt();
//               }

//               int res = -1;
//               for(int i=1;i<n;i++)
//               {
//                      if(a[i] < a[i-1])
//                      {
//                             res = i + 1;
//                             break;
//                      }
//               }
//               System.out.println(res);
//        }
// }

// ANOTHER METHOD:
// import java.util.*;

// public class  Main {

//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);
//               int n = sc.nextInt();
//               int ch = Integer.MAX_VALUE;
//               for(int i=0;i<n;i++)
//               {
//                      int num = sc.nextInt();
//                      if(num < ch)
//                      {
//                             System.out.print(i+1);
//                             return;
//                      }
//                      ch = num;
//               }
//               System.out.print("Invalid");
//        }
// }


/** IN:3 RES: 1 3 2 2 3 1**/

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);

//               int n = sc.nextInt();

//               for (int i = 1, j = n; i <= n && j >= 1; i++, j--)
//               {
//                      System.out.print(i +" " + j + " ");
//               }
//        }
// }

/*** Normal Pattern ***/

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc= new Scanner(System.in);
//               int n = sc.nextInt();

//               for(int i=1;i<=n;i++)
//               {
//                      for(int j=1;j<=i;j++)
//                      {
//                             System.out.print("* ");
//                      }
//                      System.out.println();
//               }

//               for(int i=1;i<=n-1;i++)
//               {
//                      for(int j=1;j<=(n-i);j++)
//                      {
//                             System.out.print("* ");
//                      }
//                      System.out.println();

//               }
//        }
// }

/** Butterfly Pattern **/

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);

//               int n = sc.nextInt();
              
//               for(int i=1;i<=n;i++)
//               {
//                      for(int j=1;j<=i;j++)
//                      {
//                             System.out.print(" ");
//                      }

//                      for(int j=1;j<=2*(n-i);j++)
//                      {
//                             System.out.print("  ");
//                      }

//                      for(int j=1;j<=i;j++)
//                      {
//                             System.out.print("* ");
//                      }
//                      System.out.println();
//               }


//               for(int i=n;i>=1;i--)
//               {
//                      for(int j=1;j<=i;j++)
//                      {
//                             System.out.print("* ");
//                      }

//                      for(int j=1;j<=2*(n-i);j++)
//                      {
//                             System.out.print("  ");
//                      }

//                      for(int j=1;j<=i;j++)
//                      {
//                             System.out.print("* ");
//                      }
//                      System.out.println();

//               }
//        }
// }

/** Pyramid Pattern **/

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);

//               int n = sc.nextInt();
//               for(int i=1;i<=n;i++)
//               {
//                      for(int j=1;j<=n-i;j++)
//                      {
//                             System.out.print("  ");
//                      }

//                      for(int k=1;k<=2*i-1;k++)
//                      {
//                             System.out.print("* ");
//                      }

//                      System.out.println();
//               }
//        } 
// }

/* Max Digit in a Number */

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);

//               int n = sc.nextInt();
//               int max = 0;

//               while(n > 0)
//               {
//                      int dig = n % 10;
//                      if(dig > max)
//                      {
//                             max = dig;
//                      }
//                      n /= 10;
//               }

//               System.out.println(max);
//        }
// }

/** same , unique and invalid **/

// import java.util.*;

// public class Main
// {
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);
//               int t = sc.nextInt();

//               for(int i=0;i<t;i++)
//               {
//                      int n = sc.nextInt();
//                     // System.out.print(n);

//                      if( n < 10)
//                      {
//                             System.out.println("Invalid");
//                      }
//                      else{
//                             int num1 = n % 10;
//                             int num = n / 10; 

//                             if(num1 == num)
//                             {
//                                    System.out.println("Same");
//                             }
//                             else{
//                                    System.out.println("Unique");
//                             }
//                      }

//               }
//        }
// }

/* Armstrong Number range */


// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);

//               int st = sc.nextInt();
//               int end = sc.nextInt();

//               System.out.println("Armstrong numbers from " + st + " from " + end + " are: ");

//               for(int i=st;i<end;i++)
//               {
//                      int sum = 0, temp = i, num = i, dig = 0;
                     
//                      while(temp>0)
//                      {
//                             temp /= 10;
//                             dig++;

//                     }
//                     temp = num;

//                     while(temp > 0)
//                     {
//                      int digit = temp % 10;
//                      sum += Math.pow(digit, dig);
//                      temp /= 10;
//                     }

//                     if(sum == num)
//                     {
//                      System.out.print(num + " ");
//                     }
//               }

//        }
// }

/*** Binary Number Check ***/

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);
//               String s = sc.nextLine();
//               boolean bi = true;

//               for(int i=0;i<s.length();i++)
//               {
//                      char ch = s.charAt(i);

//                      if(ch != '0' && ch != '1')
//                      {
//                             bi = false;
//                             break;
//                      }
//               }
//               if(bi)
//               {
//                      System.out.println( s + " is a binary number");
//               }
//               else{
//                      System.out.println(s + " is not a binary number");
//               }

//        }
// }

/** A Number divisible by all or not **/

// import java.util.*;

// public class Main {

//         public static void main(String[] args)
//         {
//               Scanner sc = new Scanner(System.in);
//               int n = sc.nextInt();
//               int a[] = new int[n];

//               for(int i=0;i<n;i++)
//               {
//                      a[i] = sc.nextInt();
//               }
//               int res = 0;
//               boolean div = false;

//               for(int i=0;i<n;i++)
//               {
//                      div = true;
//                      for(int j=0;j<n;i++)
//                      {
//                             if(i != j && a[i] % a[j] != 0)
//                             {
//                                    div = false;
//                                    break;
//                             }
//                      }

//                      if(div)
//                      {
//                             res = a[i];
//                             break;
//                      }
//               }
//               System.out.println(res);

//         }
// }

/** Binary 1's Count **/

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);
//               int st = sc.nextInt();
//               int end = sc.nextInt();
//               int count = 0;

//               for(int i=st;i<=end;i++)
//               {
//                      count += Integer.bitCount(i);
                     
//               }
//               System.out.println(count);
//        }
// }

/* Exactly twice occurs */

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);
//               int t = sc.nextInt();
//               sc.nextLine();

//               for(int i=0;i<t;i++)
//               {
//                      int num = sc.nextInt();
//                      sc.nextLine();

//                      String s = sc.nextLine();

//                      String s1[] = s.split(" ");

//                      HashMap <String, Integer> cou = new HashMap<>();
//                      for(String word : s1)
//                      {
//                             cou.put(word, cou.getOrDefault(word, 0) + 1);

//                      }

//                      int twice = 0;
//                      for(int value : cou.values())
//                      {
//                             if(value == 2)
//                             {
//                                    twice++;
//                             }
//                      }
//                      System.out.println(twice);
//               }
//        }
// }

/* Print previous prime number */
// import java.util.*;

// public class Main
// {
//        public static void main(String[] args) {
//               Scanner sc = new Scanner(System.in);

//               int t = sc.nextInt();
//               for(int i=0;i<t;i++)
//               {
//                      int num = sc.nextInt();
//                      int pre = num - 1;

//                      while(pre > 1)
//                      {
//                             boolean prime = true;

//                             for(int j=2;j*j <= pre;j++)
//                             {
//                                    if(pre % j == 0)
//                                    {
//                                        prime = false;
//                                        break;
//                                    }
//                             }

//                             if(prime)
//                             {
//                                    System.out.println(pre);
//                                    break;
//                             }
//                             pre--;
//                      }
//               }
//        }
// }

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);
//               int t = sc.nextInt();

//               for(int i=0;i<t;i++)
//               {
//                      int num = sc.nextInt();
//                      int pre = num - 1;

//                      while(pre > 1)
//                      {
//                             boolean sp = true;

//                             for(int j = 2; j * j <= pre; j++)
//                             {
//                                    if(pre % j == 0)
//                                    {
//                                           sp = false;
//                                    }
//                             }

//                             if(sp)
//                             {
//                                    System.out.println(pre);
//                                    break;
//                             }
//                             pre--;
//                      }
//               }
//        }
// }

/** Zig Zag **/

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);

//               int n = sc.nextInt();
//               int a[] = new int[n];

//               for(int i=0;i<n;i++)
//               {
//                      a[i] = sc.nextInt();
//               }

//               for(int i=0;i<n-1;i++)
//               {
//                      if( i % 2 == 0 && a[i] > a[i+1] )
//                      {
//                             int temp = a[i];
//                             a[i] = a[i+1];
//                             a[i+1] = temp;
//                      }
//                      else if( i % 2 != 0 && a[i] < a[i+1] )
//                      {
//                             int temp = a[i];
//                             a[i] = a[i+1];
//                             a[i+1] = temp;
//                      }
//               }
//               for(int num : a)
//               {
//                      System.out.print(num + " ");
//               }

//               // We can use normal for loop like below
//               // for(int i=0;i<n;i++)
//               // sop(a[i] + " ");
//        }
// }

/** Array Rotation **/

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner (System.in);

//               int n = sc.nextInt();
//               int a[] = new int[n];

//               for(int i=0;i<n;i++)
//               {
//                      a[i] = sc.nextInt();
//               }

//               int k = sc.nextInt();
//               int rot[] = new int[n];
//               int ind = 0;

//               for(int i=k;i<n;i++)
//               {
//                      rot[ind++] = a[i];
//               }
//               for(int i=0;i<k;i++)
//               {
//                      rot[ind++] = a[i];
//               }

//               for(int num : rot)
//               {
//                      System.out.print(num +  " ");
//               }
//        }
// }

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);
//               int n = sc.nextInt();

//               int a[] = new int[n];
//               for(int i=0;i<n;i++)
//               {
//                      a[i] = sc.nextInt();
//               }

//               int k = sc.nextInt();
//               int rot[] = new int[n];
//               int ind = 0;

//               for(int i=k;i<n;i++)
//               {
//                      rot[ind++] = a[i];
//               }

//               for(int i=0;i<k;i++)
//               {
//                      rot[ind++] = a[i];
//               }

//               for(int res : rot)
//               {
//                      System.out.print(res + " ");
//               }
//        }
// }

/**  UPPER CASE  **/

// import java.util.*;

// public class Main{
//        public static void main(String[] args) {
//               Scanner sc = new Scanner(System.in);
              
//               String s = sc.nextLine();
              

//               System.out.print(s.toUpperCase());
//        }
// }

/*** First non-repeating position ***/

// import java.util.*;

// public class Main{
//        public static void main(String[] args) {
//               Scanner sc = new Scanner(System.in);

//               String s  = sc.nextLine();
//               int pos = -1;
//               for(int i=0;i<s.length();i++)
//               {
//                      char c = s.charAt(i);
//                      boolean isRep = false;

//                      for(int j=0;j<s.length();j++)
//                      {
//                             if(i != j && c == s.charAt(j))
//                             {
//                                    isRep = true;
//                                    break;
//                             }
//                      }

//                      if(!isRep)
//                      {
//                             pos = i + 1;
//                             break;
//                      }
//               }
//               if(pos != -1)
//               {
//                      System.out.print(pos);
//               }
//               else
//               {
//                      System.out.print(-1);
//               }
//        }
// }

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);

//               String s = sc.nextLine();
//               int pre = -1;

//               for(int i=0;i<s.length();i++)
//               {
//                      char c = s.charAt(i);
//                      boolean rp = false;


//                      for(int j=0;j<s.length();j++)
//                      {
//                             if( i != j && c == s.charAt(j))
//                             {
//                                    rp = true;
//                                    break;
//                             }
//                      }
//                      if(!rp)
//                      {
//                             pre = i + 1;
//                             break;
//                      }
//               }
//               if(pre != -1)
//               {
//                      System.out.print(pre);
//               }
//               else{
//                      System.out.println(-1);
//               }
//        }
// }

/*** PROGRAM PATTERN [ ALTERNATE PROGRAM PRESENT BELOW THIS CODE ]***/

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);

//               String s = sc.nextLine();

//               Map <Integer, String> map = new LinkedHashMap<>();

//               for(int i=0;i<s.length();i++)
//               {
//                      map.put(i , s.substring(0, i+1));
//               }

//               for(String value : map.values())
//               {
//                      System.out.println(value);
//               }
//        }
// }

// import java.util.*;

// public class Main
// {
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);

//               String  s = sc.nextLine();
              
//               for(int i=0;i<=s.length();i++)
//               {
//                      System.out.println(s.substring(0, i));
//               }

//        }
// }


/** Next Date Problem **/

// import java.time.format.*;
// import java.time.*;
// import java.util.*;

// public class Main {

//         public static void main(String[] args) {
              
//               Scanner sc = new Scanner(System.in);

//               String s = sc.nextLine();
//               DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//               LocalDate gn = LocalDate.parse(s, dt);
//               LocalDate net = gn.plusDays(1);

//               System.out.print(net.format(dt));
//         }
// }


/** **/

// import java.util.*;

// public class Main{
//        public static void main(String[] args) {
//              Scanner sc = new Scanner(System.in);
             
//              String s = sc.nextLine();
//              String[] s1 = s.split(":");

//              System.out.print()

//        }
// }

/** PALINDROME **/

// import java.util.*;

// public class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int rem, rev = 0;

//         int temp = n;
//         while (n != 0) 
//             rem = n % 10;
//             rev = rev * 10 + rem;
//             n /= 10; 
//         }

//         if (temp == rev) {
//             System.out.println("true");
//         } else {
//             System.out.println("false");
//         }
//     }
// }

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);

//               int n = sc.nextInt();
//               int rem , rev = 0;

//               int temp = n;

//               while(n != 0)
//               {
//                      rem = n % 10;
//                      rev = rev * 10 + rem;
//                      n /= 10;
//               }

//               if( temp == rev)
//               {
//                      System.out.println("TRUE");
//               }
//               else
//               {
//                      System.out.println("FALSE");
//               }
//        }
// }


/** BATSMAN PROBLEM **/

// public class Main
// {
//     public static void main(String[] args) {
//         String s = "2416Y.."; // Input string
//         int b1 = 0, b2 = 0, bo = 0;
//         boolean flag = true;
//         int count = 0;
//         // Check if the string length is exactly 6 and contains 'Y'
//         if (s.length() != 6 && !s.contains("Y")) {
//             System.out.println("Invalid");
//             return;
//         }

//         for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);

//             if (c == '.') {
//                 continue; // Skip periods
//             } else if (c == 'Y') {
//                 bo++; // Increment bowler count for 'Y' (wide ball)
//             } else if (c >= '0' && c <= '9') {
//                 int r = c - '0';
//                 bo += r; // Add to bowler count for numeric values

//                 if (flag) {
//                     b1 += r; // Add to b1 if flag is true
//                 } else {
//                     b2 += r; // Add to b2 if flag is false
//                 }

//                 if (r % 2 != 0) {
//                     flag = !flag; // Switch flag for odd numbers
//                 }
//             } else {
//               count++;
//             }
//         }
//         if(count==0)
//         {
//                System.out.println(b1); // Print the value of b1
//                System.out.println(b2); // Print the value of b2
//                System.out.println(bo); // Print the value of bo (bowler count)
//         }
//         else
//         {
//               System.out.println("Invalid");
//         }
//     }
// }

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);
//               String s = sc.nextLine();

//               int bt1 = 0 , bt2 = 0, bow = 0;
//               boolean flag = true;

//               if(s.length() != 6 && !s.contains("Y"))
//               {
//                      System.out.println("Invalid");
//                      return;
//               }

//               for(int i=0;i<s.length();i++)
//               {
//                      char c = s.charAt(i);

//                      if(c == '.')
//                      {
//                             continue;
//                      }
//                      else if(c == 'Y')
//                      {
//                             bow ++;
//                      }
//                      else if( c >= '1' && c <= '9')
//                      {
//                             int r = c - '0';
//                             bow += r;

//                             if(flag)
//                             {
//                                    bt1 += r;
//                             }
//                             else
//                             {
//                                    bt2 += r;
//                             }
//                             if(r % 2 != 0)
//                             {
//                                    flag = !flag;
//                             }
//                      }
//                      else
//                      {
//                             System.out.println("Invalid");
//                             return;
//                      }
//               }
//               System.out.println("Batsman1 : " + bt1);
//               System.out.println("Batsman2 : " + bt2);
//               System.out.println("Bowler : " + bow);
//        }
// }


/** Input
       I* Am Not String
       Output
       g* ni rts toNmAI
**/

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);
//               String s = sc.nextLine();
//               char[] c = s.toCharArray();

//               int st = 0, end = c.length-1;

//               while(st < end)
//               {
//                      if(!Character.isLetter(c[st]))
//                      {
//                             st++;
//                      }
//                      else if(!Character.isLetter(c[end]))
//                      {
//                             end--;
//                      }

//                      else
//                      {
//                             char temp = c[st];
//                             c[st] = c[end];
//                             c[end] = temp;

//                             st++;
//                             end--;
//                      }
//               }
//               System.out.print(new String(c));
//        }
// }

/* Remove Zero's  */

// import java.util.*;

// public class Main{
//        public static void main(String[] args) {
//               Scanner sc = new Scanner (System.in);

//               String s = sc.nextLine();
//               String res = s.replaceFirst("^0+" ,"");

//               if(res.isEmpty())
//               {
//                      res = "0";
//               }

//               System.out.print(res);
//        }
// }

/*** Max without character ***/

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);

//               String s = sc.nextLine();
//               int n = s.length();
//               int max = -1;

//               for(int i=0;i<n;i++)
//               {
//                      for(int j=i+1;j<n;j++)
//                      {
//                             if(s.charAt(i) == s.charAt(j))
//                             {
//                                    int len = j - i - 1;

//                                    if(len >  max)
//                                    {
//                                           max = len;
//                                    }
//                             }
//                      }
//               }
//               System.out.println(max);
//        }
// }

// import java.util.*;

// public class Main{
//        public static void main(String[] args) {
//               Scanner sc = new Scanner(System.in);

//               String s = sc.nextLine();

//               String[] a = s.split(" ");
//               Arrays.sort(a);

//               for(int i=0;i<a[0].length() && i<a[a.length-1].length();i++)
//               {
//                      if(a[0].charAt(i) == a[a.length-1].charAt(i))
//                      {
//                             System.out.print(a[0].charAt(i));
//                      }
//                      else{
//                             break;
//                      }
//               }
//        }
// }

/** Max in an array of n/2 **/

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);

//               int n = sc.nextInt();
//               int a[] = new int[n];
//               for(int i=0;i<n;i++)
//               {
//                      a[i] = sc.nextInt();
//               }

//               Arrays.sort(a);
//               for(int i=n-1;i>=n/2;i--)
//               {
//                      System.out.print(a[i] + " ");
//               }
//        }
// }

/** Reverse without special character **/

// import java.util.*;

// public class Main{
//        public static void main(String[] args) {

//               Scanner sc = new Scanner(System.in);
//               String s = sc.nextLine();
//               char[] c = s.toCharArray();

//               int lef = 0, right = c.length-1;

//               while(lef < right)
//               {
//                      if(!Character.isLetterOrDigit(c[lef]))
//                      {
//                             lef++;
//                      }
//                      else if(!Character.isLetterOrDigit(c[right]))
//                      {
//                             right--;
//                      }
//                      else
//                      {
//                             char temp = c[lef];
//                             c[lef] = c[right];
//                             c[right] = temp;

//                             lef++;
//                             right--;
//                      }
//               }
//               System.out.print(new String(c));
//        }
// }

/** Valid Close and open brackets **/

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int testCases = sc.nextInt();
//         sc.nextLine(); 

//         for (int t = 0; t < testCases; t++) {
//             String input = sc.nextLine();

//             Stack<Character> stack = new Stack<>();
//             boolean isValid = true;
//             for (int i = 0; i < input.length(); i++) {
//                 char ch = input.charAt(i);

//                 if (ch == '(' || ch == '{' || ch == '[') {
//                     stack.push(ch);
//                 } 
//                 else if (ch == ')' || ch == '}' || ch == ']') {
//                     if (stack.isEmpty()) {
//                         isValid = false; 
//                         break;
//                     }
//                     char top = stack.pop();
//                     if ((ch == ')' && top != '(') ||
//                         (ch == '}' && top != '{') ||
//                         (ch == ']' && top != '[')) {
//                         isValid = false; 
//                         break;
//                     }
//                 }
//             }

//             System.out.println(isValid ? "True" : "False");
//         }
//     }
// }

/**very sub-string of identical letters is replaced by a single instance of that letter followed by the hexadecimal representation **/

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);

//               String s = sc.nextLine();
//               StringBuilder sb = new StringBuilder();
//               int i = 0;

//               while(i < s.length())
//               {
//                      char c = s.charAt(i);
//                      int count = 0;


//                      while(i<s.length() && s.charAt(i) == c)
//                      {
//                             count++;
//                             i++;
//                      }
//                      sb.append(c);
//                      sb.append(Integer.toHexString(count));

//               }
//               String res = sb.reverse().toString();

//               System.out.print(res);
//        }
// }

/**  Odd and Even position changing problem **/

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);

//               int n = sc.nextInt();

//               int a[] = new int[n];
//               for(int i=0;i<n;i++)
//               {
//                      a[i] = sc.nextInt();
//               }
//               Arrays.sort(a);

//               int left = 0, right = n-1;
//               int res[] = new int[n];

//               for (int i = 0; i < n; i++) {
//             if (i % 2 == 0) {
//                 res[i] = a[right--]; 
//             } else {
//                 res[i] = a[left++]; 
//             }
//         }

       
//               for (int i = 0; i < n; i++) {
//               System.out.print(res[i] + " ");
//               }
//        }
// }

// import javax.script.ScriptEngine;
// import javax.script.ScriptEngineManager;

/** Wrong Position Count **/

// import java.util.*;

// public class Main{
//        public static void main(String[] args) {
//               Scanner sc = new Scanner(System.in);

//               int n = sc.nextInt();
//               int a[] = new int[n];

//               for(int i=0;i<n;i++)
//               {
//                      a[i] = sc.nextInt();
//               }

//               int b[] = a.clone();
//               Arrays.sort(b);
//               int c = 0;
//               for(int i=0;i<n;i++)
//               {
//                      if(a[i] != b[i])
//                      {
//                             c++;
//                      }
//               }
//               System.out.print(c);
//        }
// }

// import java.util.*;
// public class Main{
//        public static void main(String[] args) {
//               int n=4;
//               for(int i=0;i<n;i++){
//                      for(int j=0;j<=n-i;j++){
//                             System.out.print(" ");
//                      }
//                      int m=1;
//                      for(int j=0;j<=i;j++){
//                             System.out.print(m+" ");
//                             m=m*(i-j)/(j+1);
//                      }
//                      System.out.println();
//               }
//        }
// }
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String input = scanner.nextLine();

//         String word = "";
//         for(int i=input.length()-1;i>=0;i--)
//         {
//             word += input.charAt(i);
//         }
//         System.out.println(word);

//         String token = "cdm345fg7";
//         String word1 = word + token;

//         System.out.println(word1);

//         String formatted = "";
//         int count=0;
//         for(int i = 0; i < word1.length(); i++)
//         {
//             formatted += word1.charAt(i);
            
//             if(i % 4 == 0 )
//             {
                
//                 System.out.print(formatted);
//             }
//         }
//     }
// }


/** CODEPOINTAT STRING BUILTIN FUNCTION **/

// import java.util.*;

// public class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String s  = sc.nextLine();
//         int res = 0;        
//         for(int i=0;i<s.length();i++)
//         {
//             res = s.codePointAt(i);
//             System.out.print(res + " ");
//         }
//         System.out.println();
//         System.out.print(res);
//     }
// }

/**  Contains & contents **/

// import java.util.*;

// public class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         String s = sc.nextLine();
//         String k = sc.nextLine();

//         for(int i=0;i<s.length();i++)
//         {
//             if(s.contentEquals(k))
//             {
//                 System.out.print("TRUE");
//                 break;
//             }
//             else if(s.contains(k))
//             {
//                 System.out.print("YES");
//                 break;
//             }
//             else
//             {
//                 System.out.print("NO");
//                 break;
//             }
//         }
//     }
// }

/*** Prime from range and contains 3 **/

// import java.util.*;
// public class Main
// {
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     int st = sc.nextInt();
//     int end = sc.nextInt();

//     for(int num = st ; num <= end ; num++)
//     {
//         boolean isp = true;
//         if(num < 2)
//         {
//             isp = false;
//         }
//         else{
//             for(int i=2 ; i * i <= num;i++)
//             {
//                 if(num % i == 0)
//                 {
//                     isp = false;
//                     break;
//                 }
//             }
//         }
//         if(isp)
//         {
//             int temp = num;
//             boolean con = false;

//             while(temp > 0)
//             {
//                 if(temp % 10 == 3)
//                 {
//                     con = true;
//                     break;
//                 }
//                 temp /= 10;
//             }
//             if(con)
//             {
//                 System.out.print(num + " ");
//             }
//         }
//     }
//  }
// }


/** Sum digit and check odd or even**/

// import java.util.*;

// public class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int num = sc.nextInt();
//         int sum = 0;

//         while(num > 0)
//         {
//             sum += num % 10;
//             num /= 10;
//         }

//         while(sum >= 10)
//         {
//             int tempsum = 0;

//             while(sum > 0)
//             {
//                 tempsum += sum % 10;
//                 sum /= 10;
//             }
//             sum = tempsum;
//         }

//         if(sum % 2 == 0)
//         {
//             System.out.println("Yes");
//         }
//         else
//         {
//             char ch = (char)('a' + sum - 1);
//             System.out.println(ch);
//         }
//     }
// }

/** Input Hello Result ello Hy **/

// import java.util.*;

// public class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         String s = sc.nextLine();
//         int n = s.length();

//         String res = "";
//         for(int i=0;i<n;i++)
//         {
//             if(s.charAt(i) == ' ')
//             {
//                 res += " ";
//             }
//             else
//             {
//                 int st = i;

//                 while(i < n && s.charAt(i) != ' ')
//                 {
//                     i++;
                    
//                   }  
//                   res += s.substring(st + 1, i) + " " + s.charAt(st) + "y";
//                     if(i < n)
//                     {
//                         res += " ";
//                     }
//             }
//         }
//         System.out.print(res.trim());
//     }
// }

/*** Another Way ***/

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String s = sc.nextLine();
//         String[] a = s.split(" ");

//         for (int i = 0; i < a.length; i++) {
//             char c = a[i].charAt(0); // First character of the current word
//             System.out.print(a[i].substring(1) + "-" + c + "ay ");
//         }
//     }
// }


/** Sum the digit in an array check odd / even and if even number print else character print **/

// import java.util.*;

// public class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int a[] = new int[n];

//         for(int i=0;i<n;i++)
//         {
//             a[i] = sc.nextInt();
//         }

//         int sum[] = new int[n]; 
//         int temp[] = new int[n]; 
//         int tot[] = new int[n]; 

//         for(int i=0;i<n;i++)
//         {
//             while(a[i] > 0)
//             {
//                 sum[i] += a[i] % 10;
//                 a[i] /= 10;
//             }

//             while(sum[i] >= 10)
//             {
//                 while(sum[i] > 0)
//                 {
//                     temp[i] += sum[i] % 10;
//                     sum[i] /= 10;
//                 }
//                 sum[i] = temp[i];
//             }

//             while(temp[i] >= 100)
//             {
//                 while(temp[i] >=10)
//                 {
//                     while(temp[i] > 0)
//                     {
//                         tot[i] = temp[i] % 10;
//                         temp[i] /= 10;
//                     }
//                 }
//                 sum[i] = temp[i];
//             }
//             if(sum[i] % 2 == 0)
//             {
//                 System.out.print(sum[i]);
//             }
//             else{
//               char c = (char)('a' + sum[i] - 1);
//               System.out.print(c);   
//             }
//         }
//     }
// }

/** Another Way **/

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt(); // Number of integers
//         int a[] = new int[n];

//         // Input the array
//         for (int i = 0; i < n; i++) {
//             a[i] = sc.nextInt();
//         }

//         for (int i = 0; i < n; i++) {
//             int num = a[i];

//             // Reduce the number to its digital root
//             while (num >= 10) {
//                 int digitSum = 0;
//                 while (num > 0) {
//                     digitSum += num % 10; // Sum the digits
//                     num /= 10;
//                 }
//                 num = digitSum;
//             }

//             // Output based on whether the digital root is even or odd
//             if (num % 2 == 0) {
//                 System.out.print(num); // Print the number if it's even
//             } else {
//                 char c = (char) ('a' + num - 1); // Map odd number to a letter
//                 System.out.print(c);
//             }
//         }
//     }
// }

/** Toggle n+1 from Bit Manipulation **/

// import java.util.*;

// public class Main {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int num = sc.nextInt();
//         int n = sc.nextInt();

//         int mask = 1 << n;
//         int res = num ^ mask;

//         System.out.println(res);
//     }
// }

/** Bit Manipulation Problem 4 digit left and right shift **/

// import java.util.*;

// public class Main {

//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         int num = sc.nextInt();

//         int left = ( num & 0xF0 ) >> 4;
//         int rig = ( num & 0xF0 ) << 4;

//         int res = left | rig ;

//         System.out.print(left);
//     }
// }

/*** Spiral rotation ***/

// public class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int m = sc.nextInt();

//         int mat[][] = new int[n][m];
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<n;j++)
//             {
//                 mat[i][j] = sc.nextInt();
//             }
//         }

//         int top = 0, left = 0, bot = n - 1, rig = m - 1 ;
//         while(top <= bot && left <= rig)
//         {
//             for(int i = top; i<= bot; i++)
//             {
//                 System.out.print(mat[i][left] + " ");
//             }
//             left++;

//             for(int i= left ; i <= rig; i++)
//             {
//                 System.out.print(mat[bot][i] + " ");
//             }
//             bot--;

//             if(top <= bot)
//             {
//                 for(int i=bot;i>=top;i--)
//                 {
//                     System.out.print(mat[i][rig] + " ");
//                 }
//                 rig--;
//             }
//             if(left <= rig)
//             {
//                 for(int i=rig;i>=left;i--)
//                 {
//                     System.out.print(mat[top][i] + " ");
//                 }
//                 top++;
//             }
//         }

//     }
// }

/** Matrix Rotation **/

// import java.util.*;

// public class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int m = sc.nextInt();
         
//         if(n != m)
//         {
//             System.out.println("Invalid Inputs");
//             return;
//         }

//         int mat[][] = new int[n][m];
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<m;j++)
//             {
//                 mat[i][j] = sc.nextInt();
//             }
//         }

//         //transpose
//         for(int i=0;i<n;i++)
//         {
//             for(int j=i;j<n;j++)
//             {
//                 int temp = mat[i][j];
//                 mat[i][j] = mat[j][i];
//                 mat[j][i] = temp;
//             }
//         }

//         //Reverse
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<n/2;j++)
//             {
//                 int temp = mat[i][j];
//                 mat[i][j] = mat[i][n-j-1];
//                 mat[i][n-j-1] =temp;
//             }
//         }

//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<n;j++)
//             {
//                 System.out.print(mat[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

/** Add token and every fourth character replaced by underscore [Error in code] **/

// import java.util.*;

// public class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         String s = sc.nextLine();
//         // sc.nextLine();

//         String res = "";
//         for(int i = s.length()-1 ; i >=0; i--)
//         {
//             res += s.charAt(i);
//         }
//         System.out.println(res);

//         String token = "cmdfg7l32";
//         String sen = res + token;

//         System.out.print(sen);
//         String result = "";

//         for(int i=0;i<sen.length();i++)
//         {
//             result += sen.charAt(i);

//             if((i+1) % 4 == 0)
//             {
//                 result = "_" ;
//             }
//         }
//         System.out.print(result);
//     }
// }

/** Not working in portal  **/

// import java.util.*;
// import javax.script.ScriptEngine;
// import javax.script.ScriptEngineManager;

// public class Main
// {
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);

//               String input = sc.nextLine();
//               input = input.replaceAll("(\\d)\\(", "$1*(");

//               try{
//                      ScriptEngine eng = new ScriptEngineManager().getEngineByName("JavaScript");
//                      Object res = eng.eval(input);

//                      System.out.print(res);
//               }
//               catch(Exception e){
//                      System.out.print("Invalid");
//               }
//        }
// }

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Accepting the whole input as a single line
//         System.out.println("Enter the input:");
//         String input = sc.nextLine();

//         // Splitting the input into parts
//         String[] parts = input.split(";");

//         // Extract and display characters
//         System.out.println("Characters");
//         for (String part : parts) {
//             if (part.trim().startsWith("char")) {
//                 String[] variables = part.trim().substring(4).split(",");
//                 for (int i = 0; i < variables.length; i++) {
//                     String var = variables[i].trim();
//                     String[] varValue = var.split("=");
//                     String varName = varValue[0].trim();
//                     String varVal = (varValue.length > 1) ? varValue[1].trim() : "junk";
//                     System.out.println(varName + " = " + varVal + (i < variables.length - 1 ? "" : ""));
//                 }
//             }
//         }

//         // Extract and display integers
//         System.out.println("Integers");
//         for (String part : parts) {
//             if (part.trim().startsWith("int")) {
//                 String[] variables = part.trim().substring(3).split(",");
//                 for (int i = 0; i < variables.length; i++) {
//                     String var = variables[i].trim();
//                     String[] varValue = var.split("=");
//                     String varName = varValue[0].trim();
//                     String varVal = (varValue.length > 1) ? varValue[1].trim() : "junk";
//                     System.out.print(varName + " = " + varVal);
//                     if (i < variables.length - 1) {
//                         System.out.print(",");
//                     }
//                     System.out.println(); // Print a newline at the end of each variable
//                 }
//             }
//         }
//     }
// }

/** Integer to Roman EG: Input 3(size) 34 45 1 Result: ..  **/

// import java.util.*;

// public class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int a[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
//         String r[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

//         int n = sc.nextInt();
//         for(int i=0;i<n;i++)
//         {
//             int num = sc.nextInt();

//             if(num>1000)
//             {
//                 System.out.println("Invalid");
//             }
//             int j = 0;
//             StringBuilder sb = new StringBuilder();
//             while(num>0)
//             {
//                 if(num>=a[j])
//                 {
//                     sb.append(r[j]);
//                     num -= a[j];
//                 }
//                 else
//                 j++;
//             }
//             System.out.println("Answer:" + sb);
//         }
//     }
// }

/*** Reverse add Ma and increment a ***/

// import java.util.*;

// public class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc =  new Scanner(System.in);
//         String s = sc.nextLine();
//         String words[] = s.split(" ");
//         String res = "";
        
//         for(int i=0;i<words.length;i++)
//         {
//             String word = words[i];
//             String rev = "";

//             for(int j=word.length()-1;j>0;j--)
//             {
//                 rev += word.charAt(j);
//             }
//             rev += word.charAt(0);
//             rev += "ma" ;

//             for(int k=0;k<=i;k++)
//             {
//                 rev += "a";
//             }
//             res += rev + " ";
//         }
//         System.out.print(res);
//     }
// }

/** Input 1 abcdefghi bd Result: acefghi  . Remove character from second string **/

// import java.util.*;

// public class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         sc.nextLine();

//         for(int i=0;i<n;i++)
//         {
//             String s  = sc.nextLine();
//             String s1 = sc.nextLine();

//             StringBuilder sb = new StringBuilder();
//             for(int j=0;j<s.length();j++)
//             {
//                 char ch = s.charAt(j);


//             if(s1.indexOf(ch) == -1)
//             {
//                 sb.append(ch);
//             }
                
//         }
//         System.out.print(sb.toString());
//         }
//     }
// }

/** previous and next element sum max **/

// import java.util.*;

// public class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
        
//         int n = sc.nextInt();

//         int a[] = new int[n];

//         for(int i=0;i<n;i++)
//         {
//             a[i] = sc.nextInt();
//         }

//         int cur = 0;
//         int max = 0;

//         for(int i=0;i<n-1;i++)
//         {
            
//                     cur = a[i-1] + a[i+1];

//                     if(cur > max)
//                     {
//                         max = cur;
//                     }
//             }
       
//         System.out.print(max);
//     }
// }

/*** Given Expression convert to number after solving ***/

/** Sum of Digit **/

// import java.util.*;

// public class Main
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         int num = sc.nextInt();
    
//         while (num >= 10) {
//         int digitSum = 0;
//         while (num > 0) {
//             digitSum += num % 10; 
//             num /= 10;
//         }
        
//         num = digitSum;
//         }
            
//         System.out.print(num);
//     }
// }

/** Diamond space pattern **/
// import java.util.*;

// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of rows: ");
//         int rows = sc.nextInt();

//         for (int i = 1; i < rows; i++) {
//             for (int j = 1; j <= rows - i + 1; j++) {
//                 System.out.print("*");
//             }
//             for (int k = 1; k <= 2 * i - 2; k++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= rows - i + 1; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         for (int i = rows - 1; i >= 1; i--) {
//             for (int j = i; j <= rows; j++) {
//                 System.out.print("*");
//             }
//             for (int k = 1; k <= (2 * i) - 2; k++) {
//                 System.out.print(" ");
//             }
//             for (int j = i; j <= rows; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

/** Highest Frequency word **/

// import java.util.*;

// public class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String s = sc.nextLine();
//         String a[] = s.split(" ");

//         for(int i=0;i<a.length;i++)
//         {
//             if(a[i] == a[i+2])
//             {
//                 System.out.print(a[i]);
//                 break;
//             }
//         }
//     }
// }


/** Array List **/

// import java.util.*;

// public class Main {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         ArrayList<String> cart = new ArrayList<>();
//         int choice;

//         do {
//             System.out.println("\n============= Menu Card =============");
//             System.out.println("1. Add item");
//             System.out.println("2. Show all items");
//             System.out.println("3. Remove item");
//             System.out.println("4. Check if item is in cart");
//             System.out.println("5. Size of cart");
//             System.out.println("6. Exit\n========== Exit From Menu ==============");
//             System.out.println();
//             System.out.println("Enter your choice: ");

//             choice = sc.nextInt();
//             sc.nextLine(); 
//             switch (choice) {
//                 case 1:
//                     System.out.println("Enter the item name to add: ");
//                     String item = sc.nextLine();
//                     cart.add(item);
//                     System.out.println(item + " added to the cart.");
//                     System.out.println();
//                     break;

//                 case 2:

//                     System.out.println("Items in the cart: ");
//                     if (cart.isEmpty()) {
//                         System.out.println("Cart is empty.\n");
//                     } else {
//                         for (String cartItem : cart) {
//                             System.out.println(cartItem);
//                         }
//                     }
//                     break;

//                 case 3:
//                     System.out.println("Enter the item name to remove: ");
//                     String removeItem = sc.nextLine();
//                     if (cart.remove(removeItem)) {
//                         System.out.println(removeItem + " removed from the cart.");
//                         System.out.println();
//                     } 
//                     else {
//                         System.out.println("Item not found in the cart.");
//                         System.out.println();
//                     }
//                     break;

//                 case 4:
//                     System.out.println("Enter the item name to check: ");
//                     String checkItem = sc.nextLine();
//                     if (cart.contains(checkItem)) {
//                         System.out.println(checkItem + " is in the cart.\n");
//                     }
//                      else {
//                         System.out.println(checkItem + " is not in the cart.\n");
//                     }
//                     break;

//                 case 5:
//                     System.out.println("Size of the cart: " + cart.size());
//                     System.out.println();
//                     break;

//                 case 6:
//                     System.out.println("\nThank you!!");
//                     break;

//                 default:
//                     System.out.println("Invalid choice");
//             }
//         } while (choice != 6);
//     }
// }

/*** Check first and last character is vowel and 2D array use below queries to check from change and count.

Input
["aba","bcb","ee","a"]
[[0,1],[2,3],[1,1]]

Output:
[1, 2, 0]

Explanation: [0,1] is "aba", "bcb" . From this only "aba" have vowels in start and end so count 1
[2,3] is "ee", "a". From this "ee" and "a" is satisfied start and end has vowels so count 2
[1,1] is "bcb" only . From this not satisfied so count 0

****/


// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Reading the strings array
//         String input = sc.nextLine(); // Input in format ["aba","acd","ee"]
//         input = input.replace("[", "").replace("]", "").replace("\"", "");
//         String[] str = input.split(",");

//         // Reading the queries array
//         String Quer = sc.nextLine(); // Input in format [[1,2][0,2]] or [[1,2],[0,2]]
//         Quer = Quer.replace("[[", "").replace("]]", "").replace("][", "],[");
//         String[] QPair = Quer.split("\\],\\[");

//         int[] result = new int[QPair.length]; // Result array to store counts

//         // Set of vowels for checking
//         String vowels = "AEIOUaeiou";

//         for (int i = 0; i < QPair.length; i++) {
//             String[] range = QPair[i].split(",");
//             int start = Integer.parseInt(range[0]);
//             int end = Integer.parseInt(range[1]);
//             int count = 0;

//             for (int j = start; j <= end; j++) {
//                 String str1 = str[j];
//                 char first = str1.charAt(0);
//                 char last = str1.charAt(str1.length() - 1);

//                 if (vowels.contains(String.valueOf(first)) && vowels.contains(String.valueOf(last))) {
//                     count++;
//                 }
//             }
//             result[i] = count;
//         }

//         // Print the results
//         System.out.print("[");
//         for (int i = 0; i < result.length; i++) {
//             System.out.print(result[i]);
//             if (i < result.length - 1) {
//                 System.out.print(", ");
//             }
//         }
//         System.out.print("]");
//     }
// }

/** Outer Diamond Pattern **/

// import java.util.*;

// public class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         for(int i=1;i<=n;i++)
//         {
//             for(int j=0;j<n-i;j++)
//             {
//                 System.out.print(" ");
//             }

//             for(int k=0;k<2*(i)-1;k++)
//             {
//                 if(k == 0 || k == 2 * (i)-2) 
//                 {
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
        
//         for(int i=n-1;i>0;i--)
//         {
//             for(int j=0;j<n-i;j++)
//             {
//                 System.out.print(" ");
//             }

//             for(int k=0;k<2*(i)-1;k++)
//             {
//                 if(k == 0 || k == 2 * (i)-2) 
//                 {
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// QUESTIONS: 

// 1. Create a ArraylIst of Integers add 5 members print them.
// 2. Given an arrayList of Integer . find and print the max and minimum num
// 3. whether number is present or not
// 4. Given an Integer arraylist remove all even numbers and print remaining elements
// 5. Create a string arraylist add 5 names and sort them alphabetic reverseOrder
// 6. Program to merge two integer array list in a single list.
// 7. implement a function that reverse a elements integer without build in
// 8. create a arraylist find and remove the duplicate element
// 9. find second larges in integers array list
// 10. rotate the integer list by k position to the right

// import java.util.*;

// public class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
        
//         //1. cl
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(10);
//         list.add(23);
//         list.add(30);
//         list.add(40);
//         list.add(55);
//         System.out.println("ArrayList: " + list);

//         //2. 
//         int max = Collections.max(list);
//         int min = Collections.min(list);
//         System.out.println("Max: " + max + ", Min: " + min);

//         // 3.
//         int s = 30;
//         System.out.println(list.contains(s));

//         // 4.
//         for (int i = list.size() - 1; i >= 0; i--) {
//             if (list.get(i) % 2 != 0) {
//                 list.remove(i);
//             }
//         }
//         System.out.println("After removing evens: " + list);

//         // 5.
//         ArrayList<String> nam = new ArrayList<>();
//         nam.add("John");
//         nam.add("Ram");
//         nam.add("Hari");
//         nam.add("Loki");
//         nam.add("Bella");
//         nam.sort(Collections.reverseOrder());
//         System.out.println("Sorted Names in Reverse: " + nam);

//         // 6. 
//         ArrayList<Integer> lt1 = new ArrayList<>();
//         lt1.add(1);
//         lt1.add(10);
//         lt1.add(100);
//         list.addAll(lt1);
//         System.out.println("Merged: " + list);

//         // 7. 
//         for (int i = 0, j = list.size() - 1; i < j; i++, j--) {
//             int temp = list.get(i);
//             list.set(i, list.get(j));
//             list.set(j, temp);
//         }
//         System.out.println("Reversed List: " + list);

//         // 8.
//         Set<Integer> set = new HashSet<>(list);
//         list.clear();
//         list.addAll(set);
//         System.out.println("List after removing duplicates: " + list);

//         // 9. 
//         Collections.sort(list, Collections.reverseOrder());
//         if (list.size() > 1) {
//             System.out.println("Second Largest: " + list.get(1));
//         } else {
//             System.out.println("Second Largest not found");
//         }

//         // 10.
//         int k = 2;
//         Collections.rotate(list, k);
//         System.out.println("Rotated: " + list);
//     }
// }


/** Swap  Continuous occurring number

Input
1234567
Result
2143657

Input2
32456789
Result
23547698 **/

// import java.util.*;

// public class Main {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String s = sc.next();
//         char c[] = s.toCharArray();

//         int i = 0;
//         while(i+1 < c.length)
//         {
//             char temp = c[i];
//             c[i] = c[i+1];
//             c[i+1] = temp;

//             i+=2;
//         }
//         System.out.println(new String(c));
//     }
// }

/** Remove second occurred characters **/

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         char[] c = s.toCharArray();
//         int[] count = new int[256]; 

//         for (int i = 0; i < c.length; i++) {
//             count[c[i]]++;
//             if (count[c[i]] < 2) { // Skip the second occurrence
//                 System.out.print(c[i]);
//             }
//         }    
//     }
// }

/** A number divisible by various number. Input : 15 45 60 5 30 Result: 5 **/

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Read input size and elements
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         for (int i = 0; i < n; i++) {
//             boolean isDivisibleByAll = true;
//             for (int j = 0; j < n; j++) {
//                 if (i != j && arr[j] % arr[i] != 0) {
//                     isDivisibleByAll = false;
//                     break;
//                 }
//             }
//             if (isDivisibleByAll) {
//                 System.out.println(arr[i]);
//                 return; 
//             }
//         }
//         System.out.println(0);
//     }
// }

/** Z Pattern **/

// import java.util.*;

// public class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<n;j++)
//             {
//                 if( i == 0 || i == n - 1 || j == n - i - 1)
//                 {
//                     System.out.print("*");
//                 }
//                 else
//                 {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

/*** X Pattern ***/

// import java.util.*;

// public class Main {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<n;j++)
//             {
//                 if(i==j || i + j == n - 1)
//                 {
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class Main {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int num = 1;

//         for(int i = 1; i <= n; i++)
//         {
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print(num + " ");
//                 num++;
//             }

//             for(int k=1; k<= 2*(n - i);k++)
//             {
//                 System.out.print("  ");
//             }

//             for(int l=1;l<=i;l++)
//             {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }

//     }
// }

// /***  Find number of ways in which you can add up to number  **/

// import java.util.*;

// public class Main
// {
//   public static void main(String[] args)
//   {
//     Scanner sc = new Scanner(System.in);
    
//     int n = 5;
//     int a[] = new int[n+1];
    
//     a[0] = 1;
    
//     for(int i=1;i<=n;i++)
//     {
//       for(int j=i;j<=n;j++)
//       {
//         a[j] += a[j - i];
//       }
//     }
    
//     System.out.print(a[n]);
//   }
// }

/** Replace max number Input : 4
1 2 3 4
4 4 4 -1
**/

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);

//               int n = sc.nextInt();
//               int a[] = new int[n];

//               for(int i=0;i<n;i++)
//               {
//                      a[i] = sc.nextInt();
//               }
//               int res[] = new int[n];
//               for(int i=0;i<n;i++)
//               {
//                      for(int j=i+1;j<n;j++)
//                      {
//                             if(a[i] < a[j])
//                             {
//                                    a[i] = a[j]; 
//                             }
//                      }
//               }
//               System.out.println("Modified Array is :");
//               for(int i = 0 ; i < n-1 ; i++)
//               {
//                      System.out.print(a[i] + " ");
//               }
              
//               System.out.println("-1");
//        }
// }

/* Count number of ways */

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);

//               int n = sc.nextInt();
//               int a[] = new int[n+1];

//               a[0] = 1;

//               for(int i=1;i<=n;i++)
//               {
//                      for(int j=i;j<=n;j++)
//                      {
//                             a[j] += a[j - i];
//                      }
//               }
//               System.out.print(a[n]);
//        }
// }

/* Diagonal Box Pattern Inside X */

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);

//               int n = sc.nextInt();

//               for(int i=0;i<n;i++)
//               {
//                      for(int j=;j<n;j++)
//                      {
//                             if( i == 0 || j == 0 || i == n - 1 || j == n - 1)
//                             {
//                                    System.out.print("X ");
//                             }
//                             else
//                             {
//                                    System.out.print("0 ");
//                             }
//                      }
//                      System.out.println();
//               }
//        }
// }

/** max difference in a array print that numbers [try second method] **/

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);

//               int n = sc.nextInt();
//               int a[] = new int[n];
//               for(int i=0;i<n;i++)
//               {
//                      a[i] = sc.nextInt();
//               }

//               int maxD = 0, f = 0, l = 0;

//               for(int i=0;i<n;i++)
//               {
//                      for(int j=n-1;j>i;j--)
//                      {
//                             int diff = a[j] - a[i];

//                             if(diff > maxD)
//                             {
//                                    maxD = diff;
//                                    f = a[i];
//                                    l = a[j]; 
//                             }
//                      }
//               }
//               System.out.print(f + "," + l);
//        }
// }

/** Another Way comparing Max Difference in an array **/

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a[] = new int[n];

//         for (int i = 0; i < n; i++) {
//             a[i] = sc.nextInt();
//         }

//         int maxD = Integer.MIN_VALUE, f = 0, l = 0;
//         int j = n - 1; // Start from the last index

//         for (int i = 0; i < n / 2; i++) {
//             int diff = Math.abs(a[i] - a[j]); // Compare first and last, second and second last, etc.

//             if (Math.abs(diff) > maxD) { // Ensure we track the highest absolute difference
//                 maxD = Math.abs(diff);
//                 f = a[i];
//                 l = a[j];
//             }
//             j--; // Move j separately
//         }

//         System.out.print(f + "," + l);
//     }
// }

/** Swap words Input: Hello, jii Result: jii Hello, **/

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);

//               String s = sc.nextLine();
//               String s1[] = s.split(" ");

//               for(int i=0;i<s1.length-1;i+=2)
//               {
//                      String temp = s1[i];
//                      s1[i] = s1[i+1];
//                      s1[i+1] = temp;
//               }
//               for(int i=0;i<s1.length;i++)
//               {
//                      System.out.print(s1[i] + " ");
//               }
//        }
// }

// import java.util.*;

// public class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         String a[] = s.split(" ");

//         for(int i=0;i<a.length;i+=2)
//         {
//             String temp = a[i];
//             a[i] = a[i+1];
//             a[i+1] = temp;
//         }
//         for(int i=0;i<a.length;i++)
//         {
//             System.out.print(a[i] + " ");
//         }
//     }
// }

/** Print max difference given numbers compare and difference by first and last way 
 Input:5
 43 434 43 4554 34 54 
 43,4554
**/

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int a[] = new int[n];

//         for (int i = 0; i < n; i++) {
//             a[i] = sc.nextInt();
//         }

//         int maxD = Integer.MIN_VALUE, first = 0, last = 0;
//         int j = n - 1;

//         for (int i = 0; i < n / 2; i++) {
//             int diff = Math.abs(a[i] - a[j]);

//             if (diff > maxD) {
//                 maxD = diff;
//                 first = a[i];
//                 last = a[j];
//             }
//             j--;
//         }

//         System.out.print(first + "," + last);
//     }
// }

// import java.util.*;
// public class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int a[] = new int[n];
//         for(int i=0;i<n;i++)
//         {
//             a[i] = sc.nextInt();
//         }

//         int max = Integer.MIN_VALUE, f = 0, l = 0, j = n - 1;
//         for(int i=0;i<n/2;i++)
//         {
//             int curr = a[i] - a[j];
//             if(Math.abs(curr) > max)
//             {
//                 max = curr;
//                 f = a[i];
//                 l = a[j];
//             }
//             j--;
//         }
//         System.out.println(f + "," + l);
//     }
// }

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.next();
        
//         // Array to store frequency of each character (for 'a' to 'z')
//         int[] freq = new int[26];
        
//         // Count frequency of each character
//         for (int i = 0; i < s.length(); i++) {
//             freq[s.charAt(i) - 'a']++;
//         }

//         // StringBuilder to store the result
//         StringBuilder result = new StringBuilder();

//         // Loop through the frequency array to build the result string in descending order of frequency
//         for (int i = 25; i >= 0; i--) { // Start from 'z' to 'a' for descending order
//             if (freq[i] > 0) {
//                 result.append((char) ('a' + i)); // Add character
//                 result.append(Integer.toHexString(freq[i])); // Add frequency in hex
//             }
//         }

//         // Convert the result to a string and store it
//         String output = result.toString();

//         // Sort the result string based on hex values in descending order
//         // This step ensures the hex representation is sorted correctly
//         char[] arr = output.toCharArray();
//         for (int i = 0; i < arr.length - 2; i += 2) {
//             for (int j = i + 2; j < arr.length; j += 2) {
//                 if (arr[i] < arr[j]) {
//                     char temp1 = arr[i], temp2 = arr[i + 1];
//                     arr[i] = arr[j];
//                     arr[i + 1] = arr[j + 1];
//                     arr[j] = temp1;
//                     arr[j + 1] = temp2;
//                 }
//             }
//         }

//         // Print the sorted result
//         System.out.println(new String(arr));
//     }
// }

// import java.util.*;

// public class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         String s = sc.nextLine();
//         int lastcol = s.lastIndexOf(":");

//         if(lastcol != -1 && lastcol >= 2)
//         {
//             System.out.print(s.substring(lastcol-2 , lastcol));
//         }
//         else
//         {
//             System.out.println("Invalid");
//         }
//     }
// }

/** Print secs in a string Input: i woke at 6:30:00: on every saturday Result: 00 **/

// import java.util.*;

// public class Main{
//     public static void main(String[] args)
//     {
//         Scanner cs = new Scanner(System.in);
//         String s = cs.nextLine();

//         int lastcol = s.lastIndexOf(":");
//         if(lastcol != -1 && lastcol >=2)
//         {
//             System.out.println(s.substring(lastcol-2, lastcol));
//         }
//         else{
//             System.out.println("Invalid");
//         }
//     }
// }

// import java.util.*;
// public class Main {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String s = sc.nextLine().trim();
//         System.out.println(s.replaceFirst("^0+", " ").trim());
//     }
// }

/** Remove starting zeros **/

// import java.util.*;

// public class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         String n = sc.nextLine();
//         System.out.println(n.replaceFirst("^0+" , ""));
//     }
// }

/** B15 Output: 101100010101 */

// import java.util.*;

// public class Main {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String s = sc.nextLine();
//         String res = "";

//         for(int i=0;i<s.length();i++)
//         {
//             char c = s.charAt(i);

//             int value = Character.digit(c, 16);

//             res += String.format("%4s", Integer.toBinaryString(value)).replace(' ', '0');
//         }
//         System.out.print(res);
//     }
// }

// import java.util.*;
// public class Main{
//      public static void main(String[] args)
//      {
//         Scanner sc = new Scanner(System.in);

//         String s = sc.nextLine();
//         String res = "";
//         for(int i=0;i<s.length();i++)
//         {
//             char c = s.charAt(i);

//             int val = Character.digit(c, 16);

//             res += String.format("%4s", Integer.toBinaryString(val)).replace(' ', '0');
//         }

//         System.out.println(res);
//      }

// }

// QUESTIONS:

// 1. Given an integer array find and print all duplicate using HashSet
// 2. Given two array find union and intersection using HashSer
// 3. Find the first repeating element
// 4. Find missing element in an array
// 5. Check if a array is a subset of another array
// 6. Find pairs with given sum . Array and k is given find whose sum is equal to k
// 7. Find longest Continuous sequence 
// 8. Remove duplicate from string
// 9. Find comman elements in three sorted array

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // 1. 
//         int n = sc.nextInt();
//         int[] a = new int[n];
//         for (int i = 0; i < n; i++){
//              a[i] = sc.nextInt();
//         }

//         HashSet<Integer> st1 = new HashSet<>();
        
//         for (int i = 0; i < n; i++) {
//             if (!st1.add(a[i])) 
//             {
//                 System.out.print(a[i] + " ");  
//             }
           
//         }
//         System.out.println();

//         // 2. 
//         int m = sc.nextInt();
//         int[] b = new int[m];
//         for (int i = 0; i < m; i++) 
//         {
//             b[i] = sc.nextInt();
//         }

//         HashSet<Integer> uni = new HashSet<>();
//         HashSet<Integer> inter = new HashSet<>();
//         for (int i = 0; i < n; i++)
//         { 
//             uni.add(a[i]);
//         }
//         for (int i = 0; i < m; i++) {
//             if (!uni.add(b[i])) 
//             {
//                 inter.add(b[i]);
//             }
//         }
//         System.out.println("Union: " + uni);
//         System.out.println("Intersection: " + inter);

//         // 3. 
//         HashSet<Integer> st2 = new HashSet<>();
//         for (int i = 0; i < n; i++) {
//             if (!st2.add(a[i])) {
//                 System.out.println("First Repeating Element: " + a[i]);
//                 break;
//             }
//         }

//         // 4. 
//         int total = 0;
//         for (int i = 0; i < n; i++)
//         { 
//             total -= a[i];
//         }
//         System.out.println("Missing Element: " + -total);

//         // 5.
//         HashSet<Integer> st3 = new HashSet<>();
//         for (int i = 0; i < n; i++) st3.add(a[i]);
//         boolean isSubset = true;
//         for (int i = 0; i < m; i++) {
//             if (!st3.contains(b[i])) {
//                 isSubset = false;
//                 break;
//             }
//         }
//         System.out.println(isSubset ? "Is a Subset" : "Not a Subset");

//         // 6. 
//         int k = sc.nextInt();
//         HashSet<Integer> st4 = new HashSet<>();
//         System.out.print("Pairs with sum " + k + ": ");
//         for (int i = 0; i < n; i++) {
//             if (st4.contains(k - a[i]))
//             {
//                 System.out.print("(" + a[i] + ", " + (k - a[i]) + ") ");
//             } 
//             st4.add(a[i]);
//         }
//         System.out.println();

//         // 7. 
//         HashSet<Integer> st5 = new HashSet<>();
//         for (int i = 0; i < n; i++)
//         {
//             st5.add(a[i]);
//         }
//         int longest = 0;
//         for (int i = 0; i < n; i++) {
//             if (!st5.contains(a[i] - 1)) {
//                 int count = 1, num = a[i];
//                 while (st5.contains(num + count)) count++;
//                 if (count > longest)
//                 {
//                      longest = count;
//                 }
//             }
//         }
//         System.out.println("Longest Continuous Sequence Length: " + longest);

//         // 8. 
//         String str = sc.next();
//         HashSet<Character> set6 = new HashSet<>();
//         StringBuilder sb = new StringBuilder();
//         for (int i = 0; i < str.length(); i++) {
//             if (set6.add(str.charAt(i))) 
//             {
//                  sb.append(str.charAt(i));
//             }
//         }
//         System.out.println("String after removing duplicates: " + sb);

//         int o = sc.nextInt();
//         int c[] = new int[o];
//         for(int i=0;i<o;i++)
//         {
//             c[i] = sc.nextInt();
//         }    
//     }
// }

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String s = sc.nextLine();
//         String ss = sc.nextLine();
//         String s1 = sc.nextLine();

//         // Replace the entire substring `ss` in `s` with a single space
//         String mod = s.replaceFirst("\\b" + ss + "\\b", "").replaceAll("\\s+", " ").trim();

//         // Compare the modified string with s1
//         if (s1.equals(mod)) {
//             System.err.println("true");
//         } else {
//             System.out.println("false");
//         }
//     }
// }

/** INPUT:
[20,40,30,10,50]
[2,4,5,1,3]
RESULT:
10, 20, 50, 40, 30**/

// import java.util.*;

// public class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
        
//         String s = sc.nextLine().replace("[","").replace("]", "");
//         String s1 = sc.nextLine().replace("[","").replace("]", "");

//         String c[] = s.split(",");
//         String c1[] = s1.split(",");
//         int n = c.length;

//         int a[] = new int[n];
//         int b[] = new int[n];

//         for(int i=0;i<n;i++)
//         {
//             a[i] = Integer.parseInt(c[i].trim());
//             b[i] = Integer.parseInt(c1[i].trim());
//         }

//         for(int i=0;i<n-1;i++)
//         {
//             for(int j=i+1;j<n;j++)
//             {
//                 if(b[i] > b[j])
//                 {
//                     int temp = a[i]; int temp1 = b[i];
//                     a[i] = a[j]; b[i] = b[j];
//                     a[j] = temp; b[j] = temp1;
//                 }

//             }
//         }
//         System.out.println(Arrays.toString(a).replace("[","").replace("]","").trim());
//     }
// }

/** Input :
 I am a good boy
 good
 I am a boy 
 Result: True **/

// import java.util.*;

// public class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         String s = sc.nextLine();
//         String s1 = sc.nextLine();
//         String s2 = sc.nextLine();

//         String c[] = s.split(" ");
//         StringBuilder res = new StringBuilder();
//         boolean rem = false;
//         for(String word : c)
//         {
//             if(!rem && word.equals(s1))
//             {
//                 rem = true;
//                 continue;
//             }
//             res.append(word).append(" ");
//         }
//         String mod = res.toString().trim();

//         if(s2.equals(mod))
//         {
//             System.out.println("TRUE");
//         }
//         else
//         {
//             System.out.println("FALSE");
//         }
//     }
// }

// import java.util.*;

// public class Main {
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);
//               int n = sc.nextInt();

//               boolean isp = true;
//               if(n<2)
//               {
//                      isp = false;
//               }

//               for(int i=2;i*i<=n;i++)
//               {
//                      if(n % i == 0)
//                      {
//                             isp = false;
//                             break;
//                      }
//               }
              
//               if(isp)
//               {
//                      System.out.print("true");
//               }
//               else
//               {
//                      System.out.print("false;");
//               }
//        }
// }

/** Prime Number check. If prime find previous and next and sum divide by 2 is less than prime means true or false **/

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);
//               int n = sc.nextInt();

//               boolean isp = true;
//               if(n < 2)
//               {
//                      isp = false;
//               }
//               for(int i=2;i*i <= n ; i++)
//               {
//                      if(n % i == 0)
//                      {
//                             isp = false;
//                             break;
//                      }
//               }

//               if(!isp)
//               {
//                      System.out.println("False");
//                      return;
//               }
//               int pre = n - 1, next = n + 1;
//               int sum = 0;
              
//               while(true)
//               {
//                      boolean pr = true;
//                      if(pre < 2)
//                      {
//                             pr = false;
//                      }
//                      for(int i=2;i*i <= pre;i++)
//                      {
//                             if(pre % i == 0)
//                             {
//                                    pr = false;
//                                    break;
//                             }
//                      }

//               if(pr) break;
//               pre--;
//               }

//               while(true)
//               {
//                      boolean pr = true;
//                      if(next < 2)
//                      {
//                             pr = false;
//                      }
//                      for(int j=2;j*j <= next;j++)
//                      {
//                             if(next % j == 0)
//                             {
//                                    pr = false;
//                                    break;
//                             }
//                      }
//                      if(pr) break; 
//                      next++;
//               }
//              sum = (pre + next) / 2;
             
//              if(sum < n)
//              {
//               System.out.println("true");
//              }
//              else
//              {
//               System.out.print("False");
//              }
//        }
// }

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);

//               int n = sc.nextInt();
//               String res = "";
//               int sum = 0;
//               for(int i=0;i<n;i++)
//               {
//                      String s = sc.next();

//                      for(int j=0;j<s.length();j++)
//                      {
//                             char c = s.charAt(i);

//                             if(c-'0' >= '0' && c- <= '9')
//                             {
//                                    res += c;
//                                    System.out.println(res);
//                             }
//                      }
//                      // sum += Integer.parseInt(res);
                     
//               }

//        }
// }


// import java.util.*;

// public class Main {
//     {
//         public static void main(String[] args)
//          {
//             Scanner sc = new Scanner(System.in);

//             int n = sc.nextInt();
//             String res = "";
//             for(int i=0;i<n;i++)
//             {
//                 String s = sc.next();

//                 for(int j=0;j<s.length();j++)
//                 {
//                     char c = s.charAt(j);

//                     if(c>='0' && c<='9')
//                     {
//                         res += c;
//                     }
//                 }
//             }
//         }
// }

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int num = 1, lastRowStart = 1;

//         // Upper Half
//         for (int i = 1; i <= n; i++) {
//             lastRowStart = num; // Store last row start value
//             int temp = num;
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(temp);
//                 if (j < i) System.out.print("*");
//                 temp++;
//             }
//             num = temp;
//             System.out.println();
//         }

//         // Middle Row (Repeat Last Row)
//         int temp = lastRowStart;
//         for (int i = 1; i <= n; i++) {
//             System.out.print(temp);
//             if (i < n) System.out.print("*");
//             temp++;
//         }
//         System.out.println();

//         // Lower Half (Reverse order)
//         for (int i = n - 1; i >= 1; i--) {
//             lastRowStart -= i; // Compute previous row start number
//             temp = lastRowStart;
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(temp);
//                 if (j < i) System.out.print("*");
//                 temp++;
//             }
//             System.out.println();
//         }
//     }
// }

/** Palindrome Input: ABBA Result: 2 **/

// import java.util.*;

// public class Main
// {
//        public static void main(String[] args) {
//               Scanner sc = new Scanner(System.in);

//               String s = sc.next();
//               int count = 0;
//               for(int i=0;i<s.length();i++)
//               {
//                      for(int j=i+1;j<s.length();j++)
//                      {
//                             String temp = s.substring(i, j+1);
//                             String rev = "";

//                             for(int k=temp.length()-1;k>=0;k--)
//                             {
//                                    rev += temp.charAt(k);
//                             }

//                             if(temp.equals(rev))
//                             {
//                                    count++;
//                             }
//                      }
//               } 
//               System.out.println(count);             
//        }
// }

/** INPUT: HELLO,2 RESULT:HELLO HELLO **/

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         String s = sc.next();
//         String s1[] = s.split(",");
        
//         String word = s1[0];
//         int n = Integer.parseInt(s1[1]);

//         if (n % 2 == 0) {
//             for (int i = 0; i < n; i++) {
//                 System.out.print(word + " ");
//             }
//         } else {
//             String rev = new StringBuilder(word).reverse().toString();
//             for (int i = 0; i < n; i++) {
//                 System.out.print(rev + " ");
//             }
//         }
//     }
// }

/** Valid Parenthesis **/

// import java.util.*;

// public class Main{
//        public static void main(String[] args) {
           
//               Scanner sc = new Scanner(System.in);
//               String s = sc.next();

//               Stack<Character> st = new Stack<>();
//               int i=0, n = s.length();

//               while(i<n)
//               {
//                      char c = s.charAt(i);
//                      if(c == '[' || c == '{' || c == '(')
//                      {
//                             st.push(c);
//                      }
//                      else
//                      {
//                             if(st.isEmpty() || (c == ']' && st.peek() != '[') || (c == '{' && st.peek() != '}') || (c == '(' && st.peek() != ')'))
//                             {
//                                    System.out.println("Invalid");
//                                    return;
//                             }
//                             st.pop();
//                      }
//                      i++;
//               }
//               if(st.isEmpty())
//               {
//                      System.out.println("Valid");
//               }
//               else
//               {
//                      System.err.println("Invalid");
//               }
//        }
// }

// import java.util.*;

// public class Main
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
        
//         int n = sc.nextInt();
        
//         int a[] = new int[n];
//         for(int i=0;i<n;i++)
//         {
//             a[i] = sc.nextInt();
//         }
        
//         for(int i=0;i<n-1;i++)
//         {
//             int min = i;
//             for(int j=i+1;j<n;j++)
//             {
//                 if(a[j] < a[min])
//                 {
//                     min = j;
//                 }
//             }
//             int t = a[min];
//             a[min] = a[i];
//             a[i] = t;
            
//             for(int k=0;k<n;k++)
//             {
//                 System.out.print(a[k] + " ");
//             }
//             System.out.println();
//         }
        
//         for(int i=0;i<n;i++)
//         {
//             System.out.print(a[i] + " ");
//         }
//     }
// }

/** SELECTION SORT  **/

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);

//               int n = sc.nextInt();
//               int a[] = new int[n];
//               for(int i=0;i<n;i++)
//               {
//                      a[i] = sc.nextInt();
//               }

//               for(int i=0;i<n-1;i++){
//                     int min = i;

//                      for(int j=i+1;j<n;j++)
//                      {
//                             if(a[j] < a[min])
//                             {
//                                    min = j;
//                             }
//                      }

//                             int temp = a[min];
//                             a[min] = a[i];
//                             a[i] = temp;

//                             for(int k=0;k<n;k++)
//                             {
//                                    System.out.print(a[k]+ " ");
//                             }
//                      System.out.println();
//               }
//               for(int i=0;i<n;i++)
//               {
//                      System.out.print(a[i] + " ");
//               }
//        }
// }

/* Searching with time complexity  */

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);
//               int n = sc.nextInt();
//               int a[] = new int[n];
//               for(int i=0;i<n;i++)
//               {
//                      a[i] = sc.nextInt();
//               }
//               int k = sc.nextInt();
//               int ind = -1;

//               for(int i=0;i<n;i++)
//               {
//                      if(a[i] == k)
//                      {
//                             ind = i;
//                      }
//               }
//               if(ind == -1)
//               {
//                      System.out.println("Element not present");
//               }
//               else
//               {
//                      System.out.println("Element found at " + ind);
//                      if(ind == 0)
//                      {
//                             System.out.println("Best Case");
//                      }
//                      else if(ind == n -1)
//                      {
//                             System.out.println("Worst Case");
//                      }
//                      else
//                      {
//                             System.out.println("Average Case");
//                      }
//               }

//        }
// }

/* Linear Search */

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);

//               int n = sc.nextInt();
//               int a[] = new int[n];
//               for(int i=0;i<n;i++)
//               {
//                      a[i] = sc.nextInt();
//               }
//               int k = sc.nextInt();
//               int low = 0 , high = n - 1, mid, com= 0;
//               boolean found = false;

//               while(low <= high)
//               {
//                      mid = (high  + low) / 2;
//                      com++;

//                      if(a[mid] == k)
//                      {
//                             System.out.println(k + " found at " + mid);
//                             System.out.println("Total comparsion " + com);
//                             found = true;
//                             break;
//                      }
//                      else if(a[mid] < k)
//                      {
//                             low = mid + 1;
//                      }
//                      else
//                      {
//                             high = mid - 1;
//                      }

//               }
//               if(!found)
//               {
//                      System.out.println("Not Found");
//                      System.out.println("Total comparison " + com);
//               }
//        }
// }

/** Count the numbers of strings, double and integer in a statement **/

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);

//               String s = sc.nextLine();
//               int numcnt = 0, wordcnt = 0, doucnt = 0;

//               String s1[]  = s.split(" ");
//               for(int i=0;i<s1.length;i++)
//               {
//                      String c = s1[i];
//                      char c1 = c.charAt(0);

//                      if(c.contains("."))
//                      {
//                             doucnt++;
//                      }
//                      else if((c1 >= 'A' && c1 <= 'Z') || (c1 >= 'a' && c1 <= 'z'))
//                      {
//                             wordcnt++;
//                      }
//                      else if(c1 >= '0' && c1 <= '9')
//                      {
//                             numcnt++;
//                      }
//               }
//               System.out.println("String: " + wordcnt);
//               System.out.println("Integer: " + numcnt);
//               System.out.println("Double: " + doucnt);
//        }
// }

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);

//               String s = sc.nextLine();
             
//                int last = s.lastIndexOf(":");
//                if(last != 0 && last >= 2)
//                {
//                      System.out.print(s.substring(last-2, last));
//                }   
//        }
// }



/*** FINISHED
 * Operator II
 * Funtions I
 * Functions III
 * Functions IV
 * Clause II
 * 
 * 
 */

//  import java.util.*;

//  public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);

//               int n = sc.nextInt();
//               int a[] = new int[n];

//               for(int i=0;i<n;i++)
//               {
//                      a[i] = sc.nextInt();
//               }

//               int max = Integer.MIN_VALUE;
//               int f=0,l=0,j=n-1;

//               for(int i=0;i<n/2;i++)
//               {
//                      int diff = Math.abs(a[i] - a[j]);

//                      if(Math.abs(diff) > max)
//                      {
//                             max = Math.abs(diff);
//                             f = a[i];
//                             l = a[j];
//                      }
//                      j--;
//               }
//               System.out.print(f + "," + l);
//        }
//  }

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);

//               String n = sc.nextLine();

//               System.out.println(n.replaceFirst("^0+",""));
//        }
// }

// import java.util.*;

// public class Main{
//        public static void main(String[] args) {
//               Scanner sc =  new Scanner(System.in);

//               int n = sc.nextInt();
//               int a[] = new int[n];

//               for(int i=0;i<n;i++)
//               {
//                      a[i]= sc.nextInt();
//               }

//               for(int i=0;i<n;i++)
//               {
//                      for(int j=0;j<a[i];j++)
//                      {
//                             System.out.print(Integer.toBinaryString(j) + " ");
//                      }
//                      System.out.println();
//               }
//        }
// }

/** Check decreasing by 2 **/

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);

//               String s = sc.nextLine();
//               String s1[] = s.split(",");

//               int a[] = new int[s1.length];
//               for(int i=0;i<s1.length;i++)
//               {
//                   a[i] = Integer.parseInt(s1[i]);
//               }

//               for(int i=0;i<s1.length-1;i++)
//               {
//                      if(a[i] - a[i+1] == 2 && a[i] > a[i+1])
//                      {
//                             System.out.println("YES");
//                             break;
//                      }
//                      else{
//                             System.out.println("NO");
//                             break;
//                      }
//               }

//        }
// }

/*  Diamond Pattern  */

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);

//               int n = sc.nextInt();
//               for(int i=1;i<=n;i++)
//               {
//                      for(int j=1;j<=n-i;j++)
//                      {
//                             System.out.print("  ");
//                      }
//                      for(int k=1;k<=2*i-1;k++)
//                      {
//                             System.out.print("* ");
//                      }
//                      System.out.println();
//               }
//               for(int i=n-1;i>=1;i--)
//               {
//                      for(int j=1;j<=n-i;j++)
//                      {
//                             System.out.print("  ");
//                      }
//                      for(int k=1;k<=2*i-1;k++)
//                      {
//                             System.out.print("* ");
//                      }
//                      System.out.println();
//               }
//        }
// }


/*** Pattern Hard ***/

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
        
//         int size = 2 * n - 1;
//         int[][] matrix = new int[size][size];
        
//         for (int i = 0; i < n; i++) {
//             for (int j = i; j < size - i; j++) {
//                 for (int k = i; k < size - i; k++) {
//                     matrix[j][k] = n - i;
//                 }
//             }
//         }
        
//         for (int i = 0; i < size; i++) {
//             for (int j = 0; j < size; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;

// public class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int m = 2 * n - 1;

//         int a[][] = new int[m][m];

//         for(int i=0;i<n;i++)
//         {
//             for(int j=i;j<m-i;j++)
//             {
//                 for(int k=i;k<m-i;k++)
//                 {
//                     a[j][k] = n - i;
//                 }
//             }
//         }
//         for(int i=0;i<m;i++)
//         {
//             for(int j=0;j<m;j++)
//             {
//                 System.out.print(a[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

/** ** Printing the pattern... **
    1
   1 1
  1 2 1  **/

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         sc.close();
        
//         System.out.println("** Printing the pattern... **");
        
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n - i - 1; j++) {
//                 System.out.print(" ");
//             }
//             int num = 1;
//             for (int j = 0; j <= i; j++) {
//                 System.out.print(num + " ");
//                 num = num * (i - j) / (j + 1);
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;

// public class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<n-i-1;j++)
//             {
//                 System.out.print(" ");
//             }

//             int num = 1;
//             for(int j=0;j<=i;j++)
//             {
//                 System.out.print(num + " ");
//                 num = num * (i-j) / (j+1);
//             }
//             System.out.println();
//         }
//     }
// }

/** Multi diamond Pattern **/

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
              
//         for (int i = 1; i <= n; i++) {
//             for (int j = 0; j < n - i; j++)
//             {
//                 System.out.print(" ");
//             }
            
//             for (int j = 0; j < i; j++)
//             {
//                 System.out.print("*");
//             }
            
//             System.out.print(" ");
            
//             for (int j = 0; j < i; j++)
//             {
//                 System.out.print((char) ('A' + i + j - 1));
//             }
//             System.out.println();
//         }
        
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < i; j++)
//             {
//                 System.out.print(" ");
//             }
            
//             for (int j = n; j > i; j--)
//             {
//                 System.out.print(j);
//             }
//             System.out.print(" ");
            
//             for (int j = 0; j < n - i; j++)
//             {
//                 System.out.print(2 * (n - (n - i) + j) + 1);
//             }
//             System.out.println();
//         }
//     }
// }

/** X Pattern Number **/

// import java.util.*;
// public class Main
// {
// 	public static void main(String[] args) {
// 		Scanner s = new Scanner(System.in);
// 		int n = s.nextInt();
		
// 		for(int i=1;i<=n;i++){
		    
// 		    for(int j=1;j<=i-1;j++){
// 		        System.out.print("  ");
// 		    }
// 		    System.out.print(i + " ");
// 		    int gap = (n-i)+(n-i-1);
// 		    for(int k=1;k<=gap;k++){
// 		        System.out.print("  ");
// 		    }
// 		    if(i!=n){
// 		        System.out.print(i + " ");
// 		    }
// 		    System.out.println();
// 		}
// 		for(int i=n-1;i>=1;i--){
		    
// 		    for(int j=1;j<=i-1;j++){
// 		        System.out.print("  ");
// 		    }
// 		    System.out.print(i + " ");
// 		    int gap = (n-i)+(n-i-1);
// 		    for(int k=1;k<=gap;k++){
// 		        System.out.print("  ");
// 		    }
// 		    if(i!=n){
// 		        System.out.print(i + " ");
// 		    }
// 		    System.out.println();
// 		}
// 	}
// }

/** X Pattern Another Way **/

// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j < i; j++) {
//                 System.out.print("  ");
//             }
//             System.out.print(i);
//             if (i != n) {
//                 for (int j = 1; j < 2 * (n - i); j++) {
//                     System.out.print("  ");
//                 }
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//         for (int i = n - 1; i >= 1; i--) {
//             for (int j = 1; j < i; j++) {
//                 System.out.print("  ");
//             }
//             System.out.print(i);
//             if (i != n) {
//                 for (int j = 1; j < 2 * (n - i); j++) {
//                     System.out.print("  ");
//                 }
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.next();
//         int sum = 0;
//         for (int i = 0; i < s.length(); i++) {
//             sum = sum * 26 + (s.charAt(i) - 'A' + 1);
//         }
//         System.out.println(sum);
//     }
// }

// import java.util.*;

// public class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i=1;i<=n;i++)
//         {
//             for(int j=1;j<=n-i;j++)
//             {
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=2*i-1;k++)
//             {
//                 System.out.print("a");
//             }
//             System.out.println();
//         }
//     }
//  }

// import java.util.*;

// public class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++)
//         {
//             for(int j=0;j<n-i;j++)
//             {
//                 System.out.print(" ");
//             }
//             for(int j=0;j<i;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.print(" ");

//             for(int j=0;j<i;j++)
//             {
//                 System.out.print((char) ('A' + i + j - 1));
//             }
//             System.out.println();
//         }


//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<i;j++)
//             {
//                 System.out.print(" ");
//             }

//             for(int j=n;j>i;j--)
//             {
//                 System.out.print(j);
//             }
//             System.out.print(" ");

//             for(int j=0;j<n-i;j++)
//             {
//                 System.out.print( (n - (n - i) + j) + 1 );
//             }
//             System.out.println();
//         }
//     }
// }

/** Krishna Candies **/

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);

//               int t = sc.nextInt();

//               for(int i=0;i<t;i++)
//               {
//                      int n = sc.nextInt();
//                      int a[] = new int[n];

                     
//                      for(int j=0;j<n;j++)
//                      {
//                             a[j] = sc.nextInt();
//                      }

//                      Arrays.sort(a);

//                      int sum = 0, res = 0;
//                      for(int j=0;j<n;j++)
//                      {
//                             sum += a[j];


//                             if(j>0)
//                             {
//                                    res += sum;
//                             }
//                      }
//                      System.out.println(res);
//               }
//        }
// }

// import java.util.*;

// public class Main{
//        public static void main(String[] args) {
//               Scanner sc = new Scanner(System.in);

//               int t = sc.nextInt();
//               for(int i=0;i<t;i++)
//               {
//                      int n = sc.nextInt();

//                      int a[] = new int[n];
//                      for(int j=0;j<n;j++)
//                      {
//                             a[j] = sc.nextInt();
//                      }
//                      int sum = 0, res = 0;
//                      Arrays.sort(a);

//                      for(int k=0;k<n;k++)
//                      {
//                             sum += a[k];

//                             if(k>0)
//                             {
//                                    res += sum;
//                             }
//                      }
//                      System.out.print(res);
//               }
//        }
// }

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt(); // Number of test cases
//         for (int i = 0; i < t; i++) {
//             int length = sc.nextInt();
//             int num = sc.nextInt();
//             char[] word = new char[length];

//             for (int j = length - 1; j >= 0; j--) {
//                 word[j] = (char) ('a' + (num % 26)); // Convert number to letter
//                 num /= 26;
//             }

//             System.out.println(new String(word));
//         }
//     }
// }

/** Binary Palindrome **/

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt(); // Read input number
        
//         while (true) {
//             num++; // Increment number to find the next palindrome
//             String binary = Integer.toBinaryString(num); // Convert to binary
//             String reverseBinary = new StringBuilder(binary).reverse().toString();
            
//             if (binary.equals(reverseBinary)) { // Check if binary is a palindrome
//                 System.out.println(num);
//                 break;
//             }
//         }
//     }
// }

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);

//               int num = sc.nextInt();
//               while(true)
//               {
//                      num++;
//                      String b = Integer.toBinaryString(num);
//                      String revB = new StringBuilder(b).reverse().toString();

//                      if(b.equals(revB))
//                      {
//                             System.out.println(num);
//                             break;
//                      }
//               }
//        }
// }

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);

//               String s = sc.nextLine();
//               char c[] = s.toCharArray();
//               int count[] = new int[256];

//               for(int i=0;i<c.length;i++)
//               {
//                      count[c[i]]++;

//                      if(count[c[i]] < 2)
//                      {
//                             System.out.print(c[i]);
//                      }
//               }
//        }
// }

/** Minimum Character Frequency Input: aabc Result: 0 **/

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.next();
//         int[] freq = new int[128];
//         int count = 0;

//         for (char c : s.toCharArray()) {
//             if (freq[c] > 0) count++;
//             freq[c]++;
//         }

//         System.out.println(count);
//         sc.close();
//     }
// }

// import java.util.*;

// public class Main{
//        public static void main(String[] args) {
//               Scanner sc = new Scanner(System.in);

//               String s = sc.next();
//               int f[] = new int[128];
//               int count  = 0;

//               for(char c : s.toCharArray())
//               {
//                      if(f[c] > 0)
//                      {
//                             count++;
//                      }
//                      f[c]++;
//               }
//               System.out.println(count);

//        }
// }

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         char[] c = s.toCharArray();  
//         Arrays.sort(c); 
//         System.out.println((c[c.length-1])); 
//     }
// }

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);
//               int n = sc.nextInt();
//               int sum = 0;
//               for(int t=0;t<n;t++)
//               {
//                     String s = sc.next();
//                     String res = "";
                    
//                     for(int i=0;i<s.length();i++)
//                     {
//                             char c = s.charAt(i);
//                             if(c >= '0' && c <= '9')
//                             {
//                                    res += c;
//                             }
//                             else
//                             {
//                                    if(!res.equals(""))
//                                    {
//                                           sum += Integer.parseInt(res);
//                                           res = "";
//                                    }
//                             }
//                      }
//               }
//               System.out.println(sum);
//        }
// }

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);
//               String s = sc.next();
//               char c = sc.next().charAt(0);

//               int co = 0;
//               boolean f = false;

//               for(int i=0;i<s.length();i++)
//               {
//                      if(s.charAt(i)  == c)
//                      {
//                             if(f)
//                             {
//                                     break;
//                             }
//                             else{
//                                    f = true;
//                             }
//                      }
//                      else if(f)
//                      {
//                             co++;
//                      }

//               }
//               System.out.println(co);
              
//        }
// }

// import java.util.*;

// public class Main
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
        
//         int n = sc.nextInt();
//         int a[] = new int[n];
        
//         for(int i=0;i<n;i++)
//         {
//             a[i] = sc.nextInt();
//         }
        
//         int min = 0;
//         int maxp = 0;
//         int sell = 0;
        
//         for(int i=0;i<n;i++)
//         {
//             if(a[i] - a[min] > maxp)
//             {
//                 maxp = a[i] - a[min];
//                 sell = i;
//             }
            
//             if(a[i] < a[min])
//             {
//                 min = i;
//             }
//         }
//         System.out.println("Day of buying : " + (min + 1 ));
//         System.out.println("Day of Selling : " + (sell + 1 ));
//     }
// }

/** Max Substring Vowel Count **/

// import java.util.*;

// public class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         String s = sc.nextLine();
//         int max = 0;
//         String temp = "";
//         int c = 0;
//         int c1 = 0;

//         for(int i=0;i<s.length();i++)
//         {
//             for(int j=i;j<s.length();j++)
//             {
//                 temp = s.substring(i, j+1);

//                 for(int k=0;k<temp.length();k++)
//                 {
//                     char ch = temp.charAt(k);

//                     if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
//                     {
//                         c++;
//                     }
//                 }
//                 if(c == temp.length())
//                 {
//                         c1++;
//                 }
//                 c=0;
//             }
//             if(c1 > max)
//             {
//                 max = c1;
//             }
//             c1 = 0;
            
//         }
//         System.out.println(max);
//     }
// }


// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);

//               int n = sc.nextInt();
//               sc.nextLine();
//               for(int i = 0 ;i < n ; i++)
//               {
//                      String s = sc.nextLine();
//                      String res = "";

//                      for(int j=0;j<s.length();j++)
//                      {
//                             char c = s.charAt(j);

//                             if(c >= '0' && c <= '9')
//                             {
//                                     res += c;
//                             }
//                             else{
//                                    if(!res.equals(""))
//                                    {
//                                           System.out.print(res + " ");
//                                           res = "";
//                                    }
//                             }
//                      }
//                      if(!res.equals(""))
//                      {
//                             System.out.print(res + " ");
                            
//                      }
//                      System.out.println();
//               }
//        }
// }

/*To see L2M2 P3 P4  , L2 Pattern L1,2 */

// import java.util.*;

// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);

//               int n = sc.nextInt();

//               for(int i=0;i<n;i++)
//               {
//                      int num = 1;
//                      char c = 'A';

//                      for(int j=n;j>i;j--)
//                      {
//                             if(i % 2 == 0)
//                             {
//                                    System.out.print(c++ + " ");
//                             }
//                             else
//                             {
//                                    System.out.print(num++ + " ");
//                             }
//                      }
//                      System.out.println();
//               }
//        }
// }

// import java.util.*;
// public class Main{
//        public static void main(String[] args)
//        {
//               Scanner sc = new Scanner(System.in);

//               int n = sc.nextInt();

//               int a[] = new int[n];
//               for(int i=1;i<=n;i++)
//               {
//                      for(int j=i-1;j<n;j+=i)
//                      {
//                             a[j] = 1 - a[j];
//                      }
//               }
//               int c = 0;
//               for(int i=0;i<n;i++)
//               {
//                      if(a[i] == 1)
//                      {
//                             c++;
//                             // break;
//                      }
//               }
//               System.out.println(c);
//        }
// }

// import java.util.*;

// public class Main{
//        public static void main(String[] args) {
//               Scanner sc = new Scanner(System.in);

//               String s = sc.nextLine();
//               String res = "No odd exists";

//               for(int i=s.length()-1;i>=0;i--)
//               {
//                      if((s.charAt(i) - '0') % 2 != 0)
//                      {
//                             res = s.substring(0, i+1);
//                             break;
//                      }
//               }
//               System.out.println(res);
//        }
// }


/** Anagram occurring start index **/

import java.util.*;

public class Main{
       public static void main(String[] args)
       {
              Scanner sc = new Scanner(System.in);

              String s = sc.nextLine();
              String s1 = sc.nextLine();

              int n = s.length();
              int m = s1.length();

              int a[] = new int[26];
              int b[] = new int[26];
              List<Integer> res = new ArrayList<>();
              for(int i=0;i<m;i++)
              {
                     a[s1.charAt(i) - 'a']++;
              }
              for(int i=0;i<n;i++)
              {
                     b[s.charAt(i) - 'a']++;

                     if(i >= m){
                            b[s.charAt(i-m) - 'a']--;
                     }

                     if(Arrays.equals(a,b))
                     {
                            res.add(i-m+1);
                     }
              }
              System.out.println(res);
       }
}
