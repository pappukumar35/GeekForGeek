class Sum
of XOR
of all pairs{
   
    // Function for finding maximum and value pair
    public long sumXOR(int arr[], int n) {
        long sum = 0;
        for (int i = 0; i < 32; i++) {
            long set_bits = 0, unset_bits = 0;
            for (int j = 0; j < n; j++) {
                if ((arr[j] & (1 << i)) != 0)
                    set_bits++;
                else
                    unset_bits++;
            }

            long possible_combinations = set_bits * unset_bits;
            sum += possible_combinations * (1 << i);
        }

        return sum;

    }

}
