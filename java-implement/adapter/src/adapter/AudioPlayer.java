package adapter;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaadapter;
    @Override
    public void play(String type, String fileName) {
//        mp3,不需要适配
        if (type.equalsIgnoreCase("Mp3")){
            System.out.println("playing mp3 file. Name:" + fileName);
        }
        else if (type.equalsIgnoreCase("Mp4")
                ||type.equalsIgnoreCase("vlc")){
            mediaadapter = new MediaAdapter(type);
            mediaadapter.play(type,fileName);
        }
        else{
            System.out.println("Invalid media." + type + "format is not supported!");
        }
    }
}
