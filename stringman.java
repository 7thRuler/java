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
	void extract(String a,int b){
	this.s1=a;
	int i=b;
	char x = s1.charAt(i);
	System.out.println("the character is: "+x);
	}
	void modify(String a,String b){
	this.s1=a;
	this.s2=b;
	s1=s1.replace("is","was");
	System.out.println(s1);
	s2=s2.replace("subi","raju");
	
	System.out.println(s2);
	}
	void search(String a,String b){
	this.s1=a;
	String x= b;
	int p=s1.lastIndexOf(x);
	int q=s1.indexOf(x,2);
	System.out.println("the lastindex ="+p);
	System.out.println("occurence after index 2 ="+q);
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
		System.out.println("4.extraction");
		System.out.println("5.search operation");
		System.out.println("6.modify");
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
			       obj.extract(a1,b1);
			       break;
			case 5:System.out.println("enter the string:");
			       a1=inp.next();
			       System.out.println("enter the character:");
			       a2=inp.next();
			       obj.search(a1,a2);
			       break;
			case 6:System.out.println("enter the string:");
			       a1=inp.next();
			       System.out.println("enter the string:");
			       a2=inp.next();
			       obj.modify(a1,a2);
			       break;
       			default:System.out.println("\n Wrong Choice ");
			}
			System.out.println("PRESS 1 TO CONTINUE: ");
    			x=inp.nextInt();
		}
		while(x==1);
	}
}
