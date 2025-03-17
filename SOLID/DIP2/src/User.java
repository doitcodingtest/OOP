public class User {
    private MusicPlayer musicPlayer;
    private YoutubePlayer youtubePlayer;
    private String type;

    public void setMusicPlayer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
        type = "music";
    }

    public void setYoutubePlayer(YoutubePlayer youtubePlayer) {
        this.youtubePlayer = youtubePlayer;
        type = "youtube";
    }

    public void play() {
        if (type.equals("music")) {
            musicPlayer.play();
        } else {
            youtubePlayer.play();
        }
    }

}
