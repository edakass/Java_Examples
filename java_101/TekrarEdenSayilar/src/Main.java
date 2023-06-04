import java.util.Arrays;

public class Main {

    static boolean isFind(int[] arr, int value){
        for(int i : arr){
            if(i == value ) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {3,7,3,3,2,9,10,21,1,33,9,1,2,2,2,46,48,56,48,48,46,24,24,24,12,12,12};
        int[] duplicate = new int[list.length];
        //duplicate : tekrardan eden demek
        int startIndex = 0;
        for(int i = 0; i<list.length; i++){
            for (int j = 0; j <list.length; j++){
                if((i != j) && (list[i] == list[j]) && list[i] % 2 == 0){
                    if(!isFind(duplicate,list[i])){
                        duplicate[startIndex++] = list[i]; //list[i] dedik ama list[j] de olabilir çünkü yukarda i ve j birbirine eşit
                    }
                    break;
                }
            }
        }
        for (int value : duplicate){
            if(value != 0){
                System.out.println(value);
            }
        }
    }
}