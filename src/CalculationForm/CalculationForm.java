package CalculationForm;

import Data.Wallpaper;
import Data.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leives01 on 21/09/15.
 */


public class CalculationForm {

    public static void main(String[] args){
        Wallpaper awningStripe = new Wallpaper(true, "Awning Stripe", 52, 0, 1010);
        Wallpaper countryRoses = new Wallpaper(true, "Country Roses", 51, 15, 1000);
        Wallpaper tropicalBirds = new Wallpaper(false, "Tropical Birds", 52, 60, 1000);
        Wallpaper polkaDot = new Wallpaper(true, "Polka Dot", 53, 3, 1050);

        List<Wall> livingRoomWalls = new ArrayList<>();
        livingRoomWalls.add(new Wall(440, 240));
        livingRoomWalls.add(new Wall(500, 240));
        livingRoomWalls.add(new Wall(440, 240));
        livingRoomWalls.add(new Wall(500, 240));

        List<Wall> bRoomWalls = new ArrayList<>();
        bRoomWalls.add(new Wall(1500, 260));
        bRoomWalls.add(new Wall(1000, 260));
        bRoomWalls.add(new Wall(500, 260));
        bRoomWalls.add(new Wall(500, 260));
        bRoomWalls.add(new Wall(500, 260));
        bRoomWalls.add(new Wall(1000, 260));

        Room livingRoom = new Room("Living Room", livingRoomWalls, countryRoses);
        Room breakfastRoom = new Room("Breakfast Room", bRoomWalls, awningStripe);
        System.out.println(livingRoom.toString());
        System.out.println(livingRoom.roomWallArea());

        livingRoom.noOfRolls();
        breakfastRoom.noOfRolls();
    }


}

