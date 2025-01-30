import adapter.AudioPlayer;

public class DemoAdapter {
        public static void main(String[] args) {
            // создаем обект класса AudioPlayer
            AudioPlayer audioPlayer = new AudioPlayer();
            // воиспроизаодим формат mp3 через audioPlayer
            audioPlayer.play("mp3", "song.mp3");
            // воиспроизаодим формат mp4 через audioPlayer
            audioPlayer.play("mp4", "video.mp4");
            // воиспроизаодим формат vlc через audioPlayer
            audioPlayer.play("vlc", "movie.vlc");
            // воиспроизаодим формат avi через audioPlayer
            audioPlayer.play("avi", "myMovie.avi");


        }
    }
