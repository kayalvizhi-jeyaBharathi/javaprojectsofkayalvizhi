package dimenional1array;

import java.util.Scanner;

public class Duplicateqn1 {
	public static void duplication() {
 System.out.println("Enter the size : ");
  Scanner sc=new Scanner(System.in);
  int size=sc.nextInt();
  int []array=new int[size];
  System.out.println("enter all the elements: ");
  for(int i=0;i<size;i++) {
	  array[i]=sc.nextInt();
  }
 
  for(int i=0;i<size;i++) {
	  int count=0;
	  for(int j=i+1;j<=size-1;j++) {
		  if(array[i]==array[j]) {
			count++;
		  }
	  }
	  if(count==1){
	  System.out.println(array[i]);
	  }
	}
}
	public static void main(String[]args) {
		Duplicateqn1 obj=new Duplicateqn1();
		obj.duplication();
	}
}
