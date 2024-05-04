import java.util.Scanner;

public class amstrong {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        boolean ans = isamstrong(n);
        System.out.println(ans);
    }
    static boolean isamstrong( int n){
        int sum=0;
        int original=n;
        while (n<0){
            int remd =n%10;
            n=n/10;
              sum=sum+remd*remd*remd;

        }
        return sum==original;

    }

}
