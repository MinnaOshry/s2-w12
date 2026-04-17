
    import java.util.*;

public class BestPath{
  private int[][] nodes;
  private ArrayList<Integer> totals = new ArrayList<Integer>();  
  private int rows=3;
  private int cols=3;

  public BestPath(){
      nodes = new int[rows][cols];
      for(int row=0; row < rows; row++)
        for(int col=0; col < cols; col++)
          nodes[row][col] = col;

      path(0,0,0);
      System.out.println(totals);
      System.out.println(bestPathMostPoints());

  }

  //YOU DO THIS
  public void path(int total, int n, int k){
      
  }

  //find max in algorithm
  public int bestPathMostPoints(){
    return 0;
  }
}


