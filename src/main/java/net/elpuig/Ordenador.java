package net.elpuig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ordenador {

    /* Ordenador el campo USB es una interfaz que tiene dos candidatos, el lector de DNI y el PENDRIVE.
    Como hay dos clases on sabe cual inectar.
    En estos casos se tiene que escirbir en cadacomponente @Component("texto")
    */

    // Con esto aunque sea una tonteria cambiando el qualifier podrias cambiar de Postgres a MongoDB.
    /*
    Las anotaciones estas ahorran mucho trabajo, cuando tienes un proyecto con un monton de cosas de Spring hacen magia
     */
    @Autowired
    @Qualifier("pendrive")
    private Usb usb;

    public void setUsb(Usb usb) {
        this.usb = usb;
    }

    // Aqui estamos haciendo inyeccion por constructor. Es mas comun la inyeccion por setter.
    /*
    public Ordenador(@Autowired @Qualifier("pendrive") Usb usb) {
        this.usb = usb;
        System.out.println("Se ha creado una instancia de " + this.getClass());
    }
    */

    public void show() {
        System.out.println(usb.info());
    }
}