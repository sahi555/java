class a
{
    public static void main(String a[])
    {
         human obj =new human();
       // obj.age = 1;
      // obj.name = "sahith";
        
        System.out.println(obj.getage() + " : " + obj.getname());
        System.out.println(obj.getname());

    }
}
    
  class human
{
    private int age;
    private String name ; 

    public int getage()
    {
        return(age);
    }

    public void setage(int x)
    {
       x = age;
    }

    public String getname()
    {
        return(name);
    }
    public void setname(String y)
    {
        y = name;
    }
    
       
}
