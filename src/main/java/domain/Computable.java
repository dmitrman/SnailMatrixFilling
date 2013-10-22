package domain;

public interface Computable {
  
  /**
   * fill matrix in snail order beginning from 
   * right bottom corner 1, 2, 3, .. and so on
   * 
   * @param size - size of returning matrix
   */
  public int[][] fillSnailMatrix(int size);
  
  
}
