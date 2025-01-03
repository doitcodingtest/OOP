public class Main {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        YoutubePlayer youtubePlayer = new YoutubePlayer();
        User user= new User();
        user.setPlayer(musicPlayer);
        user.play();
        user.setPlayer(youtubePlayer);
        user.play();
    }
}