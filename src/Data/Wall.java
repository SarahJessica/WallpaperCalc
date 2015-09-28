package Data;

/**
 * Created by leives01 on 21/09/15.
 */
public class Wall {

    public int wallWidth;
    public int wallHeight;

    public Wall(int wallWidth, int wallHeight){
        this.wallWidth = wallWidth;
        this.wallHeight = wallHeight;
    }

    public int totalArea(){
        int totalArea = wallHeight * wallWidth;
            return totalArea;
    }

}
