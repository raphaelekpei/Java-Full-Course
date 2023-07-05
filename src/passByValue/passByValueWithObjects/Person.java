package passByValue.passByValueWithObjects;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


        /*
    In this example, an array numbers is passed to the changeFirstElement method.
    Arrays are objects in Java, and when you pass an object as an argument, you are actually passing the reference to the object.
    Therefore, any modifications made to the object inside the method will be reflected in the original object outside the method.
     */

}
