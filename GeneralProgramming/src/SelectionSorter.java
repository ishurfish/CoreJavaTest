
public class SelectionSorter {

	public static void main(String[] args) {

		int arr[]= {7,3,9,1};
		SelectionSorter s=new SelectionSorter();
		s.sort(arr);
		
		 for (int i = 0; i < arr.length; i++) 
	            System.out.print(arr[i] + " ");

	}
	
	void sort(int arr[]) { 
		 int n=arr.length;
	        for (int i = 0; i < n-1; i++) {              	            
	        	int indexOfMinimum=i;
	            
	            for(int j=i+1; j<n; j++) {	            	
	            	if(arr[j] < arr[indexOfMinimum]) {
	            		indexOfMinimum=j;
	            	}
	            }
	         int temp = arr[indexOfMinimum];
		     arr[indexOfMinimum]=arr[i];	           
		     arr[i]=temp;
	        } 
	    }

}
