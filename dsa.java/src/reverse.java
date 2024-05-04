//public class reverse {
//    public static void main(String[] args) {
//        int num=1534236469;
//
//        int ans=0;
//
//        while(num>0){
//            int remd=num%10;
//            num=num/10;
//
//            ans=ans *10 +remd;
//        }
//        System.out.println(ans);

//   String original="hello";
//   String reversed="";
//
//   for(int i=0;i<original.length();i++){
//       reversed=original.charAt(i)+reversed;
//   }
//        System.out.println(reversed);


//    }
//}
//class sad{
//    public static void main(String args[]){
//        String s1="hello world";
//        String s2="Hello";
//        String s3="GOOD BYE";
//
//        System.out.println(s1.trim());
//        System.out.println(s3.toLowerCase());
//    }
//}

import org.w3c.dom.ls.LSOutput;

public class reverse{
    public static void main(String[] args) {
        int []arr={2,4,6,8,4};
        original(arr);
        reversed(arr);
    }
    static int original(int[]arr){
        System.out.println("original");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            System.out.println();
        }
        return -1;
    }



    static int reversed(int[]arr){
        System.out.println("reversed");
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+ " ");
        }
        return -1;
    }
}


