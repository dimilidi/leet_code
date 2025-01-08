package P22_ProductOfArrayExceptSelf;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int[] arr2 = {-1, 1, 0, -3, 3};

        int[] product = productExceptSelf(arr);
        for (int i : product) {
            System.out.print(i + " ");
        }

        System.out.println();

        int[] product2 = productExceptSelfConstantSpace(arr2);
        Arrays.stream(product2).forEach(i -> System.out.print(i + " "));

    }

    public static int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        left[0] = 1;
        right[nums.length - 1] = 1;

        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = left[i] * right[i];
        }
        return ans;
    }

    public static int[] productExceptSelfConstantSpace(int[] nums) {
        int n = nums.length;
        int[] productArray = new int[n];

        // Prefix product array
        int prefixProduct = 1;
        productArray[0] = 1; // first element is 1 because there's no prefix for the first element
        for (int i = 1; i < n; i++) {
            prefixProduct *= nums[i - 1];
            productArray[i] = prefixProduct;
        }

        // Suffix product
        int suffixProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            productArray[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }

        return productArray;
    }
}
