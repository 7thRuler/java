import java.util.*;
class cmplx{
	double real,img;
	cmplx(double p,double q){
	 this.real=p;
	 this.img=q;
	 }
	cmplx(){}
	cmplx sum(cmplx c1,cmplx c2){
	 cmplx temp=new cmplx();
	 temp.real=c1.real+c2.real;
	 temp.img=c1.img+c2.img;
	 return temp;
	 }
	
	public static void main(String arg[]){
	 Scanner inp=new Scanner(System.in);
	 System.out.println("enter the real part of first complex number");
	 double a=inp.nextDouble();
	 System.out.println("enter the imaginary part of first complex number");
	 double b=inp.nextDouble();
	 System.out.println("enter the real part of second complex number");
	 double c=inp.nextDouble();
	 System.out.println("enter the imaginary part of second complex number");
	 double d=inp.nextDouble();
	 cmplx temp=new cmplx();
	 
	 cmplx c1=new cmplx(a,b);
	 cmplx c2=new cmplx(b,d);
	 temp=temp.sum(c1,c2);
	 System.out.println("new complex number ="+temp.real+"+i"+temp.img);
	 }
	}
	 
