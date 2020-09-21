public class Sinus_Ny {

    public static void main(String[] args) {
        int periodsteps = 16;
        double step = Math.PI/periodsteps;
        int amplitude = 20;

        for (int x = 0; x < periodsteps; x++) {
            // y = 20 * sin (2pi * x), forstår ikke hvorfor step = 2pi/16 skal indsættes
            int y = (int) (amplitude * Math.sin(step*x));
            String space = "";

            for (int i = -amplitude; i <= amplitude; i++) {

                if (i == y) {
                    space += "*";
                } else if ( i == 0) {
                    space += "|";
                } else {
                    space += " ";
                }
                System.out.println(space);
            }
        }

    }



}
