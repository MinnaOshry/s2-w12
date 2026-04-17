public class Parking {
  private int curbLength=5;//so it fits this number of cars if parked perfectly

  public Parking(){
    int numCars=park(curbLength);
    System.out.println(numCars);
    simulation(100);
  }
  
  //this counts the number of cars that will fit in the
  //curbLength if parked randomly
  //YOU -- WHAT IS THE BASE CASE? Recursive Case? 
  //HINT it is similar to the double recursive call we did in class
  public int park(double space){
     if( space <1)
      return 0;
    else {
        // pick a random position for the BACK of the car
        double backOfCarPosition = Math.random() * (space - 1);

        // space in front of the car
        double leftSpace = backOfCarPosition;

        // space behind the car
        double rightSpace = space - backOfCarPosition - 1;

        return 1 + park(leftSpace) + park(rightSpace);
    }

  }

  public void simulation(int times){
    int totalCars=0;
    for(int x = 0; x < times; x++){
        int c = park(curbLength);
        System.out.println(c); //this should never be greater than curbLength - yes?
        totalCars+=c;
    }
    System.out.println("Average Number of Cars: " + totalCars*1.0/times);
  }

}