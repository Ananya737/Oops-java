class One{
int arr[];
//Constructor
One(int arr[]){
this.arr=arr;
}
void display(){
    System.out.print(arr);
}
}

public class ShallowCopy{
public static void main(String args[]){
    int arr[]={10,20,30};
One obj1=new One(arr);
obj1.display();
}
}
