public class zad1 {
    public static void main(String[] args){
        // Разстоянието между обектите (км)

        double S1 = 100;
        double S2 = 200;

        // Скоростта по първия участък (км/ч)

        double V1 = 80;

        // Средна скорост (км/ч)

        double V = 240;

        /*Скоростта по втория участък, общото време за движение и времето
         * за движение по първия участък:*/

        double V2, T, t;

        // Общото време за движение (ч)

        T = (S1 + S2) / V;

        // Времето за движение по първия участък (ч)
        
        t = S1 / V1;

        // Скоростта на движение по втория участък (км/ч)

        V2 = T > t ? (S1 + S2) / (T - t) : -1;
        System.out.println("Скоростта по втория участък: ");
        // Резултат

        System.out.println(
            V2 < 0 ? "Това е невъзможно!" : V2 + " км/ч"
        );


    }
}