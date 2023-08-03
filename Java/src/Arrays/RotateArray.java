package Arrays;

public class RotateArray {
   public static void main(String[] args)
   {
	   int arr[]= {32,44,21,65,77,98};
	   int n=arr.length;
	   int temp[]= new int[n];
	   int pos=2;
	   int k=0;
	   for(int i=pos;i<n;i++) {
		   temp[k]=arr[i];
		   k++;
		   
	   }
	   
	   for(int i=0;i<pos;i++)
	   {
		   temp[k]=arr[i];
		   k++;
	   }
	   
	   for(int i=0;i<n;i++)
	   {
		   arr[i]=temp[i];
	   }
	   
	   for(int j:arr)
	   {
		   System.out.println(j);
	   }
	   
   }
}
