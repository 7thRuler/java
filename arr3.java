import java.util.*;
class arr3{
	public static void main(String arg[]){
	 Scanner inp=new Scanner(System.in);
	 int a[][]=new int[20][20];
	 System.out.println("enter the number of rows");
	 int r=inp.nextInt();
	 System.out.println("enter the number of cols");
	 int c=inp.nextInt();
	 System.out.println("enter the elements of the array");
	 for(int i=0;i<r;i++){
	  for(int j=0;j<c;j++){
	   a[i][j]=inp.nextInt();
	   }
	  }
	 System.out.println("entered array is");
	 for(int i=0;i<r;i++){
	  for(int j=0;j<c;j++){
	   System.out.print(a[i][j]+" ");
	   }
	  System.out.println();
	  }
	 }
	}
