package net.elpuig;

public class Ordenador {

    private Usb usb;

    public void setUsb(Usb usb) {
        this.usb = usb;
    }

    public Ordenador() {
        System.out.println("Se ha creado una instancia de " + this.getClass());
    }

    public void show() {
        System.out.println(usb.info());
    }
}
