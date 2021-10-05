import java.util.*;
import java.lang.*;

public class Max_subset_window
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
	    Deque<Integer> deque = new ArrayDeque<Integer>();
    	for(int i=0;i<num;i++){
    	    while(!deque.isEmpty() && arr[deque.getLast()] <= arr[i]){
    	        deque.removeLast();
    	    }
    	    deque.addLast(i);
    	    if(deque.peekFirst()==i-k){
    	        deque.removeFirst();
    	    }
    	    if(i>=k-1){
    	        System.out.print(arr[deque.getFirst()]+" ");
    	    }
    	}
	}
}
