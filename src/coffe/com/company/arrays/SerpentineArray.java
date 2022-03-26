package packege_arrays;

public class SerpentineArray {

    public int[][] initializationArray(int width, int height) {
        int[][] array = new int[width][height];
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if(i % 2 == 0) {
                for (int j = 0; j < array.length; j++) {
                    temp++;
                    array[i][j] = temp;
                }
            }else {
                for (int j = array[i].length - 1; j >= 0; j--) {
                    temp++;
                    array[i][j] = temp;
                }
            }
        }
        return array;
    }

    public void outputArraySnack(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }
    }
}
