//public class firstAndLast {
//    public static void main(String[] args) {
//        int[]arr={};
//    }
//  public int firstAndLast(int[]arr,int target){
//        int[] ans={-1,-1};
//        int start= search(arr,target,.*
//                findStartIndex);
//
//    }
//    int search(int []arr,int target,boolean findStartIndex){
//        int ans=-1;
//
//
//        int start=0;
//        int end=arr.length-1;
//
//        while(start<=end){
//
//            int mid=start+(end-start)/2;
//
//            if(target<arr[mid]){
//                end=mid-1;
//            } else if (target>arr[mid]) {
//                start=mid+1;
//            }else {
//                ans=mid;
//                if(findStartIndex){
//                    end=mid-1;
//                }
//                else{
//                    start=mid+1;
//                }
//            }
//
//        }
//        return ans;
//    }
//}
