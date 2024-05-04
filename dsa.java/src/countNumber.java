public class countNumber {
    public static void main(String[] args) {
        int n=49699964;

        int count=0;
        while(n>0){
            int remd=n%10;
            if(remd==9){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
