import java.util.*;
class Array_Example
{
    static int i;
   // Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int a[]=new int[5];
        for(i=0;i<=4;i++)
        {
a[i]=sc.nextInt();
        }
        for(i=0;i<=4;i++)
        System.out.println(a[i]);
    }
}