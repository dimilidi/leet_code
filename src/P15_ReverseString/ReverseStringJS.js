// Example
let string = 'Hi there';

// Solution 1 String Concatenation
// Strings are immutable in JavaScript,
// so reversedStr += str.charAt(i); creates a new string at each iteration, making it inefficient for long strings.

function reverse(str) {
    // check input
    if(!str || str.length < 2 || typeof str !== 'string' ){
        return 'Invalid input.';
    }

    let reversedStr = '';
    for (let i = str.length - 1; i >= 0; i--) {
        reversedStr += str.charAt(i);
    }
    return reversedStr;
}

console.log(reverse(string));


// Solution 2
// Build array and join array back to string
function reverse2(str) {
    // check input
    if(!str || str.length < 2 || typeof str !== 'string' ){
        return 'Invalid input.';
    }

    const arr = [];
    for (let i = str.length - 1; i >= 0; i--) {
        arr.push(str[i]);
    }
    return arr.join('');
}

console.log(reverse2(string));


// Solution 3 using JavaScript’s built-in methods
function reverseOptimized(str) {
    if (!str || str.length < 2 || typeof str !== 'string') {
        return 'Invalid input.';
    }
    return str.split('').reverse().join('');
}

console.log(reverseOptimized(string));


// Solution 4 arrow function
const reverse3 = str => str.split('').reverse('').join('');

console.log(reverse3(string));


// Solution 5 spread operator
const reverse4 = str => [...str].reverse('').join('');

console.log(reverse3(string));
