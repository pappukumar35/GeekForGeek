public class Sum
of upper
and lower triangles
{
    

    //Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int matrix[][], int n) {
        // code here
        int m = matrix[0].length;
        int upperSum = 0;
        int lowerSum = 0;

        // Finding Upper traingle sum
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i <= j) {
                    upperSum += matrix[i][j];
                }
            }
        }
        // Finding Lower traingle sum
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i >= j) {
                    lowerSum += matrix[i][j];
                }
            }
        }
        // adding values in the Arraylist
        ArrayList<Integer> al = new ArrayList<>();
        al.add(upperSum);
        al.add(lowerSum);
        return al;
    }
}

}
