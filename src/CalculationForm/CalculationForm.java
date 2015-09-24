package CalculationForm;

import Data.Wallpapers;
import Data.*;

/**
 * Created by leives01 on 21/09/15.
 */


public class CalculationForm {

    public static void main(String[] args){
        Wallpapers awningStripe = new Wallpapers(true, "Awning Stripe", 52, 0, 1010);
        Wallpapers countryRoses = new Wallpapers(true, "Country Roses", 51, 15, 1000);
        Wallpapers tropicalBirds = new Wallpapers(false, "Tropical Birds", 52, 60, 1000);
        Wallpapers polkaDot = new Wallpapers(true, "Polka Dot", 53, 3, 1050);

        Rooms livingRoom = new Rooms("Living Room", 4);
        Rooms breakfastRoom = new Rooms("Breakfast Room", 6);
    }



}
