class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] bucket = new List[nums.length + 1];
        
        for(int num: map.keySet()){
            
            int frequencey=map.get(num);
            if(bucket[frequencey] == null){

                bucket[frequencey]= new ArrayList();
                
            }
            bucket[frequencey].add(num);
        }
         
        int index=0;
        int [] res= new int[k];

        for( int i=bucket.length-1; i>0 && index<k; i--){
         
              if(bucket[i]!=null){

                for( int n: bucket[i]){
                    res[index++]= n;

                    if(index==k){
                        break;
                    }
                }
            }
        }
    return res;
    }
}