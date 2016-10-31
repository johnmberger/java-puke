class Calc {
  add(x, y) {
    return x + y;
  }
  subtract(x, y) {
    return x - y;
  }
  multiply(x, y) {
    return x * y;
  }
  divide(x, y) {
    return x / y;
  }
}

const calculator = new Calc();

console.log(calculator.subtract(4, 5));
