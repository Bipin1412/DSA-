import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
            int[]arr={3,1,5,8,5,3,2,6};
            bubblelSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblelSort(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i ; j++) {
                // if array of j is smaller than array of i
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }

        }
    }
}
