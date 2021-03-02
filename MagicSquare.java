
/**
 * @author 
 * @version 
 */

public class MagicSquare
{
    /** The magic square array data */
    private int[][] array;

    /**
     * Constructs a MagicSquare object.
     * @param input the magic square array data.
     */
    public MagicSquare(int[][] input)
    {
        array = input;
    }

    /**
     * Tests to see if array is indeed a magic square
     * @return true if array is a magic square
     * @return false if the array is not a magic square
     */
    public boolean isMagicSquare()
    {
      boolean squareQues = false;
        if (addRow() == addCol()){
           squareQues = true;
        }
        return squareQues;   // complete this method
    }

  public void addRow() {
    double total = 0;
    for (int i = 0; i < array.length;i++){
      total = total + array[i];
    }
    return total;
  }

  public void addCol() {
    double total = 0;
    for (int r = 0; r < array.length; r++){
      for (int col = 0; col < array[r].length; col++){
        total = total + array[r][col];
      }
    }
    return total;
  }


/*
OTHER CODE 
    public int rowTotal (int[][] array, int row) 
    {
      int total = 0;
      for (int c = 0; c < array[row].length; c++){
         total += array[row][c];
      }
      return total;
    }

    public int colTotal (int[][]array, int col){
      int total = 0;
      for (int r = 0; r < array.length; r++){
        if (col < array[r].length){
          total += array[r][col];
        }
      }
      return total;
    }
   **/
    
    /**
     * Returns a String which represents the array.
     */
    public String toString()
    {
        String result = "";
        for(int r = 0; r < array.length; r++)
        {
            for(int c = 0; c <array[r].length; c++)
            {
                result += array[r][c];
                result += "\t";
            }
            result += "\n";
        }
        return result;
    }
}
