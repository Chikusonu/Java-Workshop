public class transpose {

    public static void main(String[] args) {
        int[][] originalArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int rows = originalArray.length;
        int columns = originalArray[0].length;
        
        int[][] transposedArray = new int[rows][columns];
        
        // Print the transposed array
        System.out.println("Original Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(originalArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transposed Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(originalArray[j][i] + " ");
            }
            System.out.println();
        }
    }
}
