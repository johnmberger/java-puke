public class Calc {

  public int x;
  public int y;

  public Calc(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int sum() {
    return this.x + this.y;
  }

  public int diff() {
    return this.x - this.y;
  }

  public int product() {
    return this.x * this.y;
  }

  public int quotient() {
    return this.x / this.y;
  }

  public static void main(String[] args) {
    Calc testCalc = new Calc(5,6);
    System.out.println(testCalc.product());
  }
}
