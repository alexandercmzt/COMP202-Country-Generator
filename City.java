import java.util.Random;

public class City {
 private static String[] namePrefixes = { "Chiguiro", "Maracas", "Raccoon",
  "Glass", "Iron", "Spring", "Winter", "Autumn", "hump", "Godel",
  "Recursion", "slavery", "PowPow", "LOL", "Cheese", "MasterRoshi", "Pants", "Dork",
  "Cat", "Liszt", "alelaelalealelalelalelae", "Cool", "Ennui", "Tortoise", "Mudkip", "Tonkatsu", 
  "Rainy", "Slump", "Tortilla", "Ur mum", "Ajiaco", "HAEHAHEHAE" };
 
 private static String[] nameSuffixes = { "ville", "vale", "_City", "titz", "ton",
   "b0ss", "ricefields", "land", "ia", "furt", "grad", "lia", "stadt", "stan" };
  
  private String name = "";
  private Vector2D pos;
  private City[] neighbours; 
  
  private boolean explored = false;
  
  public City() 
  {
    Random rand = new Random();   
    name += namePrefixes[rand.nextInt(namePrefixes.length)];
    name += nameSuffixes[rand.nextInt(nameSuffixes.length)];
    pos = new Vector2D (rand.nextInt(151), rand.nextInt(151));              //random name and coordinates
  }
  
  public double distanceBetween(City index)
  {
    return pos.distance(index.getPos()); //gets distance to other cities from the city
  }
  public void setNeighbours(double maxDist, City[] cities)
  {
    neighbours = new City[cities.length -1]; //cant be its own neighbor
    
    int j = 0;
    
    
    for(int i = 0; i < cities.length; i++)
    {
      if(this.distanceBetween(cities[i]) < maxDist && this != cities[i])
      {
        neighbours[j] = cities[i];
        j++;
      }
    }
  }
  
  public void explore() {
    explored = true;
    
    for (int i = 0; i < neighbours.length; i++)
    {
      if(neighbours[i] != null && !neighbours[i].getExplored())   //prevents infinite loop
      {
        neighbours[i].explore();
      }
    }
  }
  
  //here are the getter methods
  public Vector2D getPos()
  {
    return pos;
  }
  
  public String getName() {
    return name;
  }
  
  public City[] getNeighbours(){
    return neighbours;
  }
  
  public boolean getExplored() 
  {
    return explored;
  }
}

