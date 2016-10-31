public class Person {

  public String name;
  public int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String name() {
    return this.name;
  }

  public int age() {
    return this.age;
  }

  public static void main(String[] args) {
    Person student = new Person("John", 25);
    System.out.println(student.name() + " is " + student.age() + " years old");
  }

}
