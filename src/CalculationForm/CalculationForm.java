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

        List<Wall> walls = new ArrayList<>();
        walls.add(new Wall(440, 240));
        walls.add(new Wall(500, 240));
        walls.add(new Wall(440, 240));
        walls.add(new Wall(500, 240));
//        Wall wall1 = new Wall(440, 240);
//        Wall wall2 = new Wall(500, 240);
//        Wall wall3 = new Wall(440, 240);
//        Wall wall4 = new Wall(500, 240);

        Room livingRoom = new Room("Living Room", walls);
        System.out.println(livingRoom.toString());
//        Room breakfastRoom = new Room("Breakfast Room", 6);
    }



}
