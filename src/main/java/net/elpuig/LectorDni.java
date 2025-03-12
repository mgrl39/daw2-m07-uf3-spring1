package net.elpuig;

import org.springframework.stereotype.Component;

@Component("lector")
public class LectorDni implements Usb {
    @Override
    public String info() {
        return "LectorDni";
    }
}
