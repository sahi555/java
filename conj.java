

class students 
{
    String name;
    int a[]=new int[5];
    int rollno;
    char x = 's' ;
    int marks;

    public void list(String name,int rollno,int marks)
    {
       System.out.println("student name :" + name + "rollno :" + rollno +"   " +"section :" +x+  " i am besidde");
    }

    public void print()
    {
        System.out.println("student marks :" + marks);
    }


}
class conj extends students
{
    public static void main(String a[])

    {
        conj obj1 = new conj();
        
        obj1.list("sahith",28,6);
        obj1.print();
        conj obj2 = new conj();

        obj2.list ("sahi",34,6);

        conj s2 = new conj();
        conj s3 = new conj();
        
       



   
        


        


        
        
    
    }



}