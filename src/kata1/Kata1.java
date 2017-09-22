package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person= new Person ("Juan José", new Date(97, 4, 01));
        System.out.println(person.getName() + " tiene " + person.getAge());
    }
    
}
