import java.util.Scanner;
class addition{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter i value");
        int i=sc.nextInt();
        System.out.println("enter j value");
        int j=sc.nextInt();

        int result = i + j;
        System.out.println(result);
    }
}