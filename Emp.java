import java.util.Scanner;
public class Emp{
 int eNo;
 String eName;
 double eSalary;
 void data(){
  System.out.println("\nEnter the Employee details:\n");
  Scanner inp=new Scanner(System.in);
  System.out.println("Employee Number : ");
  eNo=inp.nextInt();
  System.out.println("Employee Name : ");
  eName=inp.next();
  System.out.println("Employee Salary : ");
  eSalary=inp.nextDouble(); 
 }
    
 void display(){
  System.out.println("Empolyee No : "+eNo);
  System.out.println("Name : "+eName);
  System.out.println("Salary Amount "+eSalary+"\n");
 }
    
 public static void main(String[] args){
  System.out.println("\n Enter the No of Employee's : ");
  Scanner input=new Scanner(System.in);
  int n=input.nextInt();
  Emp arr[]=new Emp[n];
  for(int i=0;i<n;i++){
   arr[i]=new Emp();
   arr[i].data();
   }
  System.out.println("\n Emplyee Details : ");
  for(int i=0;i<n;i++){
   arr[i].display();
  }
  System.out.println("\n Enter the Employee Number to be Searched : \n");
  int n1=input.nextInt();
  for(int i=0;i<n;i++){
   if(arr[i].eNo==n1){
    arr[i].display();
   }
  }    
 }
}
