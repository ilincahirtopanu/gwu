import java.util.Arrays;

public class Assess4_5_Sample{

  public static int[][] createGrid(int width, int height){
    int [][] result = new int [height][width];
    int previous = 0;
    for (int row = 0; row < height; row++) {
        for (int col = 0; col < width; col++) {
            result[row][col] = (row + col) + previous;
            previous = result[row][col];
        }
    }
    
    return result;
  }

  public static void main(String[] args){

    int [][] arr1 = {{0}};
    System.out.println("test1: " + Arrays.deepEquals(createGrid(1,1), arr1));
    int [][] arr2 = {{0}, {1}};
    System.out.println("test2: " + Arrays.deepEquals(createGrid(1,2), arr2));
    int [][] arr3 = {{0, 1}, {2, 4}};
    System.out.println("test3: " + Arrays.deepEquals(createGrid(2,2), arr3));
    int [][] arr4 = {{0, 1, 3}, {4, 6, 9}, {11, 14, 18}};
    System.out.println("test4: " + Arrays.deepEquals(createGrid(3,3), arr4));

  }

}