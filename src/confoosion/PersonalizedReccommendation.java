/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package confoosion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Comparator;

/**
 *
 * @author shelfinna
 */
public class PersonalizedReccommendation {
    private int minprice;
    private int maxprice;
    private int distance;
    private String type;
    private float time;
    
    Queue<Restaurant> queue = new LinkedList<>();
    
    Scanner s = new Scanner (System.in);
    
    public void setPreference(User user, ArrayList<Restaurant> restaurantList){
        int requirements =0;
        
        System.out.println("Price Range");
        System.out.print("Minimum price: ");
        minprice = s.nextInt();
        
        System.out.print("Maximum price: ");
        maxprice = s.nextInt();

        System.out.print("Distance from UC: ");
        distance = s.nextInt();
        
        System.out.println("What food are you craving?");
        System.out.println("Menu: ");
        System.out.println("Indonesian, Japanese, Western, Chinese");
        type = s.next();
        
        System.out.print("What time will you be eating: ");
        time = s.nextFloat();
        
        foodRecs(user, restaurantList);
         
    }
    
    public void foodRecs(User user, ArrayList<Restaurant> listrestaurant ){
        int requirements = 3;
        boolean check = false;
  
        System.out.println("length: " + listrestaurant.size());
        Collections.sort(listrestaurant, Comparator.comparingDouble(Restaurant::getDistance));

        
        while (check==false){
        int filled;
        if(user.getDietaryRestrictions()==2 || user.getDietaryRestrictions()==3){
        for (int i = 0; i < listrestaurant.size(); i++) {
            if (time >= listrestaurant.get(i).getOpenhours() && time <= listrestaurant.get(i).getClosedhours()) {
                if (listrestaurant.get(i).getDistance() <= distance) {
                    if(listrestaurant.get(i).getDietaryRestrictions() == user.getDietaryRestrictions()){
                        filled = 0;
                    if (listrestaurant.get(i).getFoodtype().equalsIgnoreCase(type)) {
                        filled++;
                    }
                    if (listrestaurant.get(i).getMinprice() >= minprice) {
                        filled++;
                    }
                    if (listrestaurant.get(i).getMaxprice() <= maxprice) {
                        filled++;
                    }
                    if (filled == requirements) {
                        queue.offer(listrestaurant.get(i));
                    }
                    }
                }
            }
        }
        } else {
            for (int i = 0; i < listrestaurant.size(); i++) {
            if (time >= listrestaurant.get(i).getOpenhours() && time <= listrestaurant.get(i).getClosedhours()) {
                if (listrestaurant.get(i).getDistance() <= distance) {
                    filled = 0;
                    if (listrestaurant.get(i).getFoodtype().equalsIgnoreCase(type)) {
                        filled++;
                    }
                    if (listrestaurant.get(i).getMinprice() >= minprice) {
                        filled++;
                    }
                    if (listrestaurant.get(i).getMaxprice() <= maxprice) {
                        filled++;
                    }
                    if (filled == requirements) {
                        queue.offer(listrestaurant.get(i));
                    }
                }
            }
        }
        }
        
        if(queue.isEmpty()){
            System.out.println("Seems like the resto in our data doesn't match your preferences, we will be recommend you something close to it.");
            requirements --;
            if (requirements == 0) {
                    System.out.println("None of the restaurants in our data fits your preferences.");
                    return;
                }
        } else {
            check = true;
        }
        
    }
        printList();
    }
    
   public void printList() {
    System.out.println("Restaurant Recommendation:");
    boolean next = false;
    do{
    if(!queue.isEmpty()){
         Restaurant element = queue.poll();
        element.displayDetails();
        System.out.println("Do you want other recommendation? (0: yes, 1: no) : ");
        int input = s.nextInt();
        if(input==0){
            next = true;
        } else {
            next = false;
            System.out.println("Rate the restaurant? (0: yes, 1: no)");
            int input2= s.nextInt();
            if(input2==0){
                System.out.print("Insert your rating (1-5 stars): ");
                int rate = s.nextInt();
                //blom error handling
                element.addRating(rate);
                System.out.print("Insert your reviews: ");
                String review =  s.next() + s.nextLine();
                element.addReview(review);
            }
        }
    } else {
        System.out.println("I'm sorry but that's it");
        next = false;
    }
    } while (next == true);
    
}
   
   public void printrestoall(ArrayList<Restaurant> listrestaurant){
       for (int i = 0; i < listrestaurant.size(); i++) {
             System.out.println((i+1) + " ." + listrestaurant.get(i).getName());
       }
   }

    
}
