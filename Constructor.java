 class One{
    
    String name;
    int age;

    //Constructor overloading;

    One(String name,int age){
        this.name=name;
        this.age=age;
    }



//Parameterised constructor;

    int arr[];
    One(int arr[]){
        this.arr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            this.arr[i]=arr[i];
        }
    }

  
    void display(){

        //For each loop;
        for(int i:arr){
        System.out.print(i);
        }  System.out.println();  
    }

    //Copy Constructor; 

    //Deep Copy constructure;

    One(One obj){
             this.arr=new int[obj.arr.length];
        for(int i=0;i<obj.arr.length;i++){
            this.arr[i]=obj.arr[i];
        }
    }
 }

public class Constructor{
 public static void main(String args[]){
    int arr[]={3,6,0};

    One obj=new One(arr);
    One obj1=new One(obj);

    obj.display();
    obj1.display();

obj.arr[0]=4;


    obj.display();
    obj1.display();
    
 }
}
