// Solution 1 Kadane's Algorithm
// TC: O(n); SC: O(1)
function maxSubarray(arr) {
    let maxSum = arr[0];
    let currSum = arr[0];

    for (let i = 1; i < arr.length; i++) {
        currSum = Math.max(arr[i], currSum + arr[i]);
        maxSum = Math.max(maxSum, currSum);
    }

    return maxSum;
}


// Solution 2 Brute Force (O(n²))
function maxSubarray2(arr) {
    let maxSum = arr[0]; // Initialize with the first element as the maximum sum

    // Loop through all possible subarrays
    for (let start = 0; start < arr.length; start++) {
        let currSum = 0;

        // Inner loop to consider all subarrays starting from 'start'
        for (let end = start; end < arr.length; end++) {
            currSum += arr[end]; // Add the current element to the sum
            maxSum = Math.max(maxSum, currSum); // Update maxSum if current sum is larger
        }
    }

    return maxSum;
}


// Solution 3 Divide and Conquer (recursion to find max(LeftSumSubarray, RightSumSubarray, CrossingSumSubarray))
// TC: O(n log n); SC: O(n log n)
function maxSubarray3(arr) {
    function helper(left, right) {
        // Base case
        if(left == right) return arr[left];

        const mid = Math.floor((left + right) / 2);

        // Find max subarray sum in left half
        const leftMax = helper(left, mid);
        // Find max subarray sum in right half
        const rightMax = helper(mid + 1, right);
        // Find max subarray sum that crosses the mid
        const crossMax = maxCrossingSum(left, mid, right);

        return Math.max(leftMax, rightMax, crossMax);
    }

    // Helper function to find max sum crossing the midpoint
    function maxCrossingSum(left, mid, right) {
        let leftSum = -Infinity;
        let sum = 0;

        for (let i = mid; i >= left; i--) {
            sum += arr[i];
            leftSum = Math.max(leftSum, sum);
        }

        let rightSum = -Infinity;
        sum = 0;
        for (let i = mid + 1; i <= right; i++) {
            sum += arr[i];
            rightSum = Math.max(rightSum, sum);
        }

        return leftSum + rightSum;
    }

    return helper(0, arr.length - 1);
}

// Test
const nums = [-2,1,-3,4,-1,2,1,-5,4]; // 6 (subarray [4,-1,2,1] )
const nums1 = [1]; // 1
const nums2 = [5,4,-1,7,8]; // 23, [5,4,-1,7,8]

console.log(maxSubarray(nums));
console.log(maxSubarray(nums1));  // Output: 1
console.log(maxSubarray(nums2));  // Output: 23 (subarray [5, 4, -1, 7, 8])

console.log(maxSubarray2(nums));   // Output: 6 (subarray [4, -1, 2, 1])
console.log(maxSubarray2(nums1));  // Output: 1
console.log(maxSubarray2(nums2));  // Output: 23 (subarray [5, 4, -1, 7, 8])

console.log(maxSubarray3([-2,1,-3,4,-1,2,1,-5,4]));  // Output: 6
console.log(maxSubarray3([5,4,-1,7,8]));  // Output: 23