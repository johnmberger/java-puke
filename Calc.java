public class Calc {

  public float x;
  public float y;

  public Calc(float x, float y) {
    this.x = x;
    this.y = y;
  }

  public float sum() {
    return this.x + this.y;
  }

  public float diff() {
    return this.x - this.y;
  }

  public float product() {
    return this.x * this.y;
  }

  public float quotient() {
    return this.x / this.y;
  }

  public static void main(String[] args) {
    Calc testCalc = new Calc(10,6);
    System.out.println(testCalc.sum());
  }
}
