package introduction;

public class Variables {

    public static void main(String[] args) {

        int age = 12;
        String name = "Raphael";

        // Rules for Naming Variables
        //
        int numberOfGoals = 0;

        // boolean variables

        boolean isAdult = true;
        boolean hasChildren = true;


        // String Concatenation

        String amigos = "1";
        String code = "1";
        String result = amigos + code;
        String result2 = amigos + " + " + code;
        System.out.println(result);
        System.out.println(result2);

        String firstName = "Raphael";
        String lastName = "Ekpei";

        String fullName = firstName + lastName;
        System.out.println(fullName);


    // String Methods

        String brand = "Amigoscode";
    // toUpperCase
        System.out.println(brand.toUpperCase());

    // toLowerCase
        System.out.println(brand.toLowerCase());

    // substring
        System.out.println(brand.substring(6));
        System.out.println(brand.substring(0, 6));

    // isEmpty
    // to check whether a string has a character or not
        System.out.println(" ".isEmpty()); // it's not empty - we have white space character
        System.out.println(brand.isEmpty());

    // isBlank
    // to check whether a string contains a character other than white space
        System.out.println(" ".isBlank());

    // trim
    // removes all trailing whitespace characters from a string
        System.out.println("  a  ");
        System.out.println("  a  ".trim());

    }




}
