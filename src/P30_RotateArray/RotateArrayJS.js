// Solution 1 Brute Force
// TC: O(n * k) - O(n) per rotation(shifting all elements) × k rotations; SC: O(1)

function rotate(arr, steps) {
    let length = arr.length;
    steps = steps % length;

    // Remove last and add to front
    for (let i = 0; i < steps; i++) {
        arr.unshift(arr.pop());
    }

    return arr;
}

// Solution 2 Array Copy
// TC: 0(n), SC: O(n)
function rotate2(arr, steps) {

    let length = arr.length;
    // ensure that k is always within a valid range (0 ≤ k < length).
    // If k is exactly n, the array remains the same, so we don't need to rotate at all.
    steps = steps % length;  // Handle cases where k > length

    if (length === 1 || steps === 0) return arr; // No need to rotate if k = 0 or length = 1

    const rotated = [];
    let start = length - steps;

    for (let i = start ; i < length; i++) {
        rotated.push(arr[i]);
    }

    for (let i = 0 ; i < length - steps; i++) {
        rotated.push(arr[i]);
    }

    // Copy back to nums (modifies in place)
    for (let i = 0; i < length; i++) {
        arr[i] = rotated[i];
    }

    return arr;
}

// Solution 3 Reverse and swap
// TC: 0(n), SC: O(1)
function rotate3(arr, steps) {
    let length = arr.length;
    steps = steps % length;

    // Reverse the whole array
    reverse(arr, 0, length - 1);

    // Reverse first steps elements
    reverse(arr, 0, steps - 1);

    // Reverse rest of elements
    reverse(arr, steps, length - 1);

    return arr;
}

function reverse(arr, left, right) {
    while(left < right) {
        // Swap
        [arr[left] , arr[right]] = [arr[right], arr[left]];
        left++;
        right--;
    }
}

// Tests

let nums = [1,2,3,4,5,6,7], k = 3 //  [5,6,7,1,2,3,4]
let nums2 = [-1,-100,3,99], k2 = 2 // [3,99,-1,-100]
let nums3 = [-1], k3 = 2 // [-1]
let nums4 = [1,2], k4 = 3 // [2, 1]

console.log('Solution 1');
console.log(rotate([1,2,3,4,5,6,7], 3));
console.log(rotate([-1,-100,3,99], 2));
console.log(rotate([-1], 2));
console.log(rotate([1,2], 3));


console.log('Solution 2');
console.log(rotate2(nums, k));
console.log(rotate2(nums2, k2));
console.log(rotate2(nums3, k3));
console.log(rotate2(nums4, k4));


console.log('Solution 3');
console.log(rotate3([1,2,3,4,5,6,7], 3));
console.log(rotate3([-1,-100,3,99], 2));
console.log(rotate3([-1], 2));
console.log(rotate3([1,2], 3));
