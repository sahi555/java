import java.util.*;
class table
{
    public static void main(String a[])
    {

        Scanner s = new Scanner(System.in);
        System.out.println("enter i value");
        int n= s.nextInt();

        int i=0;
        for(i=0;i<=10;i++)
        System.out.println(n+"*"+i+"="+n*i);
    }
}