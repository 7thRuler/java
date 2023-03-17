import java.util.*;
class arr{
	public static void main(String arg[]){
	 Scanner inp=new Scanner(System.in);
	 int a[]=new int[20];
	 System.out.println("enter the size of the array");
	 int length=inp.nextInt();
	 System.out.println("enter the elements of the array");
	 for(int i=0;i<length;i++){
	  a[i]=inp.nextInt();
	  }
	 System.out.println("entered array is");
	 for(int i=0;i<length;i++){
	  System.out.println(a[i]);
	  }
	 }
	}
