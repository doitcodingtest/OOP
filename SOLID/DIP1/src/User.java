public class User {
    private MusicPlayer musicPlayer;
    public void setMusicPlayer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }
    public void play() {
        musicPlayer.play();
    }
}
