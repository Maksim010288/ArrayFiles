package packege_arrays;

public class SpiralArray {


    public int[][] initializationArray(int width, int height) {
        int[][] array = new int[width][height];
        int x = 0, y = 0;

        while (y < array.length - 1) {
            for (int i = y; i < array.length - y; i++) {
                array[y][i] = x;
                x++;
            }
            x--;
            for (int i = y; i < array.length - y; i++) {
                array[i][array.length - 1 - y] = x;
                x++;
            }
            x--;

            for (int i = array.length - 1 - y; i >= y; i--) {
                array[array.length - 1 - y][i] = x;
                x++;
            }
            x--;

            for (int i = array.length - 1 - y; i > y; i--) {
                array[i][y] = x;
                x++;
            }
            y++;
        }
        return array;
    }

    public void outputArraySpiral(int[][] array) {
        for (int[] ints : array) {
            for (int j = 0; j < ints.length; j++) {
                System.out.printf("%4d", ints[j]);
            }
            System.out.println();
        }
    }
}


