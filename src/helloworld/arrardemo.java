package helloworld;
import java.util.Scanner;

import javax.imageio.IIOImage;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.awt.FontFormatException;
import java.rmi.NotBoundException;

public class arrardemo {
	public static void main(String[] args) {
		int array[]=new int[3];
		int[] a=new int[3];
		int b[]=new int[4];
		
		System.out.println(array);
		System.out.println(a);
		int[] arr1= {1,2,3,4,5};
		System.out.println(arr1.length);
		int[] arr= {1,2,3};
		reverse(arr);
		reverse2(arr);
 		
	}
	public static void reverse(int[] A) {
		System.out.println("dd");
		for(int i=0;i<A.length/2;i++)
		{
			int temp=A[i];
			A[i]=A[A.length-i-1];
			A[A.length-i-1]=temp;
			
			
		}
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]);
		}
		
		
	}
	public static void reverse2 (int[] a) {
		for(int start=0,end=a.length-1;start<=end;start++,end--)
		{
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		
	
	String[] strings= {"one","two"};
    Scanner sc=new Scanner(System.in);
    int index=sc.nextInt();
    System.out.println("arrardemo.reverse2()");
	}
    
    
}
