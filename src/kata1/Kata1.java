package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        Calendar date;
        date= GregorianCalendar.getInstance();
        date.set(1997, 4, 01);
        
        Person person= new Person("Juan José", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
    
}
