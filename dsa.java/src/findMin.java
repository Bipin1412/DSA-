public class findMin {
    public static void main(String[] args) {
        int []arr={45,6,34,6,34,45,123,45,234};
        System.out.println(min(arr));
    }
    static int min(int[]arr){
        int ans=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<ans){
                ans=arr[i];
            }

        }
        return ans;

    }
}
