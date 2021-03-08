const culculator = {
    plus: function(a,b){
        return a + b
    },
    minus: function(a,b){
        return a - b
    },
    devide: function(a,b){
        return a / b
    },
}

const plus = culculator.plus(5,5);
const minus = culculator.minus(5,5);
const devide = culculator.devide(5,5);

console.log("plus"+plus);
console.log("minus"+minus);
console.log("divide"+devide);