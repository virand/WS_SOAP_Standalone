package tmp;

/**
 * Created by artemsolonin on 23.05.2017.
 */
public class PlaceServiceFault {
    private static final String DEFAULT_MESSAGE = "placeName cannot be null or empty";

    protected String message;
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public static PlaceServiceFault defaultInstance() {
        PlaceServiceFault fault = new PlaceServiceFault();
        fault.message = DEFAULT_MESSAGE;
        return fault;
    }
}