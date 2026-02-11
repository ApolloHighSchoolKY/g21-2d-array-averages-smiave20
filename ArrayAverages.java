import java.util.Arrays;

public class ArrayAverages{
  
  //Instanance Field
  //Most often pravite, not in this situation though.
  int[][] ray;

  //Modified Constructer, seen by not having a return type.
  //Methods have return types.
  public ArrayAverages(int[][] rayray)
  {
    ray = rayray;
  }

  public void rowAverages()
  {
    double avrg = 0;

    //ROW MAJOR ORDER
    for(int row = 0; row < ray.length; row++)
    {
      //ray[row].length will go through the columns within the row’s length.
      for(int col = 0; col < ray[row].length; col++)
        avrg += ray[row][col];
        avrg /= col;
    }

    System.out.println("The average of row " + row + " is : " + avrg);

    //MUST ALWAYS CLEAR OUT THE VARIABLE AT THE END OF THESE LOOPS.
    avrg = 0;
  }

  public void columnAverages(){
    //COLUMN MAJOR ORDER
    //Take each column and go through all of the rows
    //Top down and Left to Right
    double avrg = 0;

    //Ray[0].length is used to read the columns
    //But also we know the length of the Arrays in the big Array.
    for(int col = 0; col < ray[0].length; col++)
    {
      //ray[row].length will go through the columns within the row’s length.
      for(int row = 0; row < ray.length; row++)
        avrg += ray[row][col];
        avrg /= row;
    }
      System.out.println("The average of column " + col + "is: " + avrg);

    //MUST ALWAYS CLEAR OUT THE VARIABLE AT THE END OF THESE LOOPS.
      avrg = 0;
  }

  public void arrayAverage()
  {
    //Restraint wanted double
    double avrg = 0;

    //ROW MAJOR ORDER

    //Will go through each row
    for(int row = 0; row < ray.length; row++)
    {
      //Will go through each column
      //ray[row].length will go through the columns within the row’s length.
      for(int col = 0; col < ray[row].length; col++)
        //The sum is calculated for the Array
        avrg += ray[row][col];
    }

    //The sum divided by the length (the total number of terms), (calculating the average: add all it up, and divide by what is there)
    //(* ray[0].length) multipling the total amount of columns in the Array to the answer.
    //Because the answer is the total rows in the Big Array. (how many single Arrays that are in the Big Array)
    System.out.println(avrg / ray.length * ray[0].length);
  }
  public String toString(){
    for(int row=0; row<ray.length; row++)
    {
      //Prints out each row of the 2D Array called (ray)
      System.out.println(Arrays.toString(ray[row]));
    }
    return "";
  }
}
