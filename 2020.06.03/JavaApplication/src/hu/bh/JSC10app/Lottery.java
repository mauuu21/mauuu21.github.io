package hu.bh.JSC10app;

import java.util.Arrays;

public class Lottery {

    public static void lottery() {
        int[] lottery = new int[5];
        int i = 0;
        while (i < 5) {
            int randomNumber = (int) (Math.random() * 90 + 1);
            boolean ok = true;
            for (int j = 0; j < i; j++) {
                if (lottery[j] == randomNumber) {
                    ok = false;//nem ok.
                }
            }
            if (ok) {
                lottery[i++] = randomNumber;
            }
        }
        Arrays.sort(lottery);
        for (int j : lottery) {
            System.out.print(j + " ");
        }
        System.out.println();

    }

}
