package Data;

/**
 * Created by leives01 on 21/09/15.
 */
public class Walls extends Rooms {

    public int wallWidth;
    public int wallHeight;

    public Walls(String roomName, int noOfWalls, int wallWidth, int wallHeight){
        super(roomName, noOfWalls);
        this.wallWidth = wallWidth;
        this.wallHeight = wallHeight;
    }



}
