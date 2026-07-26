class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i=0;
        int j=0;
        int[] result= new int[m+n];

        for( int k=0; k< (m+n); k++){

            if( i< m && j<n){
                if(nums1[i]< nums2[j]){
                   result[k]= nums1[i];
                   i++;
                }
                else{
                   result[k]= nums2[j];
                   j++;
                }
            }
            else if( i< m){
                result[k]= nums1[i];
                i++;
            }
            else if(j< n){
               result[k]= nums2[j];
               j++;
            }
        }

        for (int k = 0; k < m + n; k++) {
         nums1[k] = result[k];
         }
    }
}