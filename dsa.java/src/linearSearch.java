import java.util.Scanner;

public class linearSearch {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int []num={1,3,5,7,8,5,3,5,6,6,87,};
        System.out.println("enter the element you want to search in the array");
        int n=in.nextInt();

    int ans=linear(num,n);
        System.out.println(ans);
    }
    static int linear(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element=arr[index];
            if (element==target){
                return index;
            } else if (arr[index]== arr[arr.length-1]) {
                System.out.println("it is last element" + index);
            }
        }
        return-1;

    }
}
