class Two{
    class Three{
         void display(int a,String name){
            int b=a;
            String name1=name;
        System.out.println(a+ " " +name);
    }
    }
   
}

public class One{
    public static void main(String args[]){
        Two obj=new Two();
        Two.Three obj1=obj.new Three();
        obj1.display(2,"Ananya");
        
     
            


    }
}