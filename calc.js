// functional
console.log('----- functional -----');

function add(a, b) {
  return a + b;
}
console.log(add(10, 5));

function sub(a, b) {
  return a - b;
}
console.log(sub(10, 5));

function mult(a, b) {
  return a * b;
}
console.log(mult(10, 5));

function div(a, b) {
  return a / b;
}
console.log(div(10, 5));

// oop
console.log('----- oop -----');

var Calculator = function(a, b) {
  this.a = a;
  this.b = b;
}

Calculator.prototype.add = function() {
  return this.a + this.b;
}

Calculator.prototype.sub = function() {
  return this.a - this.b;
}

Calculator.prototype.mult = function() {
  return this.a * this.b;
}

Calculator.prototype.div = function() {
  return this.a / this.b;
}

var testCalc = new Calculator(5, 5);

console.log(testCalc.add());
console.log(testCalc.sub());
console.log(testCalc.mult());
console.log(testCalc.div());
