const { fdatasyncSync } = require('fs');

const input = require('fs')
    .readFileSync(process.platform === 'linux' ? '/dev/stdin' : './input.txt')
    .toString()
    .trim();
// .split('\n');

const [N, K, T] = input.split(' ');

console.log(Math.floor(T/K) + " " + T%K)