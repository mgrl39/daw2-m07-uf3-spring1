package net.elpuig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Ordenador ordenador = (Ordenador) context.getBean("ordenador");
        ordenador.show();
    }
}
