class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            
            // İlk elemanı belirle
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                
                int target = -nums[i]; // Hedef, -nums[i] olsun
                
                int left = i + 1, right = nums.length - 1; // Sol ve sağ işaretçiler
                
                while (left < right) {
                    int sum = nums[left] + nums[right];
                    
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        
                        // Tekrar eden elemanları atla
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        
        return result;
    }
        public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = solution.threeSum(nums);
        System.out.println(result);
    }

}



