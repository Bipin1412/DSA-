public class orderAgnosticBS {
    public static void main(String[] args) {
      int []arr={2,4,6,7,9,23,56,89};
      int target=23;
      System.out.println(orderAgnosticBS(arr,target));
    }
    static int orderAgnosticBS(int[]arr,int target){
        int start=0;
        int end= arr.length-1;

        boolean isAsc=arr[start]<arr[end];

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target==arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }

            }else{
                if(target>arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }


        }
        return -1;
    }
}
