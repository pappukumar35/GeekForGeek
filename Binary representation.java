class Binary representation
{
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k) {
        // Your code here
        return (n = n >> k) % 2 != 0;
    }

}