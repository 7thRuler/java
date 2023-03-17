import java.util.*;
class sree{
	int a,b;
	int area1(int r){
	 this.a=r;
	 return(a*a);
	 }
	int area1(int p,int q){
	 this.a=p;
	 this.b=q;
	 return(a*b);
	 }
	}
	 
class area{
	public static void main(String arg[]){
	 Scanner inp=new Scanner(System.in);
	 sree obj=new sree();
	 System.out.println("enter the sides of the rectangle");
	 int p=inp.nextInt();
	 int q=inp.nextInt();
	 System.out.println("enter the side of the square");
	 int r=inp.nextInt();
	 System.out.println("area of the rectangle is "+ obj.area1(p,q));
	 System.out.println("area of the square is "+ obj.area1(r));
	 }
	}
	 
