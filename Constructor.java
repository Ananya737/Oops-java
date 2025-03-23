 class One{
    //Parameterised constructor;
    int a;
    One(int a){
        this.a=a;
    }
    void display(){
        System.out.println(a);
    }
 }

public class Constructor{
 public static void main(String args[]){
    One obj=new One(9);
    obj.display();
 }
}
