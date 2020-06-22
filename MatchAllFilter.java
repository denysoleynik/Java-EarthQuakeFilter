import java.util.*;
import edu.duke.*;
/**
 * Write a description of class MatchAllFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MatchAllFilter implements Filter 
{
    ArrayList<Filter> f;
    
    
    public MatchAllFilter() { 
        f = new ArrayList<Filter>();

}

public void addFilter(Filter fil) {
    f.add(fil);
}

public boolean satisfies(QuakeEntry qe) { 
        
    for (Filter fe : f) {
        if (!fe.satisfies(qe)) {
            return false;
        }
    }
    return true;
}
public String getName(){
        ArrayList<String> name = new ArrayList<String>();
                    String New = "";
        for (Filter fef : f) {
            name.add(fef.getName());
        }
        for (int i=0; i< name.size(); i++){
            New = New + " " + name.get(i);
        }
        return New ;
       }

    }

