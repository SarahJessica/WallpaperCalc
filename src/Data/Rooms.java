package Data;

/**
 * Created by leives01 on 21/09/15.
 */
public class Rooms {
    protected String roomName;
    protected int noOfWalls;
    protected Walls walls;

    public Rooms(String roomName, int noOfWalls, int[][] wallAreas){
        this.roomName = roomName;
        this.noOfWalls = noOfWalls;
        this.walls = new Walls(width, height);
    }



}
