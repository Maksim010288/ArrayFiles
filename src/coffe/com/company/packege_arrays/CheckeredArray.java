package packege_arrays;

public class CheckeredArray {

    public int[][] initializationArray(int width, int height) {
        int[][] array = new int[width][height];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 0 && j % 2 == 0) array[i][j] = 1;
                if (i % 2 == 1 && j % 2 == 1) array[i][j] = 1;
            }
        }
        return array;
    }
}

