package Data;

/**
 * Created by leives01 on 21/09/15.
 */
public class Wallpapers {

    public boolean inStock;
    public String name;
    public int width;
    public int patternRepeat;


    public Wallpapers(boolean inStock, String name, int width, int patternRepeat){
        this.inStock = inStock;
        this.name=name;
        this.width=width;
    }
}
