package Lesson14_HomeWork;

public class Loops {
    static void showTime() {
        HOURS:
        for (int h = 0; h < 6; h++) {
            MINUTES:
            for (int m = 0; m < 60; m++) {
                if (h > 1 && m % 10 == 0) {
                    break HOURS;
                }

                SECONDS:
                for (int s = 0; s < 60; s++) {
                    if (s * h > m) {
                        continue MINUTES;
                    }
                    System.out.println(h + " " + m + " " + s);
                }
            }

        }
    }

    public static void main(String[] args) {
//       showTime();

/*        FIRST: for(int i = 0; i < 5; i++){                   ** EXPLANATION OF "continue MINUTES" in showTime Method **
            SECOND: for (int s = 0; s < 10; s++){
                    if (s == 3) {
                        continue FIRST;
                    }
                System.out.println(i + " " + s);
            }

        }*/


/*        int h = 0;
        do {
            int m = 0;
            while (m < 2) {
                System.out.println(h + " " + m);
                m++;
            }
            h++;
        } while (h < 3);*/
    }
}

