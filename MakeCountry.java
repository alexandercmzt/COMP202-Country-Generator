public class MakeCountry {
  public static void main(String[] args){
    int numCities = 15;
    String countryName = "malexville";
    int maxDist = 50;
    
    StopWatch createCountry = new StopWatch();
    createCountry.startTime();
    Country malexville = new Country (countryName, numCities, maxDist);
    createCountry.stopTime();
    
    StopWatch connectCountry = new StopWatch();
    connectCountry.startTime();
    boolean connected = malexville.isConnected();
    connectCountry.stopTime();

    System.out.println("The country " + countryName + " is connected: " + malexville.isConnected());
    System.out.println("It took " + createCountry.getTimeMilli() + " milliseconds to create the country");
    System.out.println("It took " + connectCountry.getTimeMilli() + " milliseconds to determine the connectivity of the country");
    
    CountryMap map = new CountryMap(malexville.getCity(), malexville.getName());
  }
}
