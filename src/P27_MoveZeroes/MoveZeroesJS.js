const nums = [0,1,0,3,12] // [1,3,12,0,0]
const nums2 = [0]; // [0]
const nums3 = [0, 1, 0]; // [0]

// Solution 1 Swap elements
// TC: O(N); SC: 0(1)
function moveZeroes(arr) {
    let lastNonZeroIndex = 0;

    for (let i = 0; i < arr.length; i++) {
        // If arr[i] is non-zero, swap it with arr[lastNonZeroIndex] and move lastNonZeroIndex forward.
        // If arr[i] is 0, do nothing (it stays in place for now).
        if (arr[i] !== 0) {
            [arr[lastNonZeroIndex], arr[i]] = [arr[i], arr[lastNonZeroIndex]];
            lastNonZeroIndex++;
        }
    }
    return arr;
}

// Solution 2 Move non-zero elements first, then fill zeros
// TC: O(N); SC: 0(1)
// more efficient by avoiding multiple swaps
function moveZeroes2(nums) {
    let insertPosition = 0;

    // Step 1: Move all non-zero elements forward
    for (let i = 0; i < nums.length; i++) {
        if (nums[i] !== 0) {
            nums[insertPosition] = nums[i];
            insertPosition++;
        }
    }

    // Step 2: Fill the rest of the array with zeros
    while (insertPosition < nums.length) {
        nums[insertPosition++] = 0;
    }
    return nums;
}

console.log(moveZeroes(nums));
console.log(moveZeroes(nums2));
console.log(moveZeroes(nums3));

console.log(moveZeroes2(nums));
console.log(moveZeroes2(nums2));
console.log(moveZeroes2(nums3));


