class Solution {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("dizinin boyutunu girin:");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("dizinin elemanlarını girin:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
            }

                    System.out.println(maxArea(nums));
    }


public static int maxArea(int[] height) {
    int maxArea = 0;
    int left = 0;
    int right = height.length - 1;

    while (left < right) {
        int width = right - left;
        int minHeight = Math.min(height[left], height[right]);
        maxArea = Math.max(maxArea, width * minHeight);

        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }

    return maxArea;
}

}
