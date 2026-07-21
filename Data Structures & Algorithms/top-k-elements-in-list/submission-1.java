class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> hashMap= new HashMap<>();

        for( int i=0; i< nums.length; i++){
           hashMap.put(nums[i], hashMap.getOrDefault(nums[i],0)+1);
        }

        List<Integer>[] bucket= new List[nums.length+1];

        for( int num: hashMap.keySet()){
           int frequency= hashMap.get(num);
           if(bucket[frequency]==null){
               bucket[frequency]= new ArrayList<>();
           }

           bucket[frequency].add(num);

        }

        int [] res= new int[k];
        int counter=0;

        for(int i= bucket.length-1; i>=0 && counter<k; i--){

            if(bucket[i]!=null){

                for( int n: bucket[i]){
                    res[counter++]= n;

                    if(counter==k){
                        break;
                    }
                }
            }

        }


     return res;   
    }
}
