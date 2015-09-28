package Data;

//import java.util.ArrayList;
import java.util.List;

/**
 * Created by leives01 on 21/09/15.
 */
public class Room {
    protected String roomName;
    protected List<Wall> walls;
    protected int roomlWallArea;

    public Room(String roomName, List<Wall> walls){
        this.roomName = roomName;
        this.walls = walls;
    }

    public int roomWallArea(String roomName, List<Wall> walls){
        int roomWallArea =0;
        for (Wall wall : walls){
            roomWallArea += Wall.totalArea(wall.wallWidth, wall.wallHeight);
        }
        return roomWallArea;
    }

    @Override
    public String toString(){
        return "room with walls "  + walls.size();
    }


//    public static int noOfRolls(int totalArea, ){
//
//    }


}
