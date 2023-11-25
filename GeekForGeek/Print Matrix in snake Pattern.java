
{
    //Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][])
    {
        // code here 
         ArrayList<Integer> snakePattern = new ArrayList<>();
        int toAdd = 1;
        int col = 0;
        for(int row = 0; row < matrix.length; row++) {
            while(col != -1 && col != matrix[row].length) {
                snakePattern.add(matrix[row][col]);
                col += toAdd;
            }
            
            toAdd *= -1;
            col += toAdd;
        }
        
        return snakePattern;
    
    }
}