class One{
int arr[];
//Constructor
One(int arr[]){
this.arr= new int [arr.length];
}
One(One obj1){
    this.arr=new int [obj1.arr.length];
}
void display(){
    System.out.println(java.util.Arrays.toString(arr));
}
}

public class ShallowCopy{
public static void main(String args[]){
    int arr[]={9,20,30};
One obj1=new One(arr);
One obj2=new One(obj1);

obj1.display();
obj2.display();
}
}
