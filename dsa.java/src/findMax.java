public class findMax {
    public static void main(String[] args) {
        int []arr={45,6,34,6,34,45,123,45,234};
        System.out.println(max(arr));
    }
    static int max(int []arr ){
        int ans=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>ans){
                ans=arr[i];
            }
        }
        return ans;
    }

}
