//public class circularArray {
//    public static void main(String[] args) {
//        int[]arr={4,5,6,7,0,1,2};
//        System.out.println(circular(arr));
//    }
//    static int search(int[]arr,int target){
//        int pivot=circular(arr);
//
//        if(pivot==-1){
//            return binarySearch(arr,target);
//        }
//        if(pivot==target){
//            return pivot;
//        }
//
//    }
//
//    static int binarySearch(int[]arr,int target){
//        int start=0;
//        int end= arr.length-1;
//        while(start<=end){
//            int mid=start+(end-start)/2;
//
//            if(target<arr[mid]){
//                end=mid-1;
//            } else if (target>arr[mid]) {
//                start=mid+1;
//            }else{
//                return mid;
//            }
//        }
//        return -1;
//    }
//
//
//    static int circular(int[]arr){
//        int start=0;
//        int end= arr.length-1;
//
//        while (start<=end){
//            int mid=start+(end-start)/2;
//            //case 1
//            if (arr[mid] > arr[mid+1]){
//                return mid;
//            }
//            //case2
//            if(arr[mid]<arr[mid-1]){
//                return mid-1;
//            }
//            if(arr[mid]<=arr[start]){
//                end=mid-1;
//            }else{
//                start=mid+1;
//            }
//
//
//        }
//        return -1;
//    }
//}
