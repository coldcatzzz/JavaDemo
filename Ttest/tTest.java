package Ttest;

import java.util.Arrays;

public class tTest {
    public static void main(String[] args) {
        Person[] ps = new Person[]{
                new Person("Baa", 66),
                new Person("Cuba", 888),
                new Person("Abbr", 99)
        };

        Arrays.sort(ps);
        System.out.println(Arrays.toString(ps));
    }
}

class Person implements Comparable<Person>{
    private String name;
    private int score;

    public Person(String name, int score){
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Person other){
        if (this.score > other.score){
            return 1;
        }else if (this.score < other.score){
            return -1;
        }else {
            return 0;
        }
    }

    public String toString(){
        return this.name + "," + this.score;
    }
}

