package adapter;

public class Main {

    public static void main(String[] args)
    {
        AudioPlayer player = new AudioPlayer();
        player.play("MP4","海阔天空");
        player.play("Vlc","喜欢你");
        player.play("Mp3","真的爱你");
        player.play("mv","谁伴我闯荡");
    }
}
