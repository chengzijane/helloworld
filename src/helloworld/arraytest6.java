package helloworld;

public class arraytest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int index=getindex(arr, 1);
		System.out.println(index);
		int[][] a=new int[3][2];
		System.out.println(a);
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		int[][] arr1=new int[4][];
		System.out.println(arr1[0]);
		arr1[0]=new int[2];
		arr1[1]=new int[3];
		arr1[0][0]=10001;
		int[][] arr2= {{1,1,1},{2,3},{1,3,5}};
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2[i].length;j++)
			{
				System.out.println(arr2[i][j]+" ");
				
			}
			System.out.println();
		}
		
		

	}
	
	public  static int getindex(int[] arr,int value) {
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==value)
				return i;
		}
		return -1;
	}
  
  
  

}

