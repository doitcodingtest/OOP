public class Main {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        YoutubePlayer youtubePlayer = new YoutubePlayer();
        User user= new User();
        user.setMusicPlayer(musicPlayer);
        user.play();
        user.setYutubePlayer(youtubePlayer);
        user.play();
    }
}