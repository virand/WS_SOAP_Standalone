package tmp;

import javax.xml.ws.Endpoint;

/**
 * Created by artemsolonin on 18.05.2017.
 */
public class App {
    public static void main(String[] args)
    {
        String url="http://0.0.0.0:8080/PlaceService";
        // Ддя запуска веб-сервисов используется класс Endpoint со статическим методом publish
        Endpoint.publish(url, new PlaceWebService());
    }
}
