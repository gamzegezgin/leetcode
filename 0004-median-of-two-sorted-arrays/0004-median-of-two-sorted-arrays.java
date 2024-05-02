import java.util.Scanner;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nums1 dizisinin boyutunu girin:");
        int n1 = scanner.nextInt();
        int[] nums1 = new int[n1];

        System.out.println("nums1 dizisinin elemanlarını girin:");
        for (int i = 0; i < n1; i++) {
            nums1[i] = scanner.nextInt();
        }

        System.out.println("nums2 dizisinin boyutunu girin:");
        int n2 = scanner.nextInt();
        int[] nums2 = new int[n2];

        System.out.println("nums2 dizisinin elemanlarını girin:");
        for (int i = 0; i < n2; i++) {
            nums2[i] = scanner.nextInt();
        }

        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println("Dizilerin ortanca değeri: " + median);
        scanner.close();
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] combinedArray = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, combinedArray, 0, nums1.length);
        System.arraycopy(nums2, 0, combinedArray, nums1.length, nums2.length);
        Arrays.sort(combinedArray);

        if (combinedArray.length % 2 == 0) {
            int midIndex1 = combinedArray.length / 2 - 1;
            int midIndex2 = combinedArray.length / 2;
            return (combinedArray[midIndex1] + combinedArray[midIndex2]) / 2.0;
        } else {
            int midIndex = combinedArray.length / 2;
            return combinedArray[midIndex];
        }
    }
}