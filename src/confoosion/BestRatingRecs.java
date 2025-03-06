/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package confoosion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author shelfinna
 */
public class BestRatingRecs {
    
    public void displaybestratingrecs(ArrayList<Restaurant> listrestaurant ){
            Collections.sort(listrestaurant, Comparator.comparing(Restaurant::getRating).reversed());
            ArrayList<Restaurant> firstThreeRestaurants = new ArrayList<>(listrestaurant.subList(0, Math.min(listrestaurant.size(), 3)));
            int i= 1;
            for (Restaurant restaurant : firstThreeRestaurants) {
                System.out.println(i + ". " );
                restaurant.displayDetails();
                i++;
        }
    }
    
    
}
