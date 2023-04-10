import java.util.*;
class stringman{
	String s1;
	String s2;
	void length(String a){
	this.s1=a;
	int l1=s1.length();
	System.out.println("length of the string= "+l1);
	}
	void join(String a,String b){
	this.s1=a;
	this.s2=b;
	String s3=s1.concat(s2);
	System.out.println("joined string is: "+s3);
	}
	void comp(String a,String b){
	this.s1=a;
	this.s2=b;
	boolean s3=s1.equals(s2);
	System.out.println("string one and two are equal= "+s3);
	}
	void search(String a,int b){
	this.s1=a;
	int i=b;
	char x = s1.charAt(i);
	System.out.println("the character is: "+x);
	}
	public static void main(String args[]){
	int c,x,b1;
	String a1,a2;
	stringman obj=new stringman();
	Scanner inp=new Scanner(System.in);
	System.out.println("String Manipulation");
	do{
		System.out.println("MENU");
		System.out.println("1.length of a string");
		System.out.println("2.join operation");
		System.out.println("3.comparison operation");
		System.out.println("4.search operation");
		System.out.println("enter your choice[]");
		c=inp.nextInt();
		switch(c){
			case 1:System.out.println("enter a string:");
			       a1=inp.next();
			       obj.length(a1);
			       break;
			case 2:System.out.println("enter first string:");
			       a1=inp.next();
			       System.out.println("enter second string:");
			       a2=inp.next();
			       obj.join(a1,a2);
			       break;
			case 3:System.out.println("enter first string:");
			       a1=inp.next();
			       System.out.println("enter second string:");
			       a2=inp.next();
			       obj.comp(a1,a2);
			       break;
			case 4:System.out.println("enter the string:");
			       a1=inp.next();
			       System.out.println("enter the position:");
			       b1=inp.nextInt();
			       obj.search(a1,b1);
			       break;
       			default:System.out.println("\n Wrong Choice ");
			}
			System.out.println("PRESS 1 TO CONTINUE: ");
    			x=inp.nextInt();
		}
		while(x==1);
	}
}
