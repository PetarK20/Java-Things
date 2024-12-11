public class boat {

    public static boolean vulk = false;
    public static boolean koza = false;
    public static boolean zelka = false;
    public static boolean a = false;

    public static void main(String[] args) {

        System.out.println("Koza, vulk i zelka na lewiq brqg(all false)");

        while (!end()) {
            move_koza();
            conflictOnLeft();
            conflictOnRight();
            String v_state = vulk ? "right" : "left";
            String k_state = koza ? "right" : "left";
            String z_state = zelka ? "right" : "left";

            System.out.println("Vulk: " + v_state + " Koza: " + k_state + " Zelka: " + z_state);
            move_vulk();
            conflictOnLeft();
            conflictOnRight();
            v_state = vulk ? "right" : "left";
            k_state = koza ? "right" : "left";
            z_state = zelka ? "right" : "left";

            move_vulk();
            conflictOnLeft();
            conflictOnRight();
            System.out.println("Vulk: " + v_state + " Koza: " + k_state + " Zelka: " + z_state);
            move_Zelka();
            v_state = vulk ? "right" : "left";
            k_state = koza ? "right" : "left";
            z_state = zelka ? "right" : "left";
            conflictOnLeft();
            conflictOnRight();
            v_state = vulk ? "right" : "left";
            k_state = koza ? "right" : "left";
            z_state = zelka ? "right" : "left";
            System.out.println("Vulk: " + v_state + " Koza: " + k_state + " Zelka: " + z_state);
            move_vulk();
            System.out.println("Vulk: " + v_state + " Koza: " + k_state + " Zelka: " + z_state);

        }
        String v_state = vulk ? "right" : "left";
        String k_state = koza ? "right" : "left";
        String z_state = zelka ? "right" : "left";
        System.out.println("Programata e uspeshna. Final:");
        System.out.println("Vulk: " + v_state + " Koza: " + k_state + " Zelka: " + z_state);
    }

    public static boolean end() {

        return vulk && koza && zelka;
    }

    public static void conflictOnLeft() {
        if (!vulk && !koza && !zelka && !koza) {
            vulk = true;

        } else if (!koza && zelka) {
            zelka = !zelka;

        }

    }

    public static void conflictOnRight() {
        if (vulk && koza && !zelka) {
            vulk = true;
        } else if (koza && !vulk && zelka) {
            zelka = true;

        }

    }

    public static void move_vulk() {
        if (vulk) {
            vulk = !vulk;

        } else {
            vulk = true;

        }

    }

    public static void move_koza() {
        if (koza) {
            koza = false;

        } else {
            koza = true;

        }

    }

    public static void move_Zelka() {
        if (zelka) {
            zelka = !zelka;

        } else {
            zelka = true;

        }
    }
}

/**
 * 1. L(V,Z) -> R(K)
 * 2. R -> L
 * 3. L -> R(Z)
 * 4. R -> L(K)
 *
 *
 *
 *
 *
 *
 */