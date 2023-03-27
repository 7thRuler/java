import java.util.*;
class A{
 int a,b,c;
 double r;
 int area(int a1){
  this.a=a1;
  return(a*a);
 }
 int area(int l1,int b1){
  this.a=l1;
  this.b=b1;
  return(a*b);
 }
 double area(double r){
  this.r=r;
  return(r*r*3.14);
 }
 double area(int p,int q,int z){
 int s;
 this.a=p;
 this.b=q;
 this.c=z;
 s=(a+b+c)/2;
 return ((s*(s-a)*(s-b)*(s-c))*0.5);
 }
}
class Area{
 public static void main(String args[]){
  int a1,l1,b1,ch,x,p,q,z;
  Scanner inpt=new Scanner(System.in);
  Scanner inp=new Scanner(System.in);
  double r;
  A Obj=new A();
  do{
   System.out.println("\n M E N U \n");
   System.out.println(" 1. Area of Square. ");
   System.out.println(" 2. Area of Rectangle. ");
   System.out.println(" 3. Area of Circle. ");
   System.out.println(" 4. Area of triangle ");
   System.out.println(" 5. Exit ");
   System.out.println(" Enter Your Choice [1-5] : \n");
   ch=inpt.nextInt();
   switch(ch){
   case 1:System.out.println(" Enter Side of Square : ");
          a1=inp.nextInt();
          System.out.println(" Area Of Square : "+Obj.area(a1));
          break;
   case 2:System.out.println(" Enter Length and Breadth of Rectangle: ");
          l1=inp.nextInt();
          b1=inp.nextInt();
          System.out.println(" Area Of Rectangle : "+Obj.area(l1,b1));
          break;
   case 3:System.out.println(" Enter Radius of Circle : ");
          r=inp.nextDouble();
          System.out.println(" Area Of Square : "+Obj.area(r));
          break;
   case 4:System.out.println(" Enter sides of a triangle : ");
          p=inp.nextInt();
          q=inp.nextInt();
          z=inp.nextInt();
          System.out.println(" Area Of Square : "+Obj.area(p,q,z));
          break;
     default:System.out.println("\n Wrong Choice ");
   }
    System.out.println("PRESS ONE TO CONTINUE: ");
    x=inpt.nextInt();
  }while(x==1);                 
 }  
}  

