public class Grid
{
    private static final int SIZE = 10;
    int[][] pixels = new int[SIZE][SIZE];
    

    /**
     * Flood fill, starting with the given row and column.
    */
    public void floodfill(int row, int col)
    {
        int count = 1;
        for(int i = row ; i>0; i--){

            for(int j = row ; j>0; j--){
                pixels[i][j] = count;
                count++;
            }

        }
    }

    @Override
    public String toString()
    {
        String r = "";
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
                r = r + String.format("%4d", pixels[i][j]);
            r = r + "\n";
        }
        return r;
    }
}
