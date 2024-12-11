import java.util.Random;

public class boat2 {

    public static boolean wolf = false;
    public static boolean goat = false;
    public static boolean cabbage = false;
    public static int numberOfLoops = 0;
    
    public static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Starting state: Wolf, Goat, and Cabbage on the left.");

        
        while (!isComplete()) {
            randomMove();  
            checkConflicts(); 
            printState();  
            numberOfLoops++;
        }

        System.out.println("Success in "+numberOfLoops+" number of loops");
    }

    public static boolean isComplete() {
        return wolf && goat && cabbage;
    }

    public static void randomMove() {
        int moveChoice = random.nextInt(3);

        switch (moveChoice) {
            case 0:
                moveWolf();  
                break;
            case 1:
                moveGoat(); 
                break;
            case 2:
                moveCabbage(); 
                break;
        }
    }

    public static void moveWolf() {
        wolf = !wolf;
        System.out.println("Moved the Wolf to the " + (wolf ? "right" : "left"));
    }

    public static void moveGoat() {
        goat = !goat;
        System.out.println("Moved the Goat to the " + (goat ? "right" : "left"));
    }

    public static void moveCabbage() {
        cabbage = !cabbage;
        System.out.println("Moved the Cabbage to the " + (cabbage ? "right" : "left"));
    }

    public static void checkConflicts() {
        if (goat == cabbage && goat != wolf) {
            System.out.println("Conflict! The Goat would eat the Cabbage.");
        }
 
        if (wolf == goat && wolf != cabbage) {
            System.out.println("Conflict! The Wolf would eat the Goat.");
        }
    }

    public static void printState() {
        String wolfState = wolf ? "right" : "left";
        String goatState = goat ? "right" : "left";
        String cabbageState = cabbage ? "right" : "left";

        System.out.println("Current State: Wolf: " + wolfState + ", Goat: " + goatState + ", Cabbage: " + cabbageState);
    }
}