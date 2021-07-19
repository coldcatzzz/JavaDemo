package abc;

import java.lang.annotation.*;
import java.lang.reflect.Field;


public class Hello {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        person.check(person);
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Range{
    int min() default 0;
    int max() default 255;
}

class Person{
    @Range(min=1,max = 20)
    public String name;

    @Range(max = 10)
    public String city;

    void check(Person person) throws Exception{
        for (Field field:person.getClass().getFields()
             ) {
            Range range = field.getAnnotation(Range.class);
            if (range != null){
                Object value = field.get(person);
                if (value instanceof String){
                    String s = (String) value;
                    System.out.println(s);
                    if (s.length()<range.min() || s.length()>range.min()){
                        throw new IllegalArgumentException("Invalid field:" + field.getName());
                    }
                }
            }
        }
    }
}
