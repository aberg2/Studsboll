/**
 * Skapat augusti 2021-08-26 - 13:23
 * Studsboll
 * Skriven av coolingen
 */
public class Studsboll {
    public static void main(String[] args) {double deltaT = 0.1;
        double a = -9.82;
        double v = 0;
        double y = 10;
        double x = 10;
        double t = 0;
        double e = 0.9;

        for (int i = 0; i < 100; i++) {
            System.out.println(t + ";" + y);
            t += deltaT;
            if (y < 0) {
                v = -v;
            } else {
                v = updateVel(deltaT, a,v);
            }
            y = updatePos(deltaT, v, y);
        }
    }
    private static double updatePos(double deltaT, double v, double y) {
        y += v * deltaT;
        return y;
    }
    private static double updateVel(double deltaT, double a, double v){
        v += a + deltaT;
        return v;
    }
}
/*    double deltaT = 0.1;
    double a = -9.82;
    double v = 0;
    double y = 10;
    double x = 10;
    double t = 0;
    double e = 0.9;

        double v = v0*t*dt;

        for (int i = 0 ; i < 100 ; i++) {
            System.out.println(t + ";" + y);
            t += deltaT;
            if (y<0){
                v = -v;
            } else {
                v += a + deltaT;
            }
            y += v*deltaT
        }

        while (true) { // printa varje sekund
            long var = System.currentTimeMillis() / 1000;
            double var2 = var % 2;
            if (var2 == 1.0) {
                v0 += 1;
                t += 0.00001;
                System.out.println("[T=" + t + "]" + "[Y=" + v0 + "]");

            }
        }
    }
}*/
