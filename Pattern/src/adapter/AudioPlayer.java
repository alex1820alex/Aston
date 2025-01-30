package adapter;

public class AudioPlayer implements MediaPlayer {

    Adapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        // Воспроизведение mp3 формата напрямую
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        }
        // Воспроизведение других форматов с помощью адаптера
        else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new Adapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
