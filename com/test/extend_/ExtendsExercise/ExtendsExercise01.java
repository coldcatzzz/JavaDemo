package com.test.extend_.ExtendsExercise;

public class ExtendsExercise01 {
    public static void main(String[] args) {
        Pc pc = new Pc("Intel",8,512,"华硕");
        pc.getInfo();

        NotePad notePad = new NotePad("Ibm",16,1024,"red");
        notePad.getInfo();
    }
}

