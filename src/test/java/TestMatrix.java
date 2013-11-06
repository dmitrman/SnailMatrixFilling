import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import domain.MatrixComputations;


public class TestMatrix {

   @Before
   public void doBeforeEachTestCase() {
	   
   }

   @Test
   public void testOddSize() {
	 MatrixComputations matrixComputation = new MatrixComputations(); 
	 int[][] result = matrixComputation.fillSnailMatrix(5);
	 int[][] expected = new int[][]{ {9, 10, 11, 12, 13},
                                     {8, 21, 22, 23, 14},
                                     {7, 20, 25, 24, 15},
                                     {6, 19, 18, 17, 16},
                                     {5, 4, 3, 2, 1} };	
	 assertArrayEquals(getOneDimMatrix(result), getOneDimMatrix(expected));	 
   }
   
   @Test
   public void testEvenSize() {
	 MatrixComputations matrixComputation = new MatrixComputations(); 
	 int[][] result = matrixComputation.fillSnailMatrix(4);
	 int[][] expected = new int[][]{ {7, 8, 9, 10},
                                     {6, 15, 16, 11},
                                     {5, 14, 13, 12},
                                     {4, 3, 2, 1} };	
	 assertArrayEquals(getOneDimMatrix(result), getOneDimMatrix(expected));	 
   }
   
   @Test
   public void testOneSize() {
	 MatrixComputations matrixComputation = new MatrixComputations(); 
	 int[][] result = matrixComputation.fillSnailMatrix(1);
	 int[][] expected = new int[][]{ {1} };                                     
	 assertArrayEquals(getOneDimMatrix(result), getOneDimMatrix(expected));	 
   }
   
   @Test
   public void testZeroSize() {
	 MatrixComputations matrixComputation = new MatrixComputations(); 
	 int[][] result = matrixComputation.fillSnailMatrix(0);
	 int[][] expected = new int[][]{};	
	 assertArrayEquals(getOneDimMatrix(result), getOneDimMatrix(expected));	 
   }
   
   @Test(expected = NegativeArraySizeException.class)
   public void testNegativeSize() {
	 MatrixComputations matrixComputation = new MatrixComputations(); 
	 int[][] result = matrixComputation.fillSnailMatrix(-1);
	 int[][] expected = new int[][]{};	
	 assertArrayEquals(getOneDimMatrix(result), getOneDimMatrix(expected));	 
   }
   
   private int[] getOneDimMatrix(int[][] twoDimMatrix) {
    int MAS_LENGTH = twoDimMatrix.length;
    int[] result = new int[MAS_LENGTH * MAS_LENGTH];
    int index = 0;
  	  
    for (int i = 0;i < MAS_LENGTH;i++) {
      for (int j = 0;j < MAS_LENGTH;j++) {
        result[index] = twoDimMatrix[i][j]; 	
        index++;
      }
    }    
    return result;
  }
   
}
