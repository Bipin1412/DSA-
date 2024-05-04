public class mountainArray {
    public static void main(String[] args) {
        int[]arr={2,3,4,5,6,4,3,2};
        System.out.println(search(arr));
    }
    static int search(int[]arr){
        int start=0;
        int end= arr.length-1;

        if(start<end){

            int mid=start+(end-start)/2;

            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}
