package P8_BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
       int[] integers =  {-1,0,3,5,9,12};
        System.out.println(search(integers,9) );
        System.out.println(search(integers,2) );

    }

    public static  int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (nums[middle] == target) {
                return middle;
            }

            if( nums[middle] > target) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }

        }

        return -1;
    }

    // Time Complexity: O(logn)
        // Each iteration of the loop reduces the search space by half.
        //This results in a logarithmic time complexity
        // because the number of iterations needed to narrow down the search to a single element
        // is proportional to the logarithm of the size of the input array.

    //Space Complexity: O(1)
        //The space complexity is constant because the algorithm only uses
        // a fixed amount of extra space for variables (start, end, middle), regardless of the input size.
}
