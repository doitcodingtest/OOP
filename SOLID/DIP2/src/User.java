public class User {
    private MusicPlayer musicPlayer;
    private YoutubePlayer yutubePlayer;
    private String type;

    public void setMusicPlayer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
        type = "music";
    }

    public void setYutubePlayer(YoutubePlayer yutubePlayer) {
        this.yutubePlayer = yutubePlayer;
        type = "yutube";
    }

    public void play() {
        if (type.equals("music")) {
            musicPlayer.play();
        } else {
            yutubePlayer.play();
        }
    }

}
