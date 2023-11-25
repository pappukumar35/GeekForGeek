Predict the column{
    int columnWithMaxZeros(int arr[][], int N)
    {
        // code here 
        int count=0;
        int data=-1;
        int max=-1;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                if(arr[j][i]==0)
                {
                    count++;
                }
            }
            if(count>0  && count>data){
                data=count;
                max=i;
            }
            count=0;
        }
        return max;
    }
}