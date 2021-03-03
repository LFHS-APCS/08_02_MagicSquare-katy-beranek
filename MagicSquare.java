
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
      for (int i = 0; i < array.length; i++){
        if (array.length != array[i].length)
          return false;
        }

       int sum = addRow(0);

       if (!checkRows(sum))
          return false;
       if (!checkCols(sum))
          return false;
       if (!checkDiagonals(sum))
          return false;
    
       return true;
    }

  private int addCol(int col) {
    int sum = 0;
    for (int row = 0; row < array.length;row++){
      sum = sum + array[row][col];
    }
    return sum;
  }

  private int addRow(int row) {
    int sum = 0;
      for (int col = 0; col < array[row].length; col++){
        sum = sum + array[row][col];
      }
    return sum;
  }

  public boolean checkCols(int sum) {
    for (int i  = 0; i < array[0].length; i++){
      int c = addCol(i);
       if (c != sum)
        return false;
    }
      return true;
  }

  public boolean checkRows(int sum) {
    for (int i = 0; i < array.length; i++){
      int r = addRow(i);
       if (r != sum)
         return false;
    }
      return true;
  }

  private int diaDown(){
    int sum = 0;
    for (int i = 0; i < array.length; i++){
      sum += array[i][i];
    }
    return sum;
  }

  private int diaUp() {
    int sum = 0;
    for (int row = 0, col = array.length-1; row < array.length; row++, col--){
      sum += array[row][col];
    }
    return sum;
  }

  public boolean checkDiagonals(int sum) {
    int sum0 = diaDown();
      if (sum != sum0)
        return false;
    int sum1 = diaUp();
      if (sum != sum1)
        return false;
    return true;
  }

    
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
