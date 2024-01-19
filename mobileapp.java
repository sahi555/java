import java.util.*;
class mobileapp extends human
{
   
 
  void domath(int x,int y)
  {
    int result = x+y;
    //Scanner sc = new Scanner(System.in);
    //result =sc.nextInt();
    System.out.println(result);
  }  
  
   void playmusic()
  {
    boolean wifi=false;
    if(wifi == true)
    System.out.println("select the songs ");
    else 
    System.out.println("no network");
  }
 mobileapp()
{
    
    System.out.println("welcome");
    System.out.println("display time =" + 12);
    
        //return "no_power";
    
}
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
     int a=sc.nextInt();
    int b=sc.nextInt();
    mobileapp obj1 = new mobileapp();
    mobileapp obj2 = new mobileapp();
    //playmusic obj2 = new playmusic();
    obj1.playmusic();
    obj2.playmusic();
    int x=a;
    int y=b;
    obj2.domath(a,b);
    obj1.show(4,6.3,4.2);

}
}

class human 
{
    int age;
    double height;
    double weight;
  public void show(int age,double height,double weight)
    {
        System.out.println("age =" +age +" "+ "height =" +height+ " "+ "weight=" +weight+" " );

    }
}
