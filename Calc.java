public class Calc {
  public int a;
  public int b;

  public Calc(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public int add() {
    return this.a + this.b;
  }

  public int sub() {
    return this.a - this.b;
  }

  public int mult() {
    return this.a * this.b;
  }

  public int div() {
    return this.a / this.b;
  }

  public static void main(String[] args) {
    Calc math = new Calc(10, 5);
    System.out.println(math.add());
    System.out.println(math.sub());
    System.out.println(math.mult());
    System.out.println(math.div());
  }
}
