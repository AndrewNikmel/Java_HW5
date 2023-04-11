public class task4 {
    public static final int size = 8;
    public static int[][] array = new int[size][size];

    public static void main(String[] args) {
        /* На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.*/
        System.out.println(array);
        if (!putThePhers(array, 0)){
            System.out.println("Решений нет!");
            return;
        }
        System.out.println(array);
    }

    public static boolean putThePhers(int[][] array, int col) {
        if (col >= array.length){
            return true;
        }
        for (int i = 0; i < array.length; i++) {
            if (checkPosition(array, i, col)){
                array[i][col] = 1;
                if (putThePhers(array, col+1)){
                    return true;
                }
                array[i][col] = 0;
            }
        }

        return false;
    }

    public static boolean checkPosition(int[][] array, int row, int col){
        for (int i = 0; i < col; i++) {
            if (array[row][i] > 0){
                return false;
            }
        }

        for (int i = row - 1, j = col - 1; i>= 0 && j >= 0; i--, j--) {
            if (array[i][j] > 0){
                return false;
            }
        }

        for (int i = row + 1, j = col - 1; i < array.length && j >= 0; i++, j--) {
            if (array[i][j] > 0){
                return false;
            }
        }

        return true;
    }
}
// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.