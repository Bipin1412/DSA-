import java.util.Arrays;

public class bubbleSortPractice {
    public static void main(String[] args) {
        int[]arr={2,5,3,6,4,7};
        practice(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void practice(int []arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }

            }

        }
    }
}
