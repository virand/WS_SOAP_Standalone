package tmp;

import javax.xml.ws.WebFault;

/**
 * Created by artemsolonin on 23.05.2017.
 */
@WebFault(faultBean = "com.wishmaster.ifmo.ws.jaxws.errors.PersonServiceFault")
public class IllegalNameException extends Exception {

    private static final long serialVersionUID = -6647544772732631047L;
    private final PlaceServiceFault fault;
    public IllegalNameException(String message, PlaceServiceFault fault) {
        super(message);
        this.fault = fault;
    }
    public IllegalNameException(String message, PlaceServiceFault fault, Throwable cause) {
        super(message, cause);
        this.fault = fault;
    }
    public PlaceServiceFault getFaultInfo() {
        return fault;
    }
}