package test;

import test.common.pojo.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Main {

    public static void main(String[] args) {
        Car<? extends Person> personCar =null;
        personCar = new Car<Son>();
        personCar.setPerson(new Daughter());

        SCar<? extends Person> personSCar =null;
        personSCar = new SCar<Daughter>();
//        personSCar.setPerson(new Daughter());
        Person person1 = personSCar.getPerson();

        SCar<? super Son> personSCar2 =null;
        personSCar2 = new SCar<Person>();
//        personSCar2.setPerson(new Person());
        Object person = personSCar2.getPerson();

        SCar<?> Daughter =new SCar<Daughter>();
        ((SCar<Daughter>)Daughter).setPerson(new Daughter());
       Person p = new Son();
       p.setName("name");
       p.whoami();
       System.out.println(p.getName());
    }
}
