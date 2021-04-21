package com.lxwmmd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication

public class MyoneApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run =SpringApplication.run(MyoneApplication.class, args);

        String[] names = run.getBeanDefinitionNames();
//        for (String name : names) {
//            System.out.println("name = " + name);
//        }
       /*
        Pet pet = run.getBean("tom", Pet.class);
        System.out.println("pet = " + pet);
        myconfig bean = run.getBean(myconfig.class);
       Staff staff =bean.getstaobj();

        System.out.println("staff = " + staff);
        System.out.println("staff.toString() = " + staff.toString());

        Staff staff1 = run.getBean("getstaobj", Staff.class);

        System.out.println(staff1.getPet()==pet);

        boolean pet1 = run.containsBean("getstaobj");
        System.out.println("pet1 = " + pet1);
*/

    }


}
