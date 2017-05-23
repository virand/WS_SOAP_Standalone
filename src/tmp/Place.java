package tmp;

/**
 * Created by artemsolonin on 18.05.2017.
 */
public class Place
{
    private int id;
    private String name;
    private String description;
    private String city;
    private String address;

    public Place(int aId, String aName, String aDescription, String aCity, String aAddress)
    {
        id=aId;
        name=aName;
        description=aDescription;
        city=aCity;
        address=aAddress;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public String getCity(){
        return city;
    }

    public String getAddress()
    {
        return address;
    }

    public void setName(String aName){
        name=aName;
    }

    public void setDescription(String aDescription)
    {
        description=aDescription;
    }

    public void setCity(String aCity)
    {
        city=aCity;
    }

    public void setAddress(String aAddress)
    {
        address=aAddress;
    }
}
