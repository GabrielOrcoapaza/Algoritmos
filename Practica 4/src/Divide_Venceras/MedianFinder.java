/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Divide_Venceras;

/**
 *
 * @author Gabriel
 */
public class MedianFinder {

    public double findMedian(int[] nums) {
        int n = nums.length;
        if (n % 2 == 0) {
            return (findKthLargest(nums, n / 2) + findKthLargest(nums, n / 2 - 1)) / 2.0;
        } else {
            return findKthLargest(nums, n / 2);
        }
    }

    private int findKthLargest(int[] nums, int k) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int pivotIndex = partition(nums, left, right);
            if (pivotIndex == k) {
                return nums[pivotIndex];
            } else if (pivotIndex < k) {
                left = pivotIndex + 1;
            } else {
                right = pivotIndex - 1;
            }
        }
        return -1; // should never happen
    }

    private int partition(int[] nums, int left, int right) {
        int pivotValue = nums[right];
        int i = left;
        for (int j = left; j < right; j++) {
            if (nums[j] >= pivotValue) {
                swap(nums, i, j);
                i++;
            }
        }
        swap(nums, i, right);
        return i;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}