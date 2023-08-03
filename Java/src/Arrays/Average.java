package Arrays;

public class Average {
     public static void main(String[] args)
     {
    	 float sum=0;
    	 float avg;
    	 int arr[]= {1,7,3,8,5};
    	 int l = arr.length;
    	 for(int i:arr)
    	 {
    		 sum += i;
    		 
    	 }
    	 avg = sum/l;
    	 System.out.print("Average of numbers in Array:"+avg);
     }
}
