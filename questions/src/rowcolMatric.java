import java.util.Arrays;

public class rowcolMatric {
    public static void main(String[] args) {
    int[][]matrix={
            {10,20,30,40},
            {15,25,35,45},
            {33,34,37,49},
            {33,34,38}
    };
    int target=37;
        System.out.println(Arrays.toString(search(matrix,target)));

    }
    static int[] search(int[][]matrix,int target){
        //start index
        int r=0;
        //end index
        int c= matrix.length-1;

        while(r< matrix.length && c>=0){
            if(matrix[r][c]==target){
                return new int[]{r,c};
            }
            if(matrix[r][c]<target){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
