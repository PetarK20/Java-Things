import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<BasketballPlayer> players = new ArrayList<>();

        BasketballPlayer kobe = new BasketballPlayer(47, "Kobe", "Nike");
        BasketballPlayer lebron = new BasketballPlayer(45, "LeBron", "Nike");
        BasketballPlayer curry = new BasketballPlayer(44, "Curry", "Under Armour");
        BasketballPlayer durant = new BasketballPlayer(46, "Durant", "Nike");
        BasketballPlayer davis = new BasketballPlayer(48, "Davis", "Nike");
        BasketballPlayer harden = new BasketballPlayer(45, "Harden", "Adidas");
        BasketballPlayer lillard = new BasketballPlayer(43, "Lillard", "Adidas");
        BasketballPlayer irving = new BasketballPlayer(44, "Irving", "Nike");
        BasketballPlayer anthony = new BasketballPlayer(46, "Anthony", "Jordan");
        BasketballPlayer paulGeorge = new BasketballPlayer(47, "Paul George", "Nike");
        BasketballPlayer kawhi = new BasketballPlayer(45, "Kawhi", "New Balance");
        BasketballPlayer tatum = new BasketballPlayer(44, "Tatum", "Nike");
        BasketballPlayer embiid = new BasketballPlayer(46, "Embiid", "Nike");
        BasketballPlayer giannis = new BasketballPlayer(48, "Giannis", "Nike");
        BasketballPlayer westbrook = new BasketballPlayer(47, "Westbrook", "Jordan");

        players.add(kobe);
        players.add(lebron);
        players.add(curry);
        players.add(durant);
        players.add(davis);
        players.add(harden);
        players.add(lillard);
        players.add(irving);
        players.add(anthony);
        players.add(paulGeorge);
        players.add(kawhi);
        players.add(tatum);
        players.add(embiid);
        players.add(giannis);
        players.add(westbrook);

        ArrayList<BasketballPlayer> nikePlayers = BasketballPlayer.filterBasketballPlayerByShoeModel(players, "Nike");
        ArrayList<BasketballPlayer> fourtyFours = BasketballPlayer.filterBasketballPlayerByShoeSize(players, 44);

        System.out.println("Nike players:");
        for (BasketballPlayer player : nikePlayers) {
            System.out.println(player.getName() + " - " + player.getShoeModel() + " - " + player.getShoeSize());
        }
        System.out.println("Players with shoe size 44:");
        for (BasketballPlayer player : fourtyFours) {
            System.out.println(player.getName() + " - " + player.getShoeSize());
        }

    }
}
