import java.util.*;

public class Towers{
  public ArrayList<Integer> left=new ArrayList<Integer>();
  public ArrayList<Integer> middle=new ArrayList<Integer>();
  public ArrayList<Integer> right=new ArrayList<Integer>();
  private int numDiscs=5;

  public Towers(){
      for(int x = numDiscs; x > 0; x--){
          left.add(x);
      }
      solve(numDiscs, left, middle, right);
      printTowers(numDiscs);
  }

  //YOU::you write this -- simple ArrayList move the last item of l to r
  private void moveFromLeftToRight(ArrayList<Integer> l,  ArrayList<Integer> r){
    if (!l.isEmpty()){
      r.add( l.get(l.size()-1));
      l.remove(l.size()-1);
    }

  }

  //YOU:: recursive moment -- base case? recursive case?
  public void solve(int discs, ArrayList<Integer> l, ArrayList<Integer> m, ArrayList<Integer> r){
      if(discs == 1){
        moveFromLeftToRight(l, r);
      } else{
        solve(discs-1, l, r, m);
        moveFromLeftToRight(l, r);
        solve(discs-1, m, l, r);
        
        //recursive moment -- this three lines! and BIG HINT: two recursive calls to this method solve
        //as well as another call to moveFromLeftToRight
      }     
  }


  public void printTowers(int numDiscs){
    String leftT="",rightT="",middleT="";
    for(int x = 0; x < numDiscs; x++){
          if(x < left.size())
            leftT += left.get(x) + ", ";
          if(x < right.size())
            rightT += right.get(x) + ", ";
          if(x < middle.size())
            middleT += middle.get(x) + ", ";
    }
    System.out.println("Left: " + leftT);
    System.out.println("Middle: " + middleT);
    System.out.println("Right: " + rightT);

  }
}