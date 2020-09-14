public class Myndig {

        public static void main (String[] args) {

            int alder;

            java.util.Scanner brugerinput = new java.util.Scanner(System.in);

            alder = brugerinput.nextInt();

            if (alder >= 18) System.out.println("Du er myndig");
            else {

                System.out.println("oof");

            }

        }

    }


