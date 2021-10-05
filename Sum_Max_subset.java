import java.util.*;
import java.lang.*;

public class Sum_Max_subset
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Input Size:");
	    int num =sc.nextInt();
	    System.out.print("Window_size:");
	    int k= sc.nextInt();
	    int[] arr = new int[num];
	    for(int i=0;i<num;i++){
	        arr[i] =sc.nextInt();
	    }
	    int window_sum=0;
	    int max_sum=0;
	    for(int i=0;i<k;i++){
	        window_sum = window_sum+arr[i];
	    }
	    max_sum=window_sum;
	    for(int i=k;i<num;i++){
	        window_sum =window_sum+arr[i]-arr[i-k];
	        if( max_sum < window_sum){
	            max_sum =window_sum;
	        }
	    }
	    System.out.println(max_sum);
	}
}
