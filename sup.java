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
	employee(String a,String b,String c,int d,int p,String q,String r,int s){
		super(a,b,c,d);
		this.empid=p;
		this.companyname=q;
		this.qualification=r;
		this.salary=s;
	}	
}
class teacher extends employee{
	String subject,department;
	int teacherid;

	teacher(String a,String b,String c,int d,int p,String q,String r,int s,int x,String y,String z){
		super(a,b,c,d,p,q,r,s);
		this.teacherid=x;
		this.subject=y;
		this.department=z;
	}
	
	void display(){
		System.out.println("NAME : "+name);
		System.out.println("GENDER : "+gender);
		System.out.println("ADDRESS : "+address);
		System.out.println("AGE : "+age);
		System.out.println("QUALIFICATION : "+qualification);
		System.out.println("COMPANY NAME : "+companyname);
		System.out.println("EMPLOYEE ID : "+empid);
		System.out.println("SALARY : "+salary);
		System.out.println("TEACHER ID : "+teacherid);
		System.out.println("DEPARTMENT : "+department);
		System.out.println("SUBJECT : "+subject);
	}
}
public class sup{
	int a1,d1,d2,a3;
	String b1,c1,a2,b2,c2,b3,c3;
	Scanner inp=new Scanner(System.in);
	void datae(){
		System.out.println("enter the employee id:\n");
		a1=inp.nextInt();
		System.out.println("enter the company name of the employee:\n");
		b1=inp.next();
		System.out.println("enter the qualification of the employee:\n");
		c1=inp.next();
		System.out.println("enter the salary of the employee:\n");
		d1=inp.nextInt();
	}
	void datap(){
		System.out.println("enter the name of the person:");
		a2=inp.nextLine();
		System.out.println("enter the gender of the person:");
		b2=inp.nextLine();
		System.out.println("enter the address of the person:");
		c2=inp.nextLine();
		System.out.println("enter the age of the person:");
		d2=inp.nextInt();
	}
	void datat(){
		System.out.println("enter the teacher id:");
		a3=inp.nextInt();
		System.out.println("enter the department:");
		b3=inp.next();
		System.out.println("enter the subject:");
		c3=inp.next();
	}
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number of teacher");
		int n1=in.nextInt(); 
		teacher t1[]=new teacher[n1];
		sup s1=new sup();
	
		for(int i=0;i<n1;i++){
			System.out.println("PERSON-"+i+1+" details ");
			s1.datap();
			s1.datae();
			s1.datat();
		    t1[i]=new teacher(s1.a2,s1.b2,s1.c2,s1.d2,s1.a1,s1.b1,s1.c1,s1.d1,s1.a3,s1.b3,s1.c3);
		}
		for(int i=0;i<n1;i++){
			System.out.println("PERSON-"+i+1+"\n");
			t1[i].display();
		}
	
	
 }
}
