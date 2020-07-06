package TrabalhoPO;

public class QuickSort {
    int partition(Item arr[], int low, int high) 
    { 
        Item pivot = arr[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than the pivot 
            if (arr[j].getCpf() < pivot.getCpf()) 
            { 
                i++; 
  
                Item temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        Item temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
  
    void sort(Item arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            int pi = partition(arr, low, high); 
  
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    } 
  
}