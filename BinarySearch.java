package TrabalhoPO;

public class BinarySearch {
        // Returns index of x if it is present in arr[l.. 
        // r], else return -1 
        public int binarySearch(Item arr[], int l, int r, int x) 
        { 
            
            if (r >= l) { 
                int mid = l + (r - l) / 2; 
      
                if (arr[mid].getCpf() == x) 
                    return mid; 
      
                if (arr[mid].getCpf() > x) 
                    return binarySearch(arr, l, mid - 1, x); 
      
                return binarySearch(arr, mid + 1, r, x); 
            } 
      
            return -1; 
        } 
}