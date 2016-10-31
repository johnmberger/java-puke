public class Person {

  public String name;

  public Person(String name) {
    this.name = name;
  }

  public String name() {
    return this.name;
  }

  public static void main(String[] args) {
    Person student = new Person("John");
    System.out.println(student.name());
  }

}
