package presentation;

import domain.Computable;
import domain.MatrixComputations;

public class Main {

  public static void main(String[] args) {
	Computable mc = new MatrixComputations();
	int[][] mas = mc.fillSnailMatrix(4);	
	
	/*for (int i = 0; i < mas.length;i++) {
	  for (int j = 0;j < mas.length;j++) {
		  System.out.print(mas[i][j]+" ");
	  }
	  System.out.println();
	}*/
  }
  
}
