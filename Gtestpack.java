import Graphics.*;
public class Testpack{
public static void main(String[] args)
{
int c,a1,a2,a3;
Area x1=new Area();
Scanner inp=new Scanner(System.in);
	System.out.println("area of figures");
	do{
		System.out.println("MENU");
		System.out.println("1.CIRCLE");
		System.out.println("2.RECTANGLE");
		System.out.println("3.SQUARE");
		System.out.println("4.TRIANGLE");
		System.out.println("enter your choice:");
		c=inp.nextInt();
		switch(c){
		case 1:System.out.println("enter the radius");
			       a1=inp.next();
			       x1.circle(a1);
			       break;
		case 2:System.out.println("enter length:");
			       a1=inp.next();
			       System.out.println("enter breadth");
			       a2=inp.next();
			       x1.rectangle(a1,a2);
			       break;
		case 3:System.out.println("enter side:");
			       a1=inp.next();
			      
			       x1.square(a1);
			       break;
		case 4:System.out.println("enter length:");
			       a1=inp.next();
			       System.out.println("enter breadth");
			       a2=inp.next();
			       System.out.println("enter height");
			       a3=inp.next();
			       obj.extract(a1,b1);
			       break;
		default:System.out.println("\n Wrong Choice ");
			}
			System.out.println("PRESS 1 TO CONTINUE: ");
    			x=inp.nextInt();
		}
		while(x==1);
}
}

