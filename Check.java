
class Override{
    int x=3;
}

public class Check{
    //Final keyword is called a modifier;
    //Final variables cannot override values;  
    final int x=10;
    public static void main(String args[]){
Check obj=new Check();
obj.x=9; //This will generate an error;
System.out.println(obj.x);


//Variable Overriding.
Override obj1=new Override();
obj1.x=9;
System.out.println(obj1.x);
}
}
