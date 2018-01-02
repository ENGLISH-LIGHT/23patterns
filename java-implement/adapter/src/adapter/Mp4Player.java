package adapter;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        System.out.println("playing Mp4 file. Name："+fileName);
    }

    @Override
    public void playVlc(String fileName) {
//        实现接口
    }
}
