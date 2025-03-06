/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package confoosion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author shelfinna
 */
public class Restaurant {

    Scanner s = new Scanner(System.in);

    LinkedList<Food> menu = new LinkedList<Food>();
    LinkedList<String> review = new LinkedList<String>();
    LinkedList<Integer> rating = new LinkedList<Integer>();
    private String name;
    private String foodtype;
    private int openhours;
    private int closedhours;
    private int minprice;
    private int maxprice;
    private int distance;
    private String location;
    private int dietaryrestriction;

    public Restaurant(String foodtype, String name, int openhours, int closedhours, int minprice, int maxprice, int distance, String location, int dietaryrestriction) {
        this.name = name;
        this.foodtype = foodtype;
        this.openhours = openhours;
        this.closedhours = closedhours;
        this.minprice = minprice;
        this.maxprice = maxprice;
        this.distance = distance;
        this.location = location;
        this.dietaryrestriction = dietaryrestriction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoodtype() {
        return foodtype;
    }

    public void setFoodtype(String foodtype) {
        this.foodtype = foodtype;
    }

    public int getOpenhours() {
        return openhours;
    }

    public void setOpenhours(int openhours) {
        this.openhours = openhours;
    }

    public int getClosedhours() {
        return closedhours;
    }

    public void setClosedhours(int closedhours) {
        this.closedhours = closedhours;
    }

    public int getMinprice() {
        return minprice;
    }

    public void setMinprice(int minprice) {
        this.minprice = minprice;
    }

    public int getMaxprice() {
        return maxprice;
    }

    public void setMaxprice(int maxprice) {
        this.maxprice = maxprice;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getLocation() {
        return location;
    }

    public String getDietaryRestrictionsString() {
        if (dietaryrestriction == 3) {
            return "Vegan";
        } else if (dietaryrestriction == 2) {
            return "Not Halal";
        } else {
            return "Halal";
        }
    }

    public double getRating() {
        if (rating.isEmpty()) {
            return 4.0;
        } else {
            int sum = 0;
            for (int value : rating) {
                sum += value;
            }
            double ratingaverage = (double) sum / rating.size();
            return ratingaverage;
        }
    }

    public void displayreview() {
        if (rating.isEmpty()) {
            System.out.println("No reviews yet");
        } else {
            System.out.println("Reviews:");
            for (String r : review) {
                System.out.println("- " + r);
            }
        }
    }

    public void addRating(int a) {
        rating.add(a);
    }

    public void addReview(String a) {
        review.add(a);
    }

    public int getDietaryRestrictions() {
        return dietaryrestriction;
    }

    public void setDietaryRestrictions(int diet) {
        dietaryrestriction = diet;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void addFood(String name, int price) {
        Food food = new Food(name, price);
        menu.add(food);
    }

    public void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Ratings: " + getRating());
        System.out.println("Type of food: " + getFoodtype());
        System.out.println("Business hours: " + getOpenhours() + ".00 - " + getClosedhours() + ".00 ");
        System.out.println("Price range: " + getMinprice() + " - " + getMaxprice());
        System.out.println("Distance: " + getDistance() + " KM");
        System.out.println("Location: " + getLocation());
        System.out.println("Recommended Menu: ");
        for (int i = 0; i < menu.size(); i++) {
            System.out.print((i + 1) + ". ");
            menu.get(i).displayFoodDetails();
        }
        displayreview();
    }

    public void deleteMenu() {
        System.out.println("Recommended Menu: ");
        for (int i = 0; i < menu.size(); i++) {
            System.out.print((i + 1) + ". ");
            menu.get(i).displayFoodDetails();
        }
        System.out.println("Which one do you want to delete?");
        int del = s.nextInt();

        if (del > menu.size()) {
            System.out.println("No menu is found");
        } else {
            Food food = menu.get(del - 1);
            menu.remove(food);
            System.out.println("Deleted Successfully");
        }
    }

}
