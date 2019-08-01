package wektor;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Porownywarka {

    public boolean porownaj(Wektor wektor1, Wektor wektor2){

        double a = wektor1.getA();
        double b = wektor1.getB();
        double c = wektor1.getC();

        double d = wektor2.getA();
        double e = wektor2.getB();
        double f = wektor2.getC();

        double dlugosc1 = sqrt(pow(a,2)+pow(b,2)+pow(c,2));
        double dlugosc2 = sqrt(pow(d,2)+pow(e,2)+pow(f,2));


        if (dlugosc1 > dlugosc2){
            return true;
        }
        return false;
    }
}
