interface i1
{
    void sound();
}


class dog implements i1
{

    public  void sound()
    {
        System.out.print("dogsound");
    }

    void display()
    {
        System.out.print("i am display method");
    }
}

class cat implements i1
{
    public  void sound()
    {
        System.out.print("catsound");
    }


}

class One extends dog
{
    public static void main(String args[])
    {
        System.out.println("hello");
     dog obj=new One();
        obj.display();
        obj.sound();

        cat obj1=new cat();
        obj1.sound();
    }
}