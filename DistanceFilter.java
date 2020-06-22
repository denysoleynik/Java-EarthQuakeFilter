
/**
 * Write a description of class DistanceFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DistanceFilter implements Filter {

    private double maxd;
    private Location location;
    
    public DistanceFilter(double lat, double lon, double max){
        maxd = max;
        location = new Location(lat,lon);
    }
    
    public boolean satisfies(QuakeEntry qe){
        return qe.getLocation().distanceTo(location) <= maxd;
    }
    
    public String getName(){
        return "DistanceFilter";
    }
}
