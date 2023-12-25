
class Solution

{

    //Function for finding determinant of matrix.

    static int determinantOfMatrix(int matrix[][], int n)

    {

        // code here 

        if(n==1)return matrix[0][0];

        int ans=0;

        

        //Traversing on 0th row of matrix

        for(int i=0;i<n;i++){

            

            int[][] second=new int[n-1][n-1]; // creating second submatrix whih excludes 0th row and the current 'i'th column therefore n-1 because we are excluding one row and one column and forming a submatrix

            

            //traversing all rows of second matrix from 1 to n-1

            for(int j=1;j<n;j++){

                int x=0;

                

                //traversing all columns of second matrix 

                for(int k=0;k<n;k++){

                    if(k==i)continue; // because we have to eliminate ith column

                    

                    second[j-1][x++]=matrix[j][k]; // adding remaining elements in the submatrix

                }

            }

            ans+=matrix[0][i]*determinantOfMatrix(second,n-1)*((i&1)==1?-1:1); // if 'i' is odd then multiply it by -1 and if is even then with +1

        }

        return ans;

    }

}