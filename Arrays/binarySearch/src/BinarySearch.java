public class BinarySearch {
    public static void main(String[] args) {
        int[] arr ={ 2, 3, 5, 7, 9,11,15};
        System.out.println(findIndexPos(11,arr));
    }

    private static int findIndexPos(int number, int[] arr) {
        int start =0;
        int end =arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(number<arr[mid]) end = mid-1;
            else if(number>arr[mid]) start = mid+1;
            else if(number==arr[mid]) return mid;
        }
        return -1;
    }
}
