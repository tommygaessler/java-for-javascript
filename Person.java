// file name
public class Person {

  // declaring a varible name as a string
  public String name;
  public int age;

  // using this as a constructor
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // creates javascript like function, when calls refers to instance of Person
  public String name() {
    return this.name;
  }

  public int age() {
    return this.age;
  }

  public static void main(String[] args) {
    // creating instance of person named teacher passing in string and integer
    Person teacher = new Person("Tommy", 19);
    System.out.println("My name is " + teacher.name() + " I am " + teacher.age() + " years old!");
  }
}
