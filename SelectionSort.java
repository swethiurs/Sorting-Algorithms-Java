package sort;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = new int[] {80,40,20,10,30};
        int n = arr.length;
        
        for(int i=0;i<n-1;i++) {
        	int min=i;
        	for(int j=i+1;j<n;j++) {
        		if(arr[j]<arr[min]) {
        			min=j;
        		}
        	}
        	int temp = arr[min];
        	arr[min]= arr[i];
        	arr[i]= temp;
        }
        for(int i=0;i<n;i++) {
        	System.out.println(arr[i] + " ");
        }
	}

}
