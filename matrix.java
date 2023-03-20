import java.util.*;
class matrix{
	public static void main(String arg[]){
	 Scanner inp=new Scanner(System.in);
	 int a[][]=new int[20][20];
	 int b[][]=new int[20][20];
	 int s[][]=new int[20][20];
	 System.out.println("enter the number of rows");
	 int r=inp.nextInt();
	 System.out.println("enter the number of cols");
	 int c=inp.nextInt();
	 System.out.println("enter the elements of the matrix A");
	 for(int i=0;i<r;i++){
	  for(int j=0;j<c;j++){
	   a[i][j]=inp.nextInt();
	   }
	  }
	 System.out.println("matrix A");
	 for(int i=0;i<r;i++){
	  for(int j=0;j<c;j++){
	   System.out.print(a[i][j]+" ");
	   }
	  System.out.println();
	  }
	 System.out.println("enter the elements of the matrix B");
	 for(int i=0;i<r;i++){
	  for(int j=0;j<c;j++){
	   b[i][j]=inp.nextInt();
	   }
	  }
	 System.out.println("matrix B");
	 for(int i=0;i<r;i++){
	  for(int j=0;j<c;j++){
	   System.out.print(b[i][j]+" ");
	   }
	  System.out.println();
	  }
	 System.out.println("sum of two matrices are");
	 for(int i=0;i<r;i++){
	  for(int j=0;j<c;j++){
	   s[i][j]=a[i][j]+b[i][j];
	   }
	  }
	 for(int i=0;i<r;i++){
	  for(int j=0;j<c;j++){
	   System.out.print(s[i][j]+" ");
	   }
	  System.out.println();
	  }
	 }
	}
