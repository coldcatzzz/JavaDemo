package oop.Task;

public class Task8 {
    public static void main(String[] args) {
        Music music = new Music();
        music.play();
        music.getInfo();
    }
}

class Music{
    String name = "七里香";
    int times = 300;

    public void play(){
        System.out.println("playing...");
    }

    public void getInfo(){
        System.out.println(this.name);
        System.out.println(this.times);
    }
}
