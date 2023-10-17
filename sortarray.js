function sortDescending(arr) {
    return arr.sort((a, b) => b - a);
}

let arr = [4, 2, 7, 1, 5, 3, 6];
let sortedArr = sortDescending(arr);
console.log(sortedArr);
