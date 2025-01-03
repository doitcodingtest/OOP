public class User {
    private Player player;

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void play() {
        player.play();
    }

}
