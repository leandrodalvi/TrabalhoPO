package TrabalhoPO;

public class BinarySearch {
        // Returns index of x if it is present in arr[l.. 
        // r], else return -1 
	
	public static Item binarySearch(Item[] arr, long x) {
		return  binarySearch(arr, 0, arr.length, x);
	}
        public static Item binarySearch(Item arr[], int l, int r, long x) 
        { 
            
            if (r >= l) { 
                int mid = l + (r - l) / 2; 
      
                if (arr[mid].getCpf() == x) 
                    return arr[mid]; 
      
                if (arr[mid].getCpf() > x) 
                    return binarySearch(arr, l, mid - 1, x); 
      
                return binarySearch(arr, mid + 1, r, x); 
            } 
      
            return null; 
        } 
}