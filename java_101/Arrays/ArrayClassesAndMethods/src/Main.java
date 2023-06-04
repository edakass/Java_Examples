public class Main {
    public static void main(String[] args) {
       /* // helper array deki print methou için
        int[] list = {1,2,3,4};

        HelperArray helper = new HelperArray();
        helper.print(list);

        //Search için
        int[] list = {1,2,3,4,1999};
        System.out.println(HelperArray.search(list,1999));
        */

        //equals için
        int[] list1 = {1,2,3,4};
        int[] list2 = {1,2,3,4};
        int[] list3 = {6,8,9,14};

        System.out.println(HelperArray.equals(list1,list2));
        System.out.println(HelperArray.equals(list2,list3));







    }
}