import java.util.*;
class arrayindex
{
    //int static target
    static int j;
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int b[] = new int[5];
       
int i=0;
        for (i=0; i<=4; i++)
        {
            b[i]=sc.nextInt();   
        }
        for (i=0; i<=4; i++)
        {
        System.out.println(b[i]);
        }
    for(i=0;i<=4;i++)
    {
        j=j+b[i];

        System.out.print(b[i]);
    }
    System.out.println("="+j);
   System.out.println(i);
}
}