// Solution 1 Two pointers
// TC: O(n + m) (where n and m are the lengths of the two arrays),

function mergeSortedArrays(arr1, arr2) {

    // Check input
    if (!Array.isArray(arr1) || !Array.isArray(arr2)) {
        return 'Invalid input: Both inputs must be arrays.';
    }

    if (arr1.length === 0 ) {
        return arr2;
    }

    if (arr2.length === 0 ) {
        return arr1;
    }

    let i = 0;
    let j = 0;
    const merged = [];


    while(arr1[i] || arr2[j]) {
        if(j >= arr2.length || (i < arr1.length && arr1[i] < arr2[j])) {
            merged.push(arr1[i]);
            i++;
        } else {
            merged.push(arr2[j]);
            j++;
        }
    }

    return merged;
}


// Solution 2 Built-in js methods
function mergeSortedArrays2(arr1, arr2) {
    return [...arr1, ...arr2].sort((a, b) => a - b);
}


// Test
const array1 = [0, 3, 4, 31];
const array2 = [4, 6, 30];

console.log(mergeSortedArrays(array1, array2));
console.log(mergeSortedArrays2(array1, array2));
