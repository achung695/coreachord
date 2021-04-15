package edu.brown.cs.student.coreachord.CoreaApp;

public class HighDiversityGenerator implements MatrixGenerator {
  private TransitionMatrix tmat;
  private double[][] matrix2d;
  private final int numqualities = CoreaApplication.Quality.values().length;
  private final int numroots = CoreaApplication.Root.values().length;

  public HighDiversityGenerator() {
    tmat = new TransitionMatrix();
    matrix2d = tmat.getTransitionMatrix();
  }

  @Override
  public TransitionMatrix generateMatrix() { // implement this method with logic, rules
    for (int i = 0; i < numqualities * numroots; i++) { // row
      double[] currrow = matrix2d[i]; // current row to fill
      for (int j = 0; j < numqualities * numroots; i++) { // col
        double currentry = matrix2d[i][j]; // current "entry" to fill
        // some logic
      }
    }
    return null;
  }
}