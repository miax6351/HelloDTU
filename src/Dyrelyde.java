import java.util.Scanner;

public class Dyrelyde {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String input = "";
        String animal = "";


        while (true) {
            input = s.next();
            animal = input;

        switch (animal) {

            case "Dog": System.out.println("Woof");
                break;

            case "Cat": System.out.println("Meow");
                break;

            case "Fish": System.out.println("Blob");
                break;

            case "Cow": System.out.println("Muh");
                break;

            case "Lion": System.out.println("Roar");
                break;

            case "Sheep": System.out.println("Bah");
                break;

            case "Duck": System.out.println("Quack");

            case "Stop": break;

            default: System.out.println("?");

        }
            if (input.compareTo("Stop") == 0) {
                break;
            }


        }

    }
}
