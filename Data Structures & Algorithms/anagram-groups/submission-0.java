class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

       Map<String, List<String>> hashMap= new HashMap<>();
       List<List<String>> result= new ArrayList<>();

        for( String str: strs){

             char [] charArray= str.toCharArray();
             Arrays.sort(charArray);

            String sorted = new String(charArray);
            
            List<String> list = hashMap.getOrDefault(sorted, new ArrayList());
            list.add(str);

            hashMap.put(sorted,list);
            
        }
         for(Map.Entry<String, List<String>> map: hashMap.entrySet()){
           
              result.add(map.getValue());
        }
      return result;  
    }
}
