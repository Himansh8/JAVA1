import java.util.*;

 class Matrix{
	public static void main(String args[]){
		int sum=0;
	  Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
	  System.out.println("enter the element of matrix 1st:\n");
          for(int i=0;i<3;i++){
	     for(int j=0;j<3;j++){
	      int x= sc.nextInt();
	      a[i][j]=x;
	  }
	}
		System.out.println("The 1st matrix is:\n");
	  for(int i=0;i<3;i++){
	     for(int j=0;j<3;j++){
	       System.out.print(a[i][j]+" ");
	  }
		System.out.println();
	}
		 for(int i=0;i<3;i++){
	     for(int j=0;j<3;j++){
	      if(i==j){
		 sum=sum+a[i][j];
		}
	  }
	}
           System.out.println("Sum of diagonal element is:"+sum);
		System.out.println("The transpose of the matrix is");
		  for(int i=0;i<3;i++){
	     for(int j=0;j<3;j++){
	       System.out.print(a[j][i]+" ");
	  }
		System.out.println();
	}
	   System.out.println("enter the element of matrix 2nd:\n");
          for(int i=0;i<3;i++){
	     for(int j=0;j<3;j++){
	      int y= sc.nextInt();
	      b[i][j]=y;
	  }
	}
	 System.out.println("The 2nd matrix is:\n");
	  for(int i=0;i<3;i++){
	     for(int j=0;j<3;j++){
	       System.out.print(b[i][j]+" ");
	  }
		System.out.println();
	}
	 System.out.println("The sum of two matrix is:\n");
	  for(int i=0;i<3;i++){
	     for(int j=0;j<3;j++){
		c[i][j]=a[i][j]+b[i][j];
	       System.out.print(c[i][j]+" ");
	  }
		System.out.println();
	}
}
}