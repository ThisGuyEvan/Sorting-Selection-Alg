import java.util.Arrays;

class Main {
  public static void main(String[] args){
    //Default
    int[] sort = {9,7,5,10,23,1,2};
    System.out.println("Default: " + Arrays.toString(sort));
    //MAX
    maxArray(sort);
    System.out.println("Max: " + Arrays.toString(sort));
    //MIN
    minArray(sort);
    System.out.println("Min: " + Arrays.toString(sort));
    
  }

  public static void maxArray(int[] x){
    int min = 0;  //Default index.

    for (int i = 0; i < x.length; i++){ //Cycles x(Len)
    //Changes to next arrayVal each time loop iterates.
        min = i; 
        // j +1 to compare the next val to min val.
        for(int j = i +1; j < x.length; j++){
          if(x[j] < x[min]){ //Checks if larger.
            min = j; //Sets index
          }
        }
        int hold = x[i]; //Holds value
        x[i] = x[min];  //Changes to new pos of max.
        x[min] = hold;  //Changes to the the pos of smaller.
    }
  }

  public static void minArray(int[] x){
    int min = 0;  //Default index.

    for (int i = 0; i < x.length; i++){ //Cycles x(Len)
    //Changes to next arrayVal each time loop iterates.
        min = i; 
        // j +1 to compare the next val to min val.
        for(int j = i +1; j < x.length; j++){
          if(x[j] < x[min]){ //Checks if smaller.
            min = j; //Sets index
          }
        }
        int hold = x[i]; //Holds value
        x[i] = x[min];  //Changes to new pos of min.
        x[min] = hold;  //Changes to the the pos of larger.
    }
  }





}