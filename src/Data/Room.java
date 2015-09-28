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
    protected Wallpaper wallpaperChoice;

    public Room(String roomName, List<Wall> walls, Wallpaper wallpaperChoice){
        this.roomName = roomName;
        this.walls = walls;
        this.wallpaperChoice = wallpaperChoice;
    }

    public int roomWallArea(){
        int roomWallArea =0;
        for (Wall wall : walls){
            roomWallArea += wall.totalArea();
        }
        return roomWallArea;
    }

    @Override
    public String toString(){
        return "room with walls "  + walls.size();
    }


    public int noOfRolls(){
        int noOfRolls = 0;
        int noOfRollsPerWall = 0;
        for (Wall wall : walls){
            double lengthOfWallpaperPerWall = 0;

            lengthOfWallpaperPerWall += Math.ceil((wall.wallWidth / wallpaperChoice.width) * (wall.wallHeight + wallpaperChoice.patternRepeat) );
//            System.out.println(lengthOfWallpaperPerWall);
            if (wallpaperChoice.rollLength < lengthOfWallpaperPerWall){
              noOfRollsPerWall++;
          }
            noOfRolls += noOfRollsPerWall;

        }
        System.out.println( noOfRolls + " rolls of " + wallpaperChoice.name + " are required to paper " + this.roomName + ".");
        return noOfRolls;
    }


}
