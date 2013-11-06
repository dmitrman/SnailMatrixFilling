package domain;



public class MatrixComputations implements Computable{

  public int[][] fillSnailMatrix(int size) {
	/** it's supposed that a matrix is squarable */
	/* contains of 4 cycles
	 * current cycle is 1
	 * 
	 */
    int cycle = 1;
    /** a number to fill in a matrix */
    int num = 1;
    /* matrix */
    int[][] matrix = new int[size][size];
    /* number of row */
    int i = matrix.length - 1;
    /* number of column */
    int j = matrix.length - 1;
	/* smechedie */
    int w = 0;   
    
    while (num < size*size + 1) {
      if (cycle == 1) {
        if (j > -1 + w) {
        	matrix[i][j] = num;
        	num++;
        	j--;
        } else {
        	cycle = 2;
        	j++;
        	i--;
        }
      }
      
      if (cycle == 2) {
          if (i > -1 + w) {
          	matrix[i][j] = num;
          	num++;
          	i--;
          } else {
          	cycle = 3;
          	i++;
          	j++;
          }
        }
      
      if (cycle == 3) {
          if (j < matrix.length - w) {
          	matrix[i][j] = num;
          	num++;
          	j++;
          } else {
          	cycle = 4;
          	j--;
          	i++;
          }
        }
      
      if (cycle == 4) {
          if (i < matrix.length - w-1) {
          	matrix[i][j] = num;
          	num++;
          	i++;
          } else {
          	cycle = 1;
          	i--;  
          	j--;
          	w++;           
          }
        } 
               
    }
    System.out.println("============================");
    for (int r = 0; r < matrix.length;r++) {
 		  for (int t = 0;t < matrix.length;t++) {
 			  System.out.print(matrix[r][t]+" ");
 		  }
 		  System.out.println();
    } 
    return matrix;
  }

}
