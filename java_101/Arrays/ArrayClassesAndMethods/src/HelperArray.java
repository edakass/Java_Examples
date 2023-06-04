public class HelperArray {

    // toString ile kullandığımızın bizim burada yazdığımız hali
    static void print(int[] arr){
        System.out.print("[");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
    }

    // override olmuş oldu
    void print(double[] arr){
        System.out.print("[");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
    }

    // fill metodunun bizim yazdığımız hali
    static int[]  fill(int[] arr, int value) {
        for(int i = 0; i < arr.length; i++){
            arr[i] = value;
        }
        return  arr;
    }

    // binarySearch metodu için
    static int search(int[] arr,int value){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    //equals metodu için
    static boolean equals(int[] l1, int[] l2){
        if(l1.length != l2.length){
            return false;
        }
        for(int i = 0; i < l1.length; i++){
            if(l1[i] != l2[i]){
                return false;
            }
        }
        return  true;
    }

}
