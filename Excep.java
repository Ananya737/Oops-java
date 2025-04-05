





public class Excep{

    public static void main(String args[]){
        
        
        try{
            int a=10;
            int b=0;
         int c;
         c=a/b;
        }
        catch(Exception e){        
            System.out.println(e);        // this prints Exception class name, description of exception;
            // e.printStackTrace();       // this prints Exception class name, description of exception and line number;
            // e.getMessage();            // this prints custom message;
        }
        
    }

}
