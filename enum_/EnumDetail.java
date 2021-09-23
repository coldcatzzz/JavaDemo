package enum_;

public class EnumDetail {
    public static void main(String[] args) {
        Music music = Music.CLASSIC_MUSIC;
        music.play();
    }
}

class A{}

interface MusicPlay{
    void play();
}

enum Music implements MusicPlay{
    CLASSIC_MUSIC;

    @Override
    public void play() {
        System.out.println("playing music...");
    }
}
