package trójkąt;

public class PorownywanieTrojkatow {

    public void wiekszePole(Trojkat trojkat1, Trojkat trojkat2) {

        double pole1 = trojkat1.pole();
        double pole2 = trojkat2.pole();

        if (pole1 > pole2) {
            System.out.println(pole1);
        }
        if (pole2 > pole1) {
            System.out.println(pole2);
        }
        if (pole1 == pole2) {
            System.out.println("Pola są równe i wynoszą: " + pole1);
        }
    }

    public void wiekszePoleTab(Trojkat[] trojkaty) {

        double tmp = 0;

        for (int i = 0; i < trojkaty.length; i++){
            if (tmp < trojkaty[i].pole()){
                tmp = trojkaty[i].pole();
            }
        }
        System.out.println(tmp);

    }
}
