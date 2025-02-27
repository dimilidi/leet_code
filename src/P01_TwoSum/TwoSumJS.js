nums = [2,7,11,15], target = 9 // [0,1]
nums2 = [3,2,4], target2 = 6 // [1,2]
nums3 = [3,3], target3 = 6 // [0,1]

// Solution 1  (Brute Force - O(n²))
// TC: O(n2)
function twoSum(arr, num) {
    for (let i = 0; i < arr.length - 1; i++) {
        for (let j = i + 1; j < arr.length; j++) {
            let sum = arr[i] + arr[j];

            if(sum === num) {
                return [i, j];
            }
        }
    }
}

console.log(twoSum(nums, target));
console.log(twoSum(nums2, target2));
console.log(twoSum(nums3, target3));

// Solution 2 (O(n) Hash Map)
// TC: O(n)
function twoSum2(arr, num) {
    const seen = {}; // Stores { value: index }

    for (let i = 0; i < arr.length; i++) {
        let complement = num - arr[i];

        if (seen.hasOwnProperty(complement)) {
            return [seen[complement], i];
        }

        seen[arr[i]] = i;
    }
}


console.log(twoSum2(nums, target));
console.log(twoSum2(nums2, target2));
console.log(twoSum2(nums3, target3));
