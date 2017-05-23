package tmp;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by artemsolonin on 18.05.2017.
 */
@WebService(serviceName = "PlaceService")
public class PlaceWebService {
    @WebMethod(operationName = "getPlaces")
    public List<Place> getPlaces(@WebParam(name = "query", mode = WebParam.Mode.IN)String name, @WebParam(name = "description", mode = WebParam.Mode.IN)String description, @WebParam(name = "city", mode = WebParam.Mode.IN)String city, @WebParam(name = "address", mode = WebParam.Mode.IN)String address)
    {
        String query= String.format("SELECT * FROM places WHERE name='%s' OR description='%s' OR city='%s' OR address='%s'", name, description, city,address);
        MySQLDAO dao = new MySQLDAO();
        List<Place> places = dao.getPlaces(query);
        return places;
    }


    @WebMethod(operationName = "createPLace")
    public int createPlace(@WebParam(name = "name", mode = WebParam.Mode.IN)String name, @WebParam(name = "description", mode = WebParam.Mode.IN)String description, @WebParam(name = "city", mode = WebParam.Mode.IN)String city, @WebParam(name = "address", mode = WebParam.Mode.IN)String address)
    {
        String query = String.format("INSERT INTO places (`name`, `description`, `city`, `address`) VALUES('%s','%s','%s','%s')",name,description,city,address);
        MySQLDAO dao = new MySQLDAO();
        int id=dao.createPlace(query);
        return id;
    }

    @WebMethod(operationName = "changePlace")
    public int changePlace(@WebParam(name = "id", mode = WebParam.Mode.IN)int aId, @WebParam(name = "name", mode = WebParam.Mode.IN)String name, @WebParam(name = "description", mode = WebParam.Mode.IN)String description, @WebParam(name = "city", mode = WebParam.Mode.IN)String city, @WebParam(name = "address", mode = WebParam.Mode.IN)String address)
    {
        String query = String.format("UPDATE places SET `name`='%s',`description`='%s',`city`='%s',`address`='%s' WHERE id=%d",name,description,city, address, aId);
        MySQLDAO dao = new MySQLDAO();
        int id = dao.changePlace(query);
        return id;
    }

    @WebMethod(operationName = "deletePlace")
    public int deletePlace(@WebParam(name = "id", mode = WebParam.Mode.IN)int aId)
    {
        String query = String.format("DELETE FROM `places` WHERE id=%d", aId);
        MySQLDAO dao = new MySQLDAO();
        int id = dao.deletePlace(query);
        return id;
    }

}