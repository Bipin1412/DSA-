public class maxValue {
    public static void main(String[] args) {
        int[] arr={1,2,5,6,2,5,9,4};
        System.out.println(maxRange(arr,2,5));
    }

    static int maxRange(int[]arr, int start,int end){
        int maxValue=arr[0];
        for (int i = start; i < end; i++) {
            if(arr[i]>maxValue){
                maxValue =arr[i];
            }

        }
        return maxValue;
    }

    static int maxValue(int[]arr){
        int maxValue=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>maxValue){
                maxValue =arr[i];
            }

        }
        return maxValue;
    }
}
