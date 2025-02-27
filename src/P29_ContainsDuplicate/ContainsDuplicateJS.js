// Solution 1 Sorting
// TC: O(n log n) due to sorting.
function containsDuplicate(arr) {
    arr.sort((a, b) => a - b);

    for (let i = 0; i < arr.length - 1; i++) {
        if(arr[i] === arr[i + 1]) {
            return true;
        }
    }
    return false;
}

// Solution 2 Set
// TC: =(n), SC: O(n)
function containsDuplicate2(arr) {
    const set = new Set()
    for (let n of arr) {
        if(set.has(n)) return true
        set.add(n)
    }
    return false
}

// Solution 3 Set
function containsDuplicate3(arr) {
    const set = new Set(arr);
    return set.size !== arr.length;
}


// Test
const nums = [1,2,3,1] // true
const nums2 = [1,2,3,4] //  false
const nums3 = [1,1,1,3,3,4,3,2,4,2] // true

console.log(containsDuplicate(nums));
console.log(containsDuplicate(nums2));
console.log(containsDuplicate(nums3));

console.log(containsDuplicate2(nums));
console.log(containsDuplicate2(nums2));
console.log(containsDuplicate2(nums3));

console.log(containsDuplicate3(nums));
console.log(containsDuplicate3(nums2));
console.log(containsDuplicate3(nums3));
