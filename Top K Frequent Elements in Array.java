public class Top
K Frequent
Elements in Array
{
    class Solution {
    public int[] topK(int[] nums, int k) {
        //map to store number and its frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0) + 1);    
        }
        
        // max heap to store the number according to their frequency
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            //prioritize larger number, if frequencies are equal 
            if(map.get(a) == map.get(b)){
                return b-a;
            }
            
            return map.get(b) - map.get(a);
        });
    
        for(int num: map.keySet()){
            pq.add(num);
        }
        
        //gettting the first k values from the priority queue    
        int output[] = new int[k];
        for(int i = 0; i<k; i++){
            output[i] = pq.poll();
        }
        
        return output;
    }   
}
}
