package adapter;

public class MediaAdapter implements MediaPlayer {
    //组合所有可用来转换的类
    AdvancedMediaPlayer advancedplayer;
    public MediaAdapter(String type){
        if(type.equalsIgnoreCase("mp4")){
            advancedplayer = new Mp4Player();
        }
        if (type.equalsIgnoreCase("vlc")){
            advancedplayer = new VlcPlayer();
        }
    }
    @Override
    public void play(String type, String fileName) {
        if (type.equalsIgnoreCase("mp4")){
            advancedplayer.playMp4(fileName);
        }
        if (type.equalsIgnoreCase("vlc")){
            advancedplayer.playVlc(fileName);
        }
    }
}
