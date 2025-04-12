class One{
int arr[];

//Constructor

One(int arr[]){
this.arr= arr;
}
One(One obj1){
    this.arr= obj1.arr;
}
void display(){
    System.out.println(java.util.Arrays.toString(arr));
}
}

public class Shallow{
public static void main(String args[]){
    int arr[]={0,20,30};
One obj1=new One(arr);
One obj2=new One(obj1);

obj1.display();
obj2.display();
   
obj1.arr[0]=7;

obj1.display();
obj2.display();
}
}
















