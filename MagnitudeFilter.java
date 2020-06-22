
/**
 * Write a description of class MagnitudeFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MagnitudeFilter implements Filter
{
    private double magmax; 
    private double magmin;
    
    public MagnitudeFilter(double min,double max) { 
        magmin = min;
        magmax = max;
    } 

    public boolean satisfies(QuakeEntry qe) { 
        return qe.getMagnitude() >= magmin && qe.getMagnitude() <= magmax; 
    } 

    public String getName(){
        return "MagnitudeFilter";
    }
}