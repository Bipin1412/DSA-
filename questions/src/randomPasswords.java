import java.util.*;
public class randomPasswords {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Generating random password using random function");
        System.out.println("enter the length of password you want to generate?");
        int length= in.nextInt();
        System.out.println(password(length));
    }
    static char[] password(int len){

        System.out.println("your password");
        String capital_letter="ABCDEFGHIJKLMANOPQRSTUVWXYZ";
        String small_letter="abcdefghijklmanopqrstuvwxyz";
        String numbers="0123456789";
        String symbols="@#$*&";
        String values= capital_letter+small_letter+numbers+symbols;
        Random rand_method=new Random();
        char[]password=new char[len];
        for(int i=0;i<len;i++){
            password[i]=values.charAt(rand_method.nextInt(values.length()));
        }
        return password;
    }
}
