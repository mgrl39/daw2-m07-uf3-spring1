package net.elpuig;

import org.springframework.stereotype.Component;

@Component("pendrive")
public class Pendrive implements Usb {
    @Override
    public String info() {
        return "Pendrive";
    }
}
