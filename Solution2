class Solution2{
    
    public static ArrayList<Integer> findCommon(Node root1, Node root2) {
        ArrayList<Integer> result = new ArrayList<>();
        findCommonNodes(root1, root2, result);
        return result;
    }

    private static void findCommonNodes(Node curnode1, Node curnode2, ArrayList<Integer> result) {
        if (curnode1 == null || curnode2 == null) {
            return;
        }
        
        findCommonNodes(curnode1.left, curnode2, result);
        if(isPresent(curnode2,curnode1.data))
        result.add(curnode1.data);
        findCommonNodes(curnode1.right,curnode2,result);
    }
    private static boolean isPresent(Node curnode, int data) {
        if(curnode == null)
        return false;
        
        if(data < curnode.data){
            return isPresent(curnode.left,data);
        }else if(data > curnode.data){
            return isPresent(curnode.right,data);
        }else{
            return true;
        }
    }
}