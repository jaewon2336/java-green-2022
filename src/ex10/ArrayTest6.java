package ex10;

public class ArrayTest6 {
    public static void main(String[] args) {
        int[][] array = { { 10, 20, 30, 40 }, { 50, 60, 70, 80 }, { 90, 100, 110, 120 } };
        // int[][] array = new int[8][100];

        for (int r = 0; r < array.length; r++) { // 전체 length = 행의 개수 = 3
            for (int c = 0; c < array[r].length; c++) { // r행의 열의 개수 = 4
                System.out.println(r + "행 " + c + "열 " + array[r][c]);
            }
        }
    }
}
