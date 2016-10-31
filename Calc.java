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

  public float quotient() {
    return this.x / this.y;
  }

  public static void main(String[] args) {
    Calc testCalc = new Calc(10,6);
    System.out.println(testCalc.product());
  }
}
