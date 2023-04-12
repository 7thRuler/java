import java.util.*;
class person{
	String name, gender, address;
	int age;
	person(String a,String b,String c,int d){
		this.name=a;
		this.gender=b;
		this.address=c;
		this.age=d;
	}
}
class employee extends person{
	int empid,salary;
	String companyname,qualification;
	employee(int p,String q,String r,int s){
		this.empid=p;
		this.companyname=q;
		this.qualification=r;
		this.salary=s;
	}	
}
class teacher extends employee{
	String subject,department;
	int teacherid;
	teacher(int x,String y,String z){
		this.teacherid=x;
		this.subject=y;
		this.department=z;
	}
	void datap1(){
		System.out.println("enter the name of the person:");
		a1=inp.next();
		System.out.println("enter the gender of the person:");
		b1=inp.next();
		System.out.println("enter the address of the person:");
		c1=inp.next();
		System.out.println("enter the age of the person:");
		d1=inp.nextInt();
	}
	void display(){
		System.out.println("NAME : "+name);
		System.out.println("GENDER : ");
		System.out.println("ADDRESS : ");
		System.out.println("AGE : ");
		System.out.println("QUALIFICATION : ");
		System.out.println("COMPANY NAME : ");
		System.out.println("EMPLOYEE ID : ");
		System.out.println("SALARY : ");
		System.out.println("TEACHER ID : ");
		System.out.println("DEPARTMENT : ");
		System.out.println("SUBJECT : ");
	}
public static void main(String args[]){
	
	String a1,b1,c1,c2,b2;
	int d1,a2,d2;
	
	Scanner inp=new Scanner(System.in);
	
	System.out.println("enter the number of persons");
	int n1=inp.nextInt();
	System.out.println("enter the number of employee");
	int n2=inp.nextInt();
	System.out.println("enter the number of teacher");
	int n3=inp.nextInt();
	person p1[]=new person[n1];
	employee e1[]=new employee[n2];
	teacher t1[]=new teacher[n3];
	
	for(int i=0;i<n1;i++){
		datap1();
		p1[i]=new person(a1,b1,c1,d1);
	}
	for(int i=0;i<n1;i++){
		p1[i].display();
	}
	
	
 }
}
