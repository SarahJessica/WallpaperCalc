package Data;

/**
 * Created by leives01 on 21/09/15.
 */
public class Wallpapers {

    public boolean inStock;
    public String name;
    public int width; //cm
    public int rollLength; // cm
    public int patternRepeat; //cm


    public Wallpapers(boolean inStock, String name, int width, int patternRepeat, int rollLength){
        this.inStock = inStock;
        this.name = name;
        this.width = width;
        this.patternRepeat = patternRepeat;
    }
}
