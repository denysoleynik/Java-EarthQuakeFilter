
/**
 * Write a description of class PhraseFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhraseFilter implements Filter {

    private String where;
    private String text;
    
    public PhraseFilter(String where2, String phrase){
        where = where2;
        text = phrase;
    }
    
    public boolean satisfies(QuakeEntry qe){
        if (where == "start") {
            if (qe.getInfo().startsWith(text)) {
                return true;
            }
        }
        if (where == "end") {
            if (qe.getInfo().endsWith(text)) {
                return true;
            }
        }
        if (where == "any") {
            if (qe.getInfo().contains(text)) {
                return true;
            }
        }
        return false;
    }
    public String getName(){
        return "Phrase Filter";
    }
}


