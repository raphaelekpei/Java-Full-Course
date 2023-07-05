package passByValue.passByValueWithObjects;

public class PersonApplication {

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 18);

        Person person2 = person1;

        System.out.println(person1.getName() + " " + person1.getAge());
        System.out.println(person2.getName() + " " + person2.getAge());

        person2 = new Person("John", 20);
        person2.setName("Mark");

        System.out.println(person2.getName() + " " + person2.getAge());
        System.out.println(person1.getName() + " " + person1.getAge());
    }
}
