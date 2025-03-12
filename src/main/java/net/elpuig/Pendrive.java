package net.elpuig;

import org.springframework.stereotype.Component;

@Component("pendrive")
public class Pen implements Usb {
    @Override
    public String info() {
        return "Pendrive";
    }
}
