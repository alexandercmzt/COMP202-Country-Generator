public class Country {
  
  //these varibales are meant for the country
  private String name;
  private City[] cities;
  private boolean connected;
  
  public Country(String country, int n, int maxDist)
  {
    name = country;
    cities = new City[n]; //standard constructor
    connected = false;
    
    for (int i = 0; i < n; i++)
    {
      cities[i] = new City(); //populate country with cities
    }
    
    for(int i = 0; i < cities.length; i++)
    {
      cities[i].setNeighbours(maxDist, cities);
    }
  }
  
  public void setConnectivity()
  {
    cities[0].explore(); //checks which cities are connected
    
    for(int i = 0; i < cities.length; i++)
    {
      if (!cities[i].getExplored())//checks if any couldnt be explored
      {
        connected = false;
        break;
      }
      else
      {
        connected = true;
      }
    }
  }
  
  public City[] getCity()
  {
    return cities;
  }
  
  public String getName()
  {
    return name;
  }
  
  public boolean isConnected()
  {
    setConnectivity();
    return connected; 
  }
}
