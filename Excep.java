// public class Excep{

//     public static void main(String args[]){
        
        
//         try{
//             int a=10;
//             int b=0;
//          int c;
//          c=a/b;
//         }
//         catch(Exception e){        
//             System.out.println(e);        // this prints Exception class name, description of exception;
//             e.printStackTrace();       // this prints Exception class name, description of exception and line number;
//             e.getMessage();            // this prints custom message;
//         }
        
//     }

// }



 // Ye to tha exception jo default exception handler show kar raha tha.
 // Ab hum apna exception show karayenge with the help of super and throw keywords.



 //Runtime/Unchecked exception: 

// class Ae extends RuntimeException{
//     Ae(){
//         super("denominator must not be zero");
//     }
// }

// public class Excep{
//     public static void main(String args[]){
//         int a=12;
//         int b=0;
//         int c;
        
//         if(b==0){
//             throw new Ae();
//         }
//         else{
//             c=a/b;
//             System.out.println(c);
//         }
    

//     }
//  }








 class Ae extends Exception{
   
}

public class Excep {
    public static void main(String args[]) throws Ae{
        int a=12;
        int b=0;
        int c;
        
        // if(b==0){
        //     throw new Ae();
        // }
        // else{
        //     c=a/b;
        //     System.out.println(c);
        // }
    

        try{
            c=a/b;
            System.out.println(c);
        }
        catch(Exception e){
        e.printStackTrace();;
        }

    }
 }












