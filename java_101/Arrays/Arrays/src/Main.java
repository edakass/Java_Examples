public class Main {
    public static void main(String[] args) {
        /*
        Matris şu şekilde
        1  2  3  4
        5  6  7  8
        9 10 11 12
        row col
         */
        int[][] matris = new int[3][4];
        int number = 1;
        // Matris elemanlarına erişmek için
        for(int i = 0; i < matris.length; i++) { // row
            for(int j=0; j < matris[i].length; j++) { // col
                matris[i][j] = number++;
            }
        }
        // Matris yazdırma
        for(int i = 0; i < matris.length; i++) {
            for(int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }
}