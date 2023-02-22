class Binary_Search{
    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                start = mid+1;
                
            }
            else{
                end = mid-1;
               
            }
            
            
        }
        return -1;

    }
    public static void main(String[] args) {
        System.out.println("Hrolo");
        int[] arr = {2,3,4,573,6,4};
        System.out.println(binarySearch(arr, 3));
    }
}