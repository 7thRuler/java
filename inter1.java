import java.util.*;
interface operation{
    void area();
    void perimeter();
}
class circle implements operation{
    int a1;
    void area(int a){
        this.a1=a;
        double p=3.14*a1*a1;
        System.out.println("area of the circle="+p);
    }
    void perimeter(int z){
        this.a1=z;
        double p=2*3.14*a1;
        System.out.println("perimeter of the circle="+p);
    }
}
class rectangle implements operation{
    int a1,a2;
    void area(int a,int b){
        this.a1=a;
        this.a2=b;
        double p=a*b;
        System.out.println("area of the rectangle="+p);
    }
    void perimeter(int y,int z){
        this.a1=y;
        this.a2=z;
        double p=2*(a1+a2);
        System.out.println("perimeter of the rectangle="+p);
    }
}
public class inter1{
    public static void main(String arg[]){
        int o;
        Scanner inp=new Scanner(System.in);
        circle c1=new circle();
        rectangle r1=new rectangle();
        System.out.println("MENU");
        System.out.println("1.CIRCLE\n2.RECTANGLE");
        do{
            System.out.println("ENTER YOUR CHOICE:");
            int x=inp.nextInt();
            switch(x){
                case 1:
                    System.out.println("enter the radius of the cicle:");
                    int r=inp.nextInt();
                    c1.area(r);
                    c1.perimeter(r);
                    break;
                case 2:
                    System.out.println("enter the length of the rectandle:");
                    int l=inp.nextInt();
                    System.out.println("enter the breadth of the rectandle:");
                    int b=inp.nextInt();
                    r1.area(l,b);
                    r1.perimeter(l,b);
                default:System.out.println("\n Wrong Choice ");
            }
            System.out.println("PRESS 1 TO CONTINUE: ");
    		o=inp.nextInt();
        }
        while(o==1);
        
    }
}