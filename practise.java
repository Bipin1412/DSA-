public class PrimeNumber{
     public static void main(String[] args) {
        int number=23;
       if(number<2){
        return false;
       }
       for(i=2;Math.sqrt(number); i++){
        if(number%i==0){
            return false;
        }
    }
    return ture;


     }
}