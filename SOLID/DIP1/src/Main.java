public class Main {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        User user= new User();
        user.setMusicPlayer(musicPlayer);
        user.play();
    }
}