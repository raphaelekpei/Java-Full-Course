package introduction;

public class TypeChecking {

    public static void main(String[] args){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        String brand = "Raphael";
//        int brand = "Raphael"; this will not work because the value is a sequence of characters
        // If you try to run this code, it will not run because there is a compilation error
        System.out.println(brand);

    }
}
