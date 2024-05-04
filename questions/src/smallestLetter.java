public class smallestLetter {
    public static void main(String[] args) {
        char[]arr={'c','f','j'};
        char target='c';
        System.out.println(letter(arr,target));

    }
    static char letter(char[]letter,char target){

        int start=0;
        int end=letter.length-1;

        while(start<end){
            int mid=start+(end-start)/2;

            if(start<letter[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return letter[start%letter.length];
    }
}
