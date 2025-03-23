 class One{
    //Parameterised constructor;
    int a;
    String name;
    int age;
    One(int a){
        this.a=a;
    }
    One(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("Name="+ name+","+"Age="+age);
    }
 }

public class Constructor{
 public static void main(String args[]){
    One obj=new One("Ananya",22);

    obj.display();
 }
}
