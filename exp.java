import java.lang.*;
import java.util.*;

class NegativeException extends Exception{
    NegativeException(String msg){
        System.out.println(msg);
    }
}

public class exp {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the limit of numbers");
        int sum=0;
        int n1=in.nextInt();
        System.out.println("enter "+n1+" NUmbers:\n");
        for(int i=0;i<n1;i++){
            int n2=in.nextInt();
            try{
                if(n2<0){
                    i=i-1;
                    throw new NegativeException("The Number Is Negative,Enter A Positive One\n");
                }
                else{
                    sum=sum+n2;
                }
            }
            catch(NegativeException p){
                System.out.println(p);
            }
            
        }
        System.out.println("average of entered numbers :"+sum/n1);
    }
}
