public class Datoer_Gabriel {

    public static void main(String[] args) {
        int år, månede, dag = 0;
        år = 9;
        månede = 11;
        dag = 15;
        switch (månede) {
            case 12:
                if (dag==31){
                    år++;
                    månede=1;
                    dag=1;
                }
                else {
                    dag++;
                }
                break;
            case 2:
                if (år%4==0 && år%400==0 && dag==29){
                    dag=1;
                    månede++;
                }
                else if (år%4==0 && år%100==0 && dag==28){
                    dag=1;
                    månede++;
                }
                else if (år%4==0 && år%100!=0 && dag==29){
                    dag=1;
                    månede++;
                }
                else if (år%4!=0 && dag==28){
                    dag=1;
                    månede++;
                }
                else {
                    dag++;
                }
                break;
            case 1,3,5,7,8,10:
                if (dag==31){
                    dag=1;
                    månede++;
                }
                else {
                    dag++;
                }
                break;
            case 4,6,9,11:
                if (dag==30){
                    dag=1;
                    månede++;
                }
                else {
                    dag++;
                }
                break;
        }
        System.out.println(dag + "/" + månede + "/" + år);
    }


}
