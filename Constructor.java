 class One{
    //Parameterised constructor;

    int arr[];
    String name;
    int age;
    One(int arr[]){
        this.arr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            this.arr[i]=arr[i];
        }
    }

    //Constructor overloading;

    One(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println(a);
    }

    //Copy Constructor;

    One(One obj){
        this.a=obj.a;
    }
 }

public class Constructor{
 public static void main(String args[]){
    One obj=new One(9);
    One obj1=new One(obj);

    // obj.display();
    // obj1.display();

    obj.a=12;

    obj.display();
    obj1.display();
    
 }
}
