// Find first recurring element

// Solution 1 Brute Force
// TC: O(n²), SC: O(1)
function firstRecurring(arr) {
    for (let i = 1; i < arr.length; i++) {
        for (let j = i - 1; j >= 0; j--) {
            if (arr[i] === arr[j]) {
                return arr[i];
            }
        }
    }
    return undefined;
}


// Solution 2 Hash map
// TC: O(n), SC: O(n)
function firstRecurring2(arr) {
    const map = {};

    for (let i = 0; i < arr.length; i++) {
        let element = arr[i];

        if(map[element] != undefined) {
            return element;
        }

        map[element] = true;
    }
    return undefined;

}




// Test
let nums = [2, 5, 1, 2, 3, 5, 1, 2, 4];
let nums2 = [2, 1, 1, 2, 3, 5, 1, 2, 4];
let nums3 = [2, 3, 4, 5];

console.log(firstRecurring(nums)); // 2
console.log(firstRecurring(nums2)); // 1
console.log(firstRecurring(nums3)); // undefined

console.log(firstRecurring2(nums)); // 2
console.log(firstRecurring2(nums2)); // 1
console.log(firstRecurring2(nums3)); // undefined
