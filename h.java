class h
{
h()
{
   System.out.println("i am first constructor");
}
h(String h)
{
    System.out.println("i am int parametarized");

}
void mymethod()
{
    System.out.println("i am method");
}
public static void main(String args[])
{
   h obj=new h();
   h obj2=new h("sahith"); 
   obj.mymethod();
}
}