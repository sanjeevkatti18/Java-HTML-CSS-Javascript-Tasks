function reverseWords(sentence) {
    return sentence.split(' ').map(word => word.split('').reverse().join('')).join(' ');
}

let reversedSentence = reverseWords("This is a sunny day");#you can give any input here.
console.log(reversedSentence);
