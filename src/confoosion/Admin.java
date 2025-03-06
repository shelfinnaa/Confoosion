/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package confoosion;

import java.util.Scanner;

/**
 *
 * @author shelfinna
 */
public class Admin extends User {
    Restaurant restaurant;
    Scanner s = new Scanner (System.in);
    
    public Admin(String name, String password){
        super(name, password);
    }
    
    public void setRestaurant(Restaurant restaurant){
        this.restaurant = restaurant;
    }
    
    public Restaurant getRestaurant(){
        return restaurant;
    }
    
    public void UpdateRestaurantInfo (){
        System.out.println("What do you want to update?");
        System.out.println("1. Name");
        System.out.println("2. Foodtype");
        System.out.println("3. Open Hours");
        System.out.println("4. Closed Hours");
        System.out.println("5. Minimum Price");
        System.out.println("6. Maximum Price");
        System.out.println("7. Distance");
        System.out.println("8. Location");
        System.out.println("9. Dietary Restrictions");
        
        int input = s.nextInt();
        
        if(input==1){
            System.out.println("Current Name: " + restaurant.getName());
            String newName = s.next() + s.nextLine();
            restaurant.setName(newName);
        } else if (input==2){
            System.out.println("Current Foodtype: " + restaurant.getFoodtype());
            String foodType = s.next() + s.nextLine();
            restaurant.setFoodtype(foodType);
        } else if (input==3){
            System.out.println("Current Open Hours: " + restaurant.getOpenhours() + ".00");
            int newOpenHours = s.nextInt();
            restaurant.setOpenhours(newOpenHours);
        } else if (input==4){
            System.out.println("Current Closed Hours: " + restaurant.getClosedhours() + ".00");
            int newClosedHours = s.nextInt();
            restaurant.setClosedhours(newClosedHours);
        } else if (input==5){
            System.out.println("Current Minimum Price: Rp. " + restaurant.getMinprice() );
            int newMinPrice = s.nextInt();
            restaurant.setMinprice(newMinPrice);
        } else if (input==6){
            System.out.println("Current Maximum Price: Rp. " + restaurant.getMaxprice() );
             int newMaxPrice = s.nextInt();
            restaurant.setMaxprice(newMaxPrice);
        } else if (input==7){
            System.out.println("Current Distance: " + restaurant.getDistance() + " KM" );
            int newMinPrice = s.nextInt();
            restaurant.setMinprice(newMinPrice);
        } else if (input==8){
            System.out.println("Current Location: " + restaurant.getLocation() );
            String newLocation = s.next() + s.nextLine();
            restaurant.setLocation(newLocation);
        } else if(input==9){
             System.out.println("Current Dietary Restrictions: " + restaurant.getDietaryRestrictionsString() );
             System.out.println("Change to 1. Halal 2.Not Halal 3.Vegan");
             int diet = s.nextInt();
             //blom error handling klk input lbh dr 3
             restaurant.setDietaryRestrictions(diet);
        } else {
            System.out.println("Input not found");
        }
        
        Menu menu = new Menu();
        menu.updateRestaurantInfoInList(restaurant);
    }
    
    public void deleteMenu(){
        restaurant.deleteMenu();
    }
}
