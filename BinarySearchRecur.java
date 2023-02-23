public class BinarySearchRecur {

    public int search(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        return helper(arr, target, start, end);
    }

    public int helper(int[] arr, int target, int start, int end){
        int mid = start + (end-start)/2;
        if(target == arr[mid])
            return mid;
        else if (target > arr[mid]){
            return helper(arr, target, mid+1, end);
        }
        else{
            return helper(arr, target, start, end-1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 8;
        BinarySearchRecur b = new BinarySearchRecur();
        System.out.println(b.search(arr, target));
    }
}
