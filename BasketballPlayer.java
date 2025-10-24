import java.util.ArrayList;

public class BasketballPlayer {
    private int shoeSize;
    private String name;
    private String shoeModel;


    public BasketballPlayer(int shoeSize, String name, String shoeModel){
        this.shoeSize = shoeSize;
        this.name = name;
        this.shoeModel = shoeModel;
    }
    public int getShoeSize() {
        return shoeSize;
    }

    public String getName() {
        return name;
    }

    public String getShoeModel() {
        return shoeModel;
    }

    public static ArrayList<BasketballPlayer> filterBasketballPlayerByShoeModel(ArrayList<BasketballPlayer> players, String shoeModel) {
        ArrayList<BasketballPlayer> matchedPlayers = new ArrayList<>();

        for (BasketballPlayer player : players) {
            if (player.getShoeModel().equalsIgnoreCase(shoeModel)) {
                matchedPlayers.add(player);
            }
        }

        return matchedPlayers;
    }

    public static ArrayList<BasketballPlayer> filterBasketballPlayerByShoeSize(ArrayList<BasketballPlayer> players, int shoeSize){
        ArrayList<BasketballPlayer> matchedPlayers = new ArrayList<>();

        for (BasketballPlayer player : players) {
            if (player.getShoeSize() == shoeSize){
                matchedPlayers.add(player);
            }
        }
        return matchedPlayers;
    }
}
