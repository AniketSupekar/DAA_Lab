import java.util.*;

public class HeapSort {

	public void sort(int arr[])
    {
        int n = arr.length;
 
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
 
        for (int i = n - 1; i >= 0; i--) {
          
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int n, int i)
    {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2; 

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
 
            heapify(arr, n, largest);
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
    }

    public static void main(String args[])
    {
    	 Scanner sc = new Scanner(System.in);
    	 HeapSort ob = new HeapSort();
    	 int c;
    		 int size;
    		 System.out.println("=== Heap Sort -> Assignment 3 ===");
    		 System.out.println();
    		 System.out.print("Enter the size of an array :");  
    		 size=sc.nextInt(); 
    		 int[] arr = new int[size];  
             System.out.println("Enter "+size+" elements in the array : ");  
             for(int i=0; i<size; i++)  
             {  
             arr[i]=sc.nextInt();  
             }  
             System.out.println();
    	do {
    		System.out.println("1. Display input array.");
    		System.out.println("2. Display Maxheap.");
    		System.out.println("3. Display Sorted array.");
    	
    		int choice = sc.nextInt();
    		switch(choice) {
    		case 1:
    			System.out.print("Input array is : ");
    			 for(int i=0; i<size; i++)  
    	            {  
    	            
    	            System.out.print(arr[i] + " ");
    	            }  
    			 break;
    			
    		case 2 :
    			break;
    			
    		case 3 :
    			ob.sort(arr);
    			 System.out.print("Sorted array is : ");
    	          printArray(arr);
    			break;
    			
    		default :
    			System.out.println("Invalid choice ! Try again...");
    			break;
    		}
    	  System.out.println();
          System.out.println("Press 1 to continue !");
          System.out.println("Press 0 to exit !");
          c = sc.nextInt();
          System.out.println();
    		
    	}while(c==1);  
    }
}
