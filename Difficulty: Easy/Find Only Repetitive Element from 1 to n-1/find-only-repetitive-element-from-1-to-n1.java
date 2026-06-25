class Solution {
    public int findDuplicate(int[] arr) {
        // code here
        HashSet<Integer> map=new HashSet<>();
        
        for(int i=0;i<arr.length;i++)
        {
            if(map.contains(arr[i]))
            {
                return arr[i];
            }
            map.add(arr[i]);
        }
        return -1;
    }
}