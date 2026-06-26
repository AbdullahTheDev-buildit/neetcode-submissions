class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> indexArray = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            for(int j=0; j<nums.length; j++){
                if(i != j && nums[i] + nums[j] == target){
                    if(indexArray.contains(i)){
                        if(indexArray.contains(j)){
                        continue;
                         }else{
                            indexArray.add(j);
                         }
                    }else{
                        indexArray.add(i);
                    }
        
                }
            }
        }
        
        return indexArray.stream().mapToInt(Integer::intValue).toArray();
    }
}
